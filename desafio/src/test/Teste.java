package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import application.Program;

class Teste {

	@Test
	void testDesafio2() {
		Program p = new Program();
		String s = p.desafio2("123");

		assertEquals("caso de teste ok", "Falta pelo menos 3 caracteres para a senha ser segura", s);
		
	}
	
	@Test
	void testDesafio() {
		Program p = new Program();
		String s = p.desafio2("123456");

		assertEquals("caso de teste ok", "senha segura!", s);
		
	}
	
	

}
