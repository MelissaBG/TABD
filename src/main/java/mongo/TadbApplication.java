package mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TadbApplication {

	public static void main(String[] args) {

		try {
			SpringApplication.run(TadbApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
