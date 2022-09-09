package entities;

public class Lista {

	private Integer tamanho= 0;
	private No primeiroNo = null;
	
	public Integer getTamanho() {
		return tamanho;
	}
	
	public void aumentarTamanho() {
		tamanho++;
	}
	
	public void diminuirTamanho() {
		tamanho--;
	}
	
	public No getPrimeiroNo() {
		return primeiroNo;
	}
	
	public void setPrimeiroNo(No primeiroNo) {
		this.primeiroNo = primeiroNo;
	}
	
	public boolean listaVazia() {
		if(getPrimeiroNo() == null) {
			return true;
		}else{
			return false;
		}
	}
	
	public Integer adicionar(int valor, int posicao) {
		if(posicao > getTamanho() || posicao<0) {
			return 0;
		}
		No novoNo = new No();
		novoNo.setValorInt(valor);
		if(posicao==0) {
			novoNo.setProximoNo(getPrimeiroNo());
			setPrimeiroNo(novoNo);
		}else {
			No noAuxiliar = new No();
			noAuxiliar = getPrimeiroNo();
			for(int i = 0; i < posicao - 1; i++ ) {
				noAuxiliar = noAuxiliar.getProximoNo();
			}
			novoNo.setProximoNo(noAuxiliar.getProximoNo());
			noAuxiliar.setProximoNo(novoNo);
		}
		aumentarTamanho();
		return 1;
	}
	
	public void mostrarLista() {
		if(getTamanho()==0) {
			System.out.println("Lista vazia");
		}else{
			No noAuxiliar = new No();
			noAuxiliar = getPrimeiroNo();
			for(int i = 0; i < getTamanho(); i++) {
				System.out.println("Posicao: "+ i + " -> " + noAuxiliar.getValorInt() + " ");
				noAuxiliar=noAuxiliar.getProximoNo();
			}
		}
	}
	
	public Integer remover(Integer posicao) {
		if(posicao >= getTamanho() || posicao<0) {
			return 0;
		}
		No noAuxiliar = new No();
		No noAuxiliar1 = new No();
		No noAnterior = new No();
		noAuxiliar = getPrimeiroNo();
		int dado;
		if(posicao==0) {
			noAuxiliar1 = primeiroNo;
			dado=primeiroNo.getValorInt();
			setPrimeiroNo(noAuxiliar.getProximoNo());
			noAuxiliar1.setProximoNo(null);
			diminuirTamanho();
		}else {
			for(int i = 0; i < posicao ; i++) {
				noAnterior = noAuxiliar;
				noAuxiliar = noAuxiliar.getProximoNo();
			}
			noAuxiliar1 = noAnterior.getProximoNo();
			dado = noAuxiliar1.getValorInt();
			noAnterior.setProximoNo(noAuxiliar.getProximoNo());
			noAuxiliar.setProximoNo(null);
			diminuirTamanho();
		}
		return dado;
	}
	
	public Integer retornarValor(Integer posicao) {
		if(posicao >= getTamanho() || posicao<0) {
			return -10000000;
		}else {
			No noAuxiliar = new No();
			noAuxiliar = getPrimeiroNo();
			for(int i = 0; i < posicao ; i++) {
				noAuxiliar = noAuxiliar.getProximoNo();
			}
			return noAuxiliar.getValorInt();
		}
	}
	
}