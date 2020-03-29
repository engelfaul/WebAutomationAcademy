package com.globant.web.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Taller1 {
	 public Logger log = Logger.getLogger(Example.class);

	    @BeforeSuite
	    public void beforeSuite() {
	        log.info ("Abrir Navegador");
	    }


	    @BeforeTest
	    public void beforeTest() {
	        log.info ("Cargar datos de usuario");
	    }

	    @BeforeMethod
	    public void beforeMethod() {
	        log.info ("Ir al link de la plataforma");
	    }

	    @AfterSuite
	    public void afterSuite() {
	            log.info ("Generar Reportes");
	    }

	    @AfterClass
	    public void afterClass() {
	        log.info ("Cerrar Navegador");
	    }

	    @AfterMethod
	    public void afterMethod() {
	        log.info ("Cerrar sesión");
	    }

	    @Test
	    public void a_crearCuenta () {
	        log.info("Ingresar opción crear cuenta");
	        log.info("Crear cuenta");
	        log.info("Revisar creación exitosa");
	    }

	    @Test
	    public void b_logIn () {
	        log.info("Ingresar opción log In");
	        log.info("Ingresar datos e ingresar");
	        log.info("Verificar ingreso exitoso");
	    }

	    @Test
	    public void c_cancelarCuenta () {
	        log.info("Ingresar opción cancelar cuenta");
	        log.info("Diligenciar opciones de cancelación");
	        log.info("Verificar cancelación exitosa");
	    }
}
