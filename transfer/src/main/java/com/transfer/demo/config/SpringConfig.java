package com.transfer.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource("classpath:jdbc.properties")
@ComponentScan("com.transfer.demo")
@Import({MybatisConfig.class, JdbcConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}
