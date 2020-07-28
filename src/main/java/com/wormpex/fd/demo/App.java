package com.wormpex.fd.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackageClasses = {App.class})
@ImportResource("classpath:spring-context.xml")
public class App {


}
