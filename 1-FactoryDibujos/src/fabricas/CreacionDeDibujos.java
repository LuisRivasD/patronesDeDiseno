package fabricas;

import interfaces.Dibujo;
import interfaces.CreaDibujo;


public class CreacionDeDibujos {
	
	public static void crearFabricaDeDibujos(CreaDibujo D1)
	{
		Dibujo Dib= D1.crearDibujo();
		Dib.ColorDeDibujo();
                
	}

}
