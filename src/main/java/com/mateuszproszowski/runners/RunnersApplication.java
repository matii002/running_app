package com.mateuszproszowski.runners;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class RunnersApplication {
	private static final Logger log = LoggerFactory.getLogger(RunnersApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RunnersApplication.class,args);
	}
}
