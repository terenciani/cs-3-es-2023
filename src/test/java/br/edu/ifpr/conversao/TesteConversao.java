package br.edu.ifpr.conversao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteConversao {
	
	@Test
	public void converteSegundos() {
		String resposta = Conversao.converter(50);
		assertEquals("0:0:50", resposta);
	}
	
	@Test
	public void converteMinutos() {
		String resposta = Conversao.converter(110);
		assertEquals("0:1:50", resposta);
	}
	
	@Test
	public void converteHoras() {
		String resposta = Conversao.converter(140153);
		assertEquals("38:55:53", resposta);
	}
	
}
