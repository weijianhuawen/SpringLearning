package com.mvc.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(value = "com.mvc.demo",
                excludeFilters = @ComponentScan.Filter(
                        type = FilterType.ANNOTATION,
                        classes = {Controller.class}
                )
)
public class SpringConfig {
}
