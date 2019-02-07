package decoradores;
import componentes.Trabajador;

/**
 * (Decorator Concreto)
 * clase papas, siendo esta un adicional, cuenta 
 * con una descripcion y un precio
 * @author chenao
 *
 */
public class InfoCOO extends InfoTrabajador{

	Trabajador combo;
	
	public InfoCOO(Trabajador combo)
	{
		this.combo=combo;	
	}
	
	@Override
	public String getDescripcion() {
		return combo.getDescripcion()+": Persona encargada de las tareas administrativas del rango mas alto del Deutsche Post DHL";
	}

	@Override
	public int valor() {
		return 500000+combo.valor();
	}

}