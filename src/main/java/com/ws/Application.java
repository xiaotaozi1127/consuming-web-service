package com.ws;

import com.fasterxml.jackson.databind.ObjectMapper;
import hello.wsdl.GetCountryResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  CommandLineRunner lookup(CountryClient countryClient) {
    return args -> {
      String country = "Spain";

      if (args.length > 0) {
        country = args[0];
      }

      ObjectMapper mapper = new ObjectMapper();
      GetCountryResponse response = countryClient.getCountry(country);
      System.err.println(mapper.writeValueAsString(response.getCountry()));
    };
  }
}
