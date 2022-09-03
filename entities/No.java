package entities;
public class No {
	private Integer valorInt = 0;
	private No proximoNo = null;
	
	public Integer getValorInt() {
		return valorInt;
	}
	
	public void setValorInt(int valorInt) {
		this.valorInt = valorInt;
	}
	
	public No getProximoNo() {
		return proximoNo;
	}
	
	public void setProximoNo(No proximoNo) {
		this.proximoNo = proximoNo;
	}
	
}