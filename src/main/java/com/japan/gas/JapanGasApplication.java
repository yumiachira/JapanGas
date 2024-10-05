package com.japan.gas;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.japan.gas.mapper")
public class JapanGasApplication {

	public static void main(String[] args) {
		SpringApplication.run(JapanGasApplication.class, args);
	}

}
