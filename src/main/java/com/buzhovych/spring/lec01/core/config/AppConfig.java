package com.buzhovych.spring.lec01.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppConfigA.class, AppConfigB.class, OtherAppConfig.class, ListAppConfig.class})
public class AppConfig {

}
