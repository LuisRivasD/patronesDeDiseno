package decoradores;
import componentes.Trabajador;

/**
 * (Decorator Concreto)
 * clase tomate, siendo esta un adicional, 
 * cuenta con una descripcion y un precio
 * @author chenao
 *
 */
public class InfoCourier extends InfoTrabajador{

	Trabajador combo;
	
	public InfoCourier(Trabajador combo)
	{
		this.combo=combo;
	}

	
	@Override
	public String getDescripcion() {
		return combo.getDescripcion()+"Su labor es el corazón del Deutsche Post DHL al ser el encargado de recojer y manejar paquetes";
	}

	@Override
	public int valor() {
		return 6500+combo.valor();
	}

}
