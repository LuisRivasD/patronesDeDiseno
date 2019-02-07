package principal;
import javax.swing.JOptionPane;
import fabricas.DibujaLucy;
import fabricas.CreacionDeDibujos;
import fabricas.DibujaSnoopy;
import fabricas.DibujaCharlie;

public class Principal
{
    public static void main(String[] args) 
    {
        DibujaLucy C1=new DibujaLucy();
        DibujaSnoopy C2=new DibujaSnoopy();
        DibujaCharlie C3=new DibujaCharlie();
        String cad="",salida;
        cad+="Ingrese la opcion para crear un nuevo dibujo\n\n";
        cad+="1. Dibuja Lucy\n";
        cad+="2. Dibuja Snoopy\n";
        cad+="3. Dibuja Charlie\n\n";
        try
        {
            do
            {
                try 
                {
                    int opcion=Integer.parseInt(JOptionPane.showInputDialog(cad));
                    switch (opcion)
                    {
                        case 1: CreacionDeDibujos.crearFabricaDeDibujos(C1);
                        break;
                        case 2: CreacionDeDibujos.crearFabricaDeDibujos(C2);
                        break;
                        case 3: CreacionDeDibujos.crearFabricaDeDibujos(C3);
                        break;    
                        default: JOptionPane.showMessageDialog(null,"No es un valor de consulta valido");
                        break;
                    }
                }catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null,"No es un parametro de consulta valido");
                }
                salida=JOptionPane.showInputDialog("Desea consultar otro codigo? S/N");

            }while (salida.toUpperCase().equals("S"));
        }catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Bye!!!");
        }
    }
}