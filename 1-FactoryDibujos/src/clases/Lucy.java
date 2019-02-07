package clases;
import interfaces.Dibujo;

import javax.swing.JOptionPane;

public class Lucy implements Dibujo{
	
    private String Color;
	
	
	@Override
	
        public void ColorDeDibujo() {
		JOptionPane.showMessageDialog(null,"Lucy se dibujó de color: "+getColor());
	}

  
    public String getColor() {
        return Color;
    }

  
    public void setColor(String Color) {
        this.Color = Color;
    }

    

}

