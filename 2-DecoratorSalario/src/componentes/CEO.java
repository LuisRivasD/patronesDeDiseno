package componentes;

/**
 * Indica un tipo de combo basico, 
 heredando de la clase padre Trabajador
 * @author chenao
 *
 */
public class CEO extends Trabajador{

	public CEO() {
		descripcion="Chief Executive Officer del Deutsche Post DHL";
	}
	
	@Override
	public int valor() {
		return 0;
	}
}
