/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoradores;

import componentes.Trabajador;

/**
 *
 * @author luisrivas
 */
public class InfoCEO extends InfoTrabajador{

    Trabajador combo;
	
	public InfoCEO(Trabajador combo)
	{
		this.combo=combo;	
	}
	
	@Override
	public String getDescripcion() {
		return combo.getDescripcion()+": Puesto máximo dentro del Deutsche Post, su posición le otorga el máximo privilegio dentro de la empresa";
	}

	@Override
	public int valor() {
		return 650000+combo.valor();
	}
    
}
