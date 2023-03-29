package com.fatec.cap07;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class Exemplo1 {

	@Test
	public void ct01_valida_comportamento_da_inicialização_da_lista_vazia() {
		// dado que – a lista foi inicializada
		List<String> lista;
		lista = new ArrayList<String>();
		//quando consulta o tamanho da lista
		int tamanho = lista.size();
		//então – o tamanho é igual a zero
		assertEquals(0, tamanho);
	}
	@Test
	public void ct02_verifica_se_a_lista_tem_o_mesmo_conteudov1() {
			List<String> lista = new ArrayList<String>();
			lista.add("jose");
			lista.add("silva");
			lista.add("marina");
			assertEquals("jose", lista.get(0));
			assertEquals("silva", lista.get(1));
			assertEquals("marina", lista.get(2));
	}
	@Test
	public void ct03_verifica_se_a_lista_tem_o_mesmo_conteudov2() {
			List<String> lista1 = new ArrayList<String>();
			lista1.add("jose");
			lista1.add("silva");
			lista1.add("marina");
			List<String> lista2 = Collections.synchronizedList(lista1);
			for (int i = 0; i < lista1.size(); i++) {
				assertEquals(lista1.get(i), lista2.get(i));
			}
	}


}
