package decoradores;
import componentes.Trabajador;

/**
 * (Decorator Concreto)
 * clase queso, siendo esta un adicional, 
 * cuenta con una descripcion y un precio
 * @author chenao
 *
 */
public class InfoGerenteRegional extends InfoTrabajador{

	Trabajador combo;
	
	public InfoGerenteRegional(Trabajador combo)
	{
		this.combo=combo;	
	}
	
	@Override
	public String getDescripcion() {
		return combo.getDescripcion()+": Su cargo consta de lidiar con las diligencias correspondientes de cada región sobre la que opera el Deutsche Post DHL";
	}

	@Override
	public int valor() {
		return 100000+combo.valor();
	}

}