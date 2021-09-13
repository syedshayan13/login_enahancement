package com.Spring.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.aop.TimedAspect;


@SpringBootApplication
public class LoginApplication {

	public static void main(String[] args) { SpringApplication.run(LoginApplication.class, args);
	}

	@Bean
	public TimedAspect timedAspect(MeterRegistry registry) {
		return new TimedAspect(registry);
	}

}
