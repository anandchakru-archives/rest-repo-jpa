package com.anandchakru.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.anandchakru.app.config.Cifi3Config;

@SpringBootApplication
public class SJpaInitializer {
	private static final Logger logger = LoggerFactory.getLogger("com.anandchakru.app.SJpaInitializer");

	public static void main(String[] args) throws Exception {
		for (String arg : args) {
			System.out.println("SJpaInitializer arg:" + arg);
		}
		SpringApplication.run(Cifi3Config.class, args);
		logger.debug("Initialized SJpaInitializer.");
	}
}