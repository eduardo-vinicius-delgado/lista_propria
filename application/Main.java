package application;

import entities.Lista;

public class Main {
	
	public static void checarAdicao(Lista lista, Integer valor, Integer posicao) {
		if(lista.adicionar(valor, posicao)==0) {
			System.out.println("Posicao Invalida");
		}else {
			System.out.println("Adicionado com sucesso");
		}
	}
	
	public static void checarRemocao(Lista lista, Integer posicao) {
		if(lista.remover(posicao)==0) {
			System.out.println("Posicao Invalida");
		}else {
			System.out.println(lista.remover(posicao));
		}
	}
	
	public static void checarProcura(Lista lista, Integer posicao) {
		if(lista.retornarValor(posicao)==(-10000000)) {
			System.out.println("Posicao Invalida");
		}else {
			System.out.println("Valor: " + lista.retornarValor(posicao));
		}
	}
	
	public static void mostrarTamanho(Lista lista) {
		System.out.println("Tamanho: " + lista.getTamanho());
	}

}