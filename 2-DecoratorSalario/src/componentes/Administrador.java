/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

/**
 *
 * @author luisrivas
 */
public class Administrador extends Trabajador {
    
    public Administrador(){
		descripcion="Puesto a nivel de oficina local del Deutsche Post DHL";
	}

	@Override
	public int valor() {
		return 0;
	}
    
}
