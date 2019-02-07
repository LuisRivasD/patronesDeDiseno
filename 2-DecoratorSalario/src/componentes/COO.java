package componentes;
/**
 * Indica un tipo de combo Especial, 
 heredando de la clase padre Trabajador
 * @author chenao
 *
 */
public class COO extends Trabajador{

	public COO()
	{
		descripcion="Chief Operating Officer del Deutsche Post DHL";
	}
	
	@Override
	public int valor() {
		return 0;
	}
	
	
}
