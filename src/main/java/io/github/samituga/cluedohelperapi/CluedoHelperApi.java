package io.github.samituga.cluedohelperapi;

import io.github.samituga.cluedohelperapi.config.LibraryConfigurationReference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Cluedo helper API.
 */
@SpringBootApplication
@Import(LibraryConfigurationReference.class)
public class CluedoHelperApi {

  public static void main(String[] args) {
    SpringApplication.run(CluedoHelperApi.class, args);
  }

}