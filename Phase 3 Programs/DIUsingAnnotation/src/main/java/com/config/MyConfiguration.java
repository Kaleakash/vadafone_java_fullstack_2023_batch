package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration				// beans.xml
@ComponentScan(basePackages = "com.pojo") //<context:component-scan base-package="com"></context:component-scan>
public class MyConfiguration {

}
