package org.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(FirstConfig.class)
public class SecondConfig {
}
