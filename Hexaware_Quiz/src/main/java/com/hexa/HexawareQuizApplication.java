package com.hexa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class HexawareQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexawareQuizApplication.class, args);
	}

}
