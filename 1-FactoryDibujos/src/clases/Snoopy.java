package clases;
import interfaces.Dibujo;

import javax.swing.JOptionPane;

public class Snoopy implements Dibujo{
	
    private String Color;
	
	
	@Override
	
        public void ColorDeDibujo() {
		JOptionPane.showMessageDialog(null,"Snoopy se dibujó de color: "+getColor());
	}

  
    public String getColor() {
        return Color;
    }

  
    public void setColor(String Color) {
        this.Color = Color;
    }

    

}

