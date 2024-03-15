package com.formacionbdi.springboot.app.commons;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
/*
 * @EnableAutoConfiguration
 * Sobre escribimos esta anotación puesto que ya se encuentra dentro de la anotación "@SpringBootApplication"
 * Con el fin de excluir la configuración de la conexión del DataSource.
 * Esto mediante el argumento "exclude"
 * Es decir, evitar escribir las cadenas de conexión en el archivo "application.properties" para que tome la configuración por defecto
 */
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootServicioCommonsApplication {
	// Removemos el método main, ya que este es un proyecto de librería.
	// No es un proyecto que ejecutemos o que arranque una aplicación, siendo solo una dependencia.
}
