module com.example.mydiscgolfbag {
	requires javafx.controls;
	requires javafx.fxml;
	requires org.hibernate.orm.core;
	requires jakarta.persistence;
	requires java.naming;


	opens com.example.mydiscgolfbag to javafx.fxml;
	exports com.example.mydiscgolfbag;
}