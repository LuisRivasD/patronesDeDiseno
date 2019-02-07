
/**
 * Clase principal del aplicativo, se establecen las instancias
 * entre las clases y el patron observer
 * @author chenaoORIGINAL
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{   
                ClaseObservadorSubasta observador=new ClaseObservadorSubasta();
                VentanaSubasta1 miVentanaSubasta1 = new VentanaSubasta1(observador);
                VentanaSubasta2 miVentanaSubasta2 = new VentanaSubasta2(observador);
                VentanaSubasta3 miVentanaSubasta3 = new VentanaSubasta3(observador);
                
		/*Aqui se Agregan los observadores*/
                observador.addObserver(miVentanaSubasta1);
                observador.addObserver(miVentanaSubasta2);
                observador.addObserver(miVentanaSubasta3);
	}
}
