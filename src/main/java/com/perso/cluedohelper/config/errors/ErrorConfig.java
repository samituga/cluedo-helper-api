package com.perso.cluedohelper.config.errors;

import com.perso.cluedohelper.config.YamlPropertySourceFactory;
import lombok.Data;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Map;

/**
 * Configuration class to load errors details from a resource file
 */
@Data
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "cluedohelper")
@PropertySource(factory = YamlPropertySourceFactory.class, value = "classpath:errors.yml")
public class ErrorConfig {

	private Map<String, ErrorDetail> errors;

	/**
	 * Getter for the {@link ErrorDetail error}
	 *
	 * @param errorCode The code of the error
	 * @return the {@link ErrorDetail}
	 */
	public ErrorDetail get(final String errorCode) {
		return errors.get(errorCode);
	}
}
