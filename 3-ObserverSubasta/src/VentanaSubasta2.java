import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
import javax.swing.*;
/*
 * Clase Observer que simula una subasta creada para la asignatura de
 * Arquitectura de Software, impartida por el Dr. Giner Alor Hernandez
 * en el Instituto Tecnológico de Orizaba
 */

/*
 * @author luisrivas
 */

public class VentanaSubasta2 extends JFrame implements Observer, ActionListener
{   
    //Variables de JLabel para pintar información
    JLabel titulo,color, precioOferta, ultimaOferta ,mensajeIngresa,mensajeUltimaOfertaIngresada,mensajeFinOferta,ganador,logoEbay, logoItem, horaInicio, horaFin, cronometro, aumentoOferta,cabezaOferta;
    //Variable de JTextField para ingresar oferta
    JTextField ofertaIngresada3;
    //Variable que almacena valores de Observador
    ClaseObservadorSubasta miObservador;
    //Variable que almacena mensaje que se pinta
    String oferta;
    //Valor de oferta inicial
    int almacenOferta = 500;
    //Variable que almacena la hora de inicio, esta se usa para detener la subasta
    long startTime = System.currentTimeMillis();
    //Variable que almacena la hora actual
    LocalDateTime currentTime = LocalDateTime.now();
    //Variable que almacena la hora actual + 2 minutos despues
    LocalDateTime oneMinutesForward = currentTime.plusMinutes(1); 
    //Variable que aplica formato a la fecha
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd-MM-yyy");
    //Variable que parsea la hora actual con formato a String
    String formattedCurrentTime = currentTime.format(formatter);
    //Variable que parsea la hora actual + 2 minutos con formato a String
    String formattedTwoMinutesForward = oneMinutesForward.format(formatter);
    //Variable que permite crear un timer
    java.util.Timer timer;
    //ID que permite saber que ventana ha hecho la ultima oferta
    String idVentana="null";
    boolean boolCro = true;
    
