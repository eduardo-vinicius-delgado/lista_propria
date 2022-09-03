package application;

public class Main {

	public static void main(String[] args) {
		//Inicia do índice 0
		Lista lista = new Lista();
		System.out.println(lista.listaVazia());
		lista.mostrarLista();
		System.out.println(lista.getTamanho());
		System.out.println();
		
		checarAdicao(lista, 1, 0);	
		checarAdicao(lista, 2, 1);
		checarAdicao(lista, 3, 2);
		lista.mostrarLista();
		System.out.println(lista.getTamanho());
		System.out.println();
		System.out.println(lista.listaVazia());
		System.out.println();
		
		checarAdicao(lista, 4, 1);
		lista.mostrarLista();
		System.out.println(lista.getTamanho());
		System.out.println();
		
		checarRemocao(lista, 3);
		lista.mostrarLista();
		System.out.println(lista.getTamanho());
		System.out.println();
		
		checarRemocao(lista, 0);
		lista.mostrarLista();
		System.out.println(lista.getTamanho());
		System.out.println();
		
		checarProcura(lista, 0);
	}
	
	public static void checarAdicao(Lista lista, Integer valor, Integer posicao) {
		if(lista.adicionar(valor, posicao)==0) {
			System.out.println("Posição inválida");
		}else {
			System.out.println("Adicionado com sucesso");
		}
	}
	
	public static void checarRemocao(Lista lista, Integer posicao) {
		if(lista.remover(posicao)==0) {
			System.out.println("Posição inválida");
		}else {
			System.out.println("Removido com sucesso");
		}
	}
	
	public static void checarProcura(Lista lista, Integer posicao) {
		if(lista.retornarValor(posicao)==(-10000000)) {
			System.out.println("Posição inválida");
		}else {
			System.out.println("Valor: " + lista.retornarValor(posicao));
		}
	}
	
	public static void mostrarTamanho(Lista lista) {
		System.out.println("Tamanho: " + lista.getTamanho());
	}

}