package ex02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;




public class Controller implements Initializable{
	public Controller() {
		System.out.println("생성자 실행");
	}
	@FXML private Button btn;
	@FXML private TextField txtField;
	@FXML private TextField txtField2;
	
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("초기화 목적");
		btn.setOnAction(e->{
			txtPrint();
		});
	}
	public void txtPrint() {
		System.out.println(txtField.getText() );
		txtField2.setText(txtField.getText());
		txtField.setText("");
		
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setContentText("조심하세요");
		alert.show();
	}
	
}
