package fabricas;
import clases.Charlie;
import interfaces.Dibujo;
import interfaces.CreaDibujo;
import javax.swing.JOptionPane;
import clases.Lucy;
import clases.Snoopy;

public class DibujaSnoopy implements CreaDibujo
{

    @Override
    public Dibujo crearDibujo()
    {
        Snoopy C3 = new Snoopy();
        String cad = "", salida;
        cad += "Seleccione Color del Nuevo Dibujo\n\n";
        cad += "1. Violeta\n";
        cad += "2. Mostaza\n";
        cad += "3. Azul\n\n";
        try
        {
            do
            {
                try
                {
                    int opcion = Integer.parseInt(JOptionPane.showInputDialog(cad));
                    switch (opcion)
                    {
                        case 1:
                        C3.setColor("Bioleta");
                        break;
                        case 2:
                        C3.setColor("Mostaza");
                        break;
                        case 3:
                        C3.setColor("Azul");
                        break;
                        default:
                        JOptionPane.showMessageDialog(null, "No es un valor de consulta valido");
                        break;
                    }
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, "No es un parametro de consulta valido");
                }
                salida=JOptionPane.showInputDialog("Desea consultar otro codigo? S/N");
            }while (salida.toUpperCase().equals("S"));
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Goodbye");
        }

        JOptionPane.showMessageDialog(null, "Se ha dibujado a Snoopy");
        return C3;
    }
}
