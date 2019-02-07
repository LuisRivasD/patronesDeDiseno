package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import componentes.Trabajador;
import componentes.CEO;
import componentes.COO;
import componentes.GerenteRegional;
import componentes.Administrador;
import componentes.Courier;
import componentes.EjecutivoDeVentas;
import decoradores.InfoAdministrador;
import decoradores.InfoCOO;
import decoradores.InfoGerenteRegional;
import decoradores.InfoCourier;
import decoradores.InfoCEO;
import decoradores.InfoEjecutivoDeVentas;

/**
 * Clase GUI, es la ventana interfaz de 
 * usuario, en la que se permite la seleccion de
 * un combo y el calculo de su valor con o sin adicionales
 * @author chenao
 *
 */
public class VentanaMenu extends JFrame implements ActionListener{
	
	JLabel titulo,adicionales;
	JComboBox combos;
	String arregloCombos[] = { "Seleccione","CEO", 
			"COO", "Gerente Regional", "Administrador", "Courier", "Ejecutivo de Ventas" };
	JTextArea area;
	private JScrollPane scroll;
	JTextArea area2;
	private JScrollPane scroll2;
	JButton aceptar,cancelar;
	JCheckBox ceo,coo,gerente,admin,ejecutivo, courier;
	
	public VentanaMenu()
	{
	  ceo= new JCheckBox();
	  ceo.setText("CEO");
	  ceo.setBounds(200, 30, 150, 25);
	  ceo.setEnabled(false);
	  
	  coo= new JCheckBox();
	  coo.setText("COO");
	  coo.setBounds(350, 30, 150, 25);
	  coo.setEnabled(false);
		
	  gerente= new JCheckBox();
	  gerente.setText("Gerente Regional");
	  gerente.setBounds(200, 50, 150, 25);
	  gerente.setEnabled(false);
	  
	  admin= new JCheckBox();
	  admin.setText("Administrador");
	  admin.setBounds(350, 50, 150, 25);
	  admin.setEnabled(false);
          
          courier = new JCheckBox();
	  courier.setText("Courier");
	  courier.setBounds(200, 70, 150, 25);
	  courier.setEnabled(false);
          
          ejecutivo = new JCheckBox();
	  ejecutivo.setText("Ejecutivo de Venta");
	  ejecutivo.setBounds(350, 70, 150, 25);
	  ejecutivo.setEnabled(false);
	  
	  aceptar=new JButton();
	  aceptar.setText("Buscar");
	  aceptar.setBounds(70, 400, 150, 25);
	  
	  cancelar=new JButton();
	  cancelar.setText("Salir");
	  cancelar.setBounds(230, 400, 150, 25);
		
	  titulo= new JLabel();
	  titulo.setText("MENU PUESTOS DHL");
	  titulo.setBounds(20, 10, 150, 25);
	  
	  adicionales= new JLabel();
	  adicionales.setText("Seleccione puesto");
	  adicionales.setBounds(195, 10, 180, 25);
	  
	  combos= new JComboBox();
	  combos.setBounds(20, 40, 150, 25);
	  combos.setModel(new javax.swing.DefaultComboBoxModel(arregloCombos));
	  combos.addActionListener(this);
	  
	  scroll = new JScrollPane();
	  area = new JTextArea();
		area.setEditable(false);
		area.setFont(new java.awt.Font("Verdana", 0, 12));
		area.setLineWrap(true);
		area.setWrapStyleWord(true);
		area.setBorder(javax.swing.BorderFactory.createBevelBorder(
				javax.swing.border.BevelBorder.LOWERED, null, null, null,
				new java.awt.Color(0, 0, 0)));
		scroll.setViewportView(area);
		scroll.setBounds(20, 130, 450, 60);
		
		scroll2 = new JScrollPane();
		  area2 = new JTextArea();
			area2.setEditable(false);
			area2.setFont(new java.awt.Font("Verdana", 0, 12));
			area2.setLineWrap(true);
			area2.setWrapStyleWord(true);
			area2.setBorder(javax.swing.BorderFactory.createBevelBorder(
					javax.swing.border.BevelBorder.LOWERED, null, null, null,
					new java.awt.Color(0, 0, 0)));
			scroll2.setViewportView(area2);
			scroll2.setBounds(20, 190, 450, 160);
	 
			
	  combos.addActionListener(this);
	  aceptar.addActionListener(this);
	  cancelar.addActionListener(this);
	  ceo.addActionListener(this);
	  admin.addActionListener(this);
	  gerente.addActionListener(this);
	  coo.addActionListener(this);
          ejecutivo.addActionListener(this);
          courier.addActionListener(this);

	  add(admin);		
	  add(gerente);
	  add(coo);		
	  add(ceo);
          add(ejecutivo);
          add(courier);
	  add(cancelar);
	  add(aceptar);
	  add(scroll);
	  add(scroll2);
	  add(adicionales);
	  add(titulo);
	  add(combos);
	  
	  setSize(500,500);
	  setTitle("Patron Decorator");
	  setLocationRelativeTo(null);
	  setLayout(null);

	}



	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource()==aceptar)
		{
			if (combos.getSelectedIndex()==1) 
			{
				Trabajador comboBasico=new CEO();
				area.setText(comboBasico.getDescripcion());
				enviarPedido(comboBasico);
			}
			else if (combos.getSelectedIndex()==2) 
			{
				Trabajador comboFamiliar=new GerenteRegional();
				area.setText(comboFamiliar.getDescripcion());
				enviarPedido(comboFamiliar);
			}
			else if (combos.getSelectedIndex()==3) 
			{
				Trabajador comboEspecial=new COO();
				area.setText(comboEspecial.getDescripcion());
				enviarPedido(comboEspecial);
			}
                        else if (combos.getSelectedIndex()==4) 
			{
				Trabajador comboFriendzone=new Administrador();
				area.setText(comboFriendzone.getDescripcion());
				enviarPedido(comboFriendzone);
			}
                        else if (combos.getSelectedIndex()==5) 
			{
				Trabajador comboJumbo=new Courier();
				area.setText(comboJumbo.getDescripcion());
				enviarPedido(comboJumbo);
			}
                        
                        else if (combos.getSelectedIndex()==6) 
			{
				Trabajador comboJumbo=new EjecutivoDeVentas();
				area.setText(comboJumbo.getDescripcion());
				enviarPedido(comboJumbo);
			}
			else{
				JOptionPane.showMessageDialog(null, "No ha realizado " +
						"ningun pedido","Advertencia!!!",JOptionPane.WARNING_MESSAGE);
			}
		}
		if (e.getSource()==cancelar)
		{
			System.exit(0);
		}
		if (e.getSource()==combos)
		{
			verificaSeleccion();
			
		}
	}

	/**
	 * Aplicamos conceptos de polimorfismo para definir
	 * la porcion del combo seleccinado y luego
	 * se envia al area2 correspondiente a la del envio
	 * definido por el usuario
	 * @param combo
	 */
	private void enviarPedido(Trabajador combo)
	{
			if (admin.isSelected())
			{
				combo=new InfoAdministrador(combo);
			}
			if (gerente.isSelected())
			{
				combo=new InfoGerenteRegional(combo);
			}
			if (coo.isSelected())
			{
				combo=new InfoCOO(combo);
			}
			if (ceo.isSelected())
			{
				combo=new InfoCEO(combo);
			}
                        if (courier.isSelected())
			{
				combo=new InfoCourier(combo);
			}
                        if (ejecutivo.isSelected())
			{
				combo=new InfoEjecutivoDeVentas(combo);
			}
                        
		area2.setText("Detalles: \n"+combo.getDescripcion()+"\n\n" +
				"Salario:\n $"+combo.valor());	
	}

	/**
	 * Valida la seleccion realizada y envia la correspondiente
	 * descripcion al area de texto
	 */
	private void verificaSeleccion() {
		if (combos.getSelectedIndex()!=0)
		{
			//habilitar(true);
			if (combos.getSelectedIndex()==1) 
			{habilitarCEO(true);
				area.setText("Chief Executive Officer del Deutsche Post DHL");
				area2.setText("");
			}
			else if (combos.getSelectedIndex()==2) 
			{habilitarCOO(true);
				area.setText("Chief Operating Officer del Deutsche Post DHL");
				area2.setText("");
			}
			else if (combos.getSelectedIndex()==3) 
			{habilitarGerente(true);
				area.setText("Gerente regional del Deutsche Post DHL");
				area2.setText("");
			}
                        else if (combos.getSelectedIndex()==4) 
			{habilitarAdmin(true);
				area.setText("Puesto a nivel de oficina local del Deutsche Post DHL");
				area2.setText("");
			}
                        else if (combos.getSelectedIndex()==5) 
			{habilitarCourier(true);
				area.setText("Repartidor del Deutsche Post DHL");
				area2.setText("");
			}
                        else if (combos.getSelectedIndex()==6) 
			{habilitarEjecutivo(true);
				area.setText("Primera linea de trato con los clientes del Deutsche Post DHL");
				area2.setText("");
			}
			
		}
		else{
			area.setText("");
			area2.setText("");
			habilitarCEO(false);
                        habilitarCOO(false);
                        habilitarGerente(false);
                        habilitarAdmin(false);
                        habilitarCourier(false);
                        habilitarEjecutivo(false);
                        
		}
			
	}



	private void habilitarCEO(boolean b) 
	{
		ceo.setEnabled(true);
                coo.setEnabled(true);
                gerente.setEnabled(true);
		admin.setEnabled(true);
                courier.setEnabled(true);
                ejecutivo.setEnabled(true);
                
		ceo.setSelected(true);
                coo.setSelected(false);
                gerente.setSelected(false);
		admin.setSelected(false);
                courier.setSelected(false);
                ejecutivo.setSelected(false);
	}
        
        private void habilitarCOO(boolean b) 
	{
		ceo.setEnabled(false);
                coo.setEnabled(true);
                gerente.setEnabled(true);
		admin.setEnabled(true);
                courier.setEnabled(true);
                ejecutivo.setEnabled(true);
                
		ceo.setSelected(false);
                coo.setSelected(true);
                gerente.setSelected(false);
		admin.setSelected(false);
                courier.setSelected(false);
                ejecutivo.setSelected(false);
	}
        private void habilitarGerente(boolean b) 
	{
		ceo.setEnabled(false);
                coo.setEnabled(false);
                gerente.setEnabled(true);
		admin.setEnabled(true);
                courier.setEnabled(true);
                ejecutivo.setEnabled(true);
                
		ceo.setSelected(false);
                coo.setSelected(false);
                gerente.setSelected(true);
		admin.setSelected(false);
                courier.setSelected(false);
                ejecutivo.setSelected(false);
	}
        private void habilitarAdmin(boolean b) 
	{
		ceo.setEnabled(false);
                coo.setEnabled(false);
                gerente.setEnabled(false);
		admin.setEnabled(true);
                courier.setEnabled(true);
                ejecutivo.setEnabled(true);
                
		ceo.setSelected(false);
                coo.setSelected(false);
                gerente.setSelected(false);
		admin.setSelected(true);
                courier.setSelected(false);
                ejecutivo.setSelected(false);
	}
        private void habilitarCourier(boolean b) 
	{
		ceo.setEnabled(false);
                coo.setEnabled(false);
                gerente.setEnabled(false);
		admin.setEnabled(false);
                courier.setEnabled(true);
                ejecutivo.setEnabled(true);
                
		ceo.setSelected(false);
                coo.setSelected(false);
                gerente.setSelected(false);
		admin.setSelected(false);
                courier.setSelected(true);
                ejecutivo.setSelected(false);
	}
        private void habilitarEjecutivo(boolean b) 
	{
		ceo.setEnabled(false);
                coo.setEnabled(false);
                gerente.setEnabled(false);
		admin.setEnabled(false);
                courier.setEnabled(false);
                ejecutivo.setEnabled(true);
                
		ceo.setSelected(false);
                coo.setSelected(false);
                gerente.setSelected(false);
		admin.setSelected(false);
                courier.setSelected(false);
                ejecutivo.setSelected(true);
	}
        
}