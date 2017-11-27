package application;

import javafx.fxml.FXML;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;

public class BlurController {
	
	@FXML
    private ImageView imageView;   
	private Ellipse ellipse;
	private Circle circle;

	
	@FXML
    public void setclip() {  
		
        ellipse = new Ellipse();
        ellipse.centerXProperty().setValue(95);
        ellipse.centerYProperty().setValue(70);
        ellipse.radiusXProperty().setValue(70);
        ellipse.radiusYProperty().setValue(70);        
        imageView.setClip(ellipse);
    }

	@FXML
    public void setblur() {           
        imageView.setEffect(new GaussianBlur(10));
    }
	
	@FXML
	private void handleClose() {
	
	    System.exit(0);
	}
	
}