    public VentanaSubasta2(ClaseObservadorSubasta observador)
    {
        
        //Color de fondo
        getContentPane().setBackground(Color.white);
        //Variable de observador
        miObservador=observador;
        miObservador.setVentanaAction("0");
        //Label que pinta logo
        logoEbay= new JLabel();
        logoEbay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ebay.png")));
        logoEbay.setBounds(0, 20, 195, 49);
        //Label que pinta item
        logoItem= new JLabel();
        logoItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/commodore.jpg")));
        logoItem.setBounds(10, 50, 500, 283);
        //Label que pinta titulo
        titulo= new JLabel();
        titulo.setText("(Ventana SUBASTA 2)");
        titulo.setBounds(200, 30, 150, 25);
        //Label que pinta hora inicio de subasta
        horaInicio= new JLabel();
        horaInicio.setText("Fecha Inicio Subasta: "+formattedCurrentTime);
        horaInicio.setBounds(20, 340, 400, 25);
        //Label que pinta hora fin de subasta
        horaFin= new JLabel();
        horaFin.setText("Fecha Fin Subasta:     "+formattedTwoMinutesForward);
        horaFin.setBounds(20, 360, 400, 25);
        //Label que muestra un cronometro
        cronometro= new JLabel();
        cronometro.setBounds(20, 380, 400, 25);
        //Label que pinta oferta
        precioOferta = new JLabel();
        precioOferta.setText("Precio inicial: $"+almacenOferta);
        precioOferta.setBounds(20, 400, 400, 25);
        //Label que pinta fecha ultima oferta
        ultimaOferta = new JLabel();
        ultimaOferta.setBounds(20, 420, 1500, 25);
        //Label titulo de TextField
        mensajeIngresa = new JLabel();
        mensajeIngresa.setText("Ingresa tu oferta:");
        mensajeIngresa.setBounds(20, 440, 400, 25);
        //TextField para ingresar oferta
        ofertaIngresada3 = new JTextField();
        ofertaIngresada3.setBounds(20, 460, 400, 25);
        ofertaIngresada3.addActionListener(this);
        ofertaIngresada3.setActionCommand("2");
        //Label que se muestra al ganador
        aumentoOferta = new JLabel();
        aumentoOferta.setBounds(20, 480, 400, 25);
        aumentoOferta.setText("");
        //Label que muestra el valor de la ultima oferta ingresada por la ventana
        mensajeUltimaOfertaIngresada = new JLabel();
        mensajeUltimaOfertaIngresada.setBounds(20, 500, 400, 25);
        //Label que muestra el valor de la ultima oferta ingresada por la ventana
        cabezaOferta = new JLabel();
        cabezaOferta.setBounds(20, 520, 400, 25);
        //Label que indica fin de subasta
        mensajeFinOferta = new JLabel();
        mensajeFinOferta.setBounds(20, 540, 400, 25);
        mensajeFinOferta.setText("");
        //Label que se muestra al ganador
        ganador = new JLabel();
        ganador.setBounds(20, 560, 400, 25);
        ganador.setText("");
        //añadimos labels a frame
        add(titulo);
        add(precioOferta);
        add(ultimaOferta);
        add(logoEbay);
        add(logoItem);
        add(mensajeIngresa);
        add(ofertaIngresada3);
        add(mensajeUltimaOfertaIngresada);
        add(mensajeFinOferta);
        add(ganador);
        add(horaInicio);
        add(horaFin);
        add(cronometro);
        add(aumentoOferta);
        add(cabezaOferta);
        //Definimos tamaño del frame
        setSize(500,640);
        setTitle("Ventana SUBASTA 2");
        setLocation(500, 160);
        setLayout(null);
        setVisible(true);
        //Creación de timer para llevar control de inicio y fin de subasta
        timer = new java.util.Timer();
        long interval = (1000) ; // 1 sec
        timer.schedule( new TimerTask()
        {
            public void run()
            {  
                if(miObservador.getVentanaAction().equals("2"))
                {
                    cabezaOferta.setText("Vas ganando");
                }
                else
                {
                    if(!aumentoOferta.getText().equals(""))
                    {
                       switch(idVentana){
                        case "1":
                            //aumentoOferta.setText("");
                            cabezaOferta.setText("El cliente 1 ha superado tu oferta");
                            break;
                        case "3":
                            cabezaOferta.setText("El cliente 3 ha superado tu oferta");
                            break;
                        } 
                    } 
                }
                cronometro.setText("Tiempo restante: 00:00:"+(60-(System.currentTimeMillis()- startTime)/1000));
                if((System.currentTimeMillis()- startTime)/1000==60)
                {   
                    timer.cancel();
                    cronometro.setText("Tiempo restante: 00:00:00");
                    ofertaIngresada3.setEditable(false);
                    mensajeFinOferta.setText("Ha finalizado la subasta");   
                    switch(idVentana){
                        case "1":
                            ganador.setText("El cliente 1 ha ganado el item :(");
                            break;
                        case "2":
                            ganador.setText("¡Felicidades, haz ganado la Commodore 64!");
                            
                            break;
                        case "3":
                            ganador.setText("El cliente 3 ha ganado el item :(");
                            break;
                    }
                }
            }
        }, 0, interval); 

    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        miObservador.setCantidadOfertada(Integer.parseInt(ofertaIngresada3.getText()));
        miObservador.setVentanaAction(e.getActionCommand());
        aumentoOferta.setText("Haz aumentado la subasta por:$"+ofertaIngresada3.getText());
        mensajeUltimaOfertaIngresada.setText("El valor de tu ultima oferta fué: $"+almacenOferta);
        ofertaIngresada3.setText("");     
        
    }
    
    @Override
    public void update(Observable arg0, Object arg1) 
    {   //Variable que almacena el id de la ventana y lo actualiza
        idVentana=miObservador.getVentanaAction();
        //Fecha y hora de oferta
        DateTimeFormatter formatter =
        DateTimeFormatter.ofLocalizedDateTime( FormatStyle.LONG ).withLocale( Locale.CANADA ).withZone( ZoneId.systemDefault() );
        Instant instant = Instant.now();
        String fechaOferta = formatter.format( instant );
        //Variable int que almacena y suma las ofertas
        almacenOferta+= miObservador.getCantidadOfertada();
        //Variable String que almacena un mensaje y la suma de  las ofertas
        oferta="Oferta mas alta: $"+ Integer.toString(almacenOferta);
        //Se actualiza el precio sobre la etiqueta precioOferta
        precioOferta.setText(oferta);  
        //Se actualiza fecha de oferta mas reciente
        ultimaOferta.setText("Fecha de oferta mas reciente: "+fechaOferta);
        
    }

}
