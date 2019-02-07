package decoradores;
import componentes.Trabajador;


/**
 * (Decorator Concreto)
 clase InfoAdministrador, siendo esta un adicional,
 cuenta con una descripcion y un precio
 * @author chenao
 *
 */
public class InfoAdministrador extends InfoTrabajador{

	Trabajador combo;
	
	public InfoAdministrador(Trabajador combo)
	{
		this.combo=combo;	
	}
	
	@Override
	public String getDescripcion() {
		return combo.getDescripcion()+": Debe encargarse de que las labores a nivel de oficina local se desempeñen de forma correcta para el Deutsche Post DHL";
	}

	@Override
	public int valor() {
		return 50000+combo.valor();
	}
}
