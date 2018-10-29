package com.kingsley.dataservice.configuration;
import com.kingsley.dataservice.repository.ExtendedRepositoryImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.kingsley.dataservice.repository", repositoryBaseClass = ExtendedRepositoryImpl.class)
public class ExtendedRepositoryConfiguration {
    // additional JPA Configuration here
}
