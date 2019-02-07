
import java.util.Observable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisrivas
 */
public class ClaseObservadorSubasta extends Observable{
    
        private int cantidadOfertada;
        private String ultimaVentana;

	
	public ClaseObservadorSubasta(){
		
	}
		
        public void setCantidadOfertada (int i) {
            this.cantidadOfertada = i;
            //setChanged();
            //notifyObservers();
        }
        
        public int getCantidadOfertada (){
            return cantidadOfertada;
        }
        
        public void setVentanaAction (String ventana){
            this.ultimaVentana = ventana;
            setChanged(); 
            notifyObservers();
        }
        
        public String getVentanaAction (){
            return ultimaVentana;
        }  
}
