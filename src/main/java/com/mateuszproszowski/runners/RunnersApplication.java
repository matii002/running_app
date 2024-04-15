package com.mateuszproszowski.runners;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication//aby umożliwic automatyczną konfigurację
public class RunnersApplication {
	//pobranie loggera - rejestratora dla klasy RunnersApplication.class
	private static final Logger log = LoggerFactory.getLogger(RunnersApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RunnersApplication.class,args);
	}
	/*@Bean//dowolne obiekty zarządzane  przez kontroler Spirnga
	//wywoła metodę uruchamiania wszystkich komponentów bean implementujących ten interfejs po załadowaniu kontekstu aplikacji
	CommandLineRunner runner(){//uruchamia się po uruchomieniu aplikacji
		return args ->{//przekaż parametr args i zwróć wartość
			Run run = new Run(1,"Pierwszy bieg", LocalDateTime.now(),LocalDateTime.now().plus(1, ChronoUnit.HOURS),1, Location.OUTDOOR);
			log.info("Run: " + run);
		};
	}*/
	//CommandLineRunner implementowany jest za pomocą wtrażeni lambda
}
