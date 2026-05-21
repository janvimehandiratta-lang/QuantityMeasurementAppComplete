package com.app.quantitymeasurement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
		"QuantityMeasurementApp",
		"com.app.quantitymeasurement"
})
@EntityScan("com.app.quantitymeasurement.entity")
@EnableJpaRepositories("com.app.quantitymeasurement.repository")
public class MeasurementApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeasurementApplication.class, args);
	}
}