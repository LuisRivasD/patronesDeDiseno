package componentes;
/**
 * Indica un tipo de combo Familiar,
 heredando de la clase padre Trabajador
 * @author chenao
 *
 */
public class GerenteRegional extends Trabajador
{
	
	public GerenteRegional(){
		descripcion="Gerente regional del Deutsche Post DHL";
	}

	@Override
	public int valor() {
		return 0;
	}

}
