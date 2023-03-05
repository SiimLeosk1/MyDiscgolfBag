module com.example.mydiscgolfbag {
	requires javafx.controls;
	requires javafx.fxml;


	opens com.example.mydiscgolfbag to javafx.fxml;
	exports com.example.mydiscgolfbag;
}