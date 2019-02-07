package decoradores;
import componentes.Trabajador;


/**
 * (Decorator)
 * Clase abstracta de los productos adicionales,
 * cuenta con una descripcion del producto
 * @author chenao
 *
 */
public abstract class InfoTrabajador extends Trabajador{

	public abstract String getDescripcion();
}
