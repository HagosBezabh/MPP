package javafxaddressform;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class FormController {
	public TextField nameField;
	public TextField stField;
	public TextField cityField;
	public TextField stateField;
	public TextField zipField;
	
	public Label lbl;
	
	public Button btn;
	public void handle(ActionEvent event) {  
		
		if(event.getSource()==btn){
			lbl.setText(nameField.getText()+"\n"+stField.getText()+"\n"+
		        	""+cityField.getText()+" "+stateField.getText()+" "+zipField.getText());
		}
			
	// System.out.println("login....");

}


}



	

