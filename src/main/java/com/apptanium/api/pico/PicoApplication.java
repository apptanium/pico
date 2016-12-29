package com.apptanium.api.pico;

import com.apptanium.api.pico.db.PicoDB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class PicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicoApplication.class, args);
	}


  @Bean
  @Scope("singleton")
  public PicoDB getPicoDB() {
    return new PicoDB();
  }
}
