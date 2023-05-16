public class ContaCorrente {
	private int agencia;
	private int cc;
	private int saldo;
	private int depositar;
	private int sacar;
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public int getDepositar() {
		return depositar;
	}
	public void setDepositar(int depositar) {
		this.setSaldo(this.getSaldo() + depositar);
	}
	public int getSacar() {
		return sacar;
	}
	public void setSacar(int sacar) {
		if(this.getSaldo() >= sacar)
			this.setSaldo(this.getSaldo() - sacar);
		else
			System.out.println("Saque não permitido");
	}
}
