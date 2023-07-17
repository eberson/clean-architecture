package br.com.clean.architecture.startup.config;

import br.com.clean.architecture.api.config.APIConfiguration;
import br.com.clean.architecture.database.configuration.DatabaseConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        DatabaseConfiguration.class,
        APIConfiguration.class
})
public class MainConfiguration {
}
