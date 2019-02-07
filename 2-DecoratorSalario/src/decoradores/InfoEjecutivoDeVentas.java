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
public class InfoEjecutivoDeVentas extends InfoTrabajador{
    
    Trabajador combo;
	
	public InfoEjecutivoDeVentas(Trabajador combo)
	{
		this.combo=combo;
	}

	
	@Override
	public String getDescripcion() {
		return combo.getDescripcion()+": Debe proveer la mejor atención al cliente minorista del Deutsche Post DHL";
	}

	@Override
	public int valor() {
		return 4500+combo.valor();
	}
}
