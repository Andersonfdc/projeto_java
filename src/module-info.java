module projeto_java {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
