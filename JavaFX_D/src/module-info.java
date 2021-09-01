module JavaFX_D {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
