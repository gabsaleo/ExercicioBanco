
public class ContaCorrente extends Conta {

	public ContaCorrente() {
		super();
	}

	public double getSaldoCC() {
		return saldoCC;
	}

	public void setSaldoCC(double saldoCC) {
		this.saldoCC = saldoCC;
	}

	private double saldoCC;

	public void sacar(double v) {
		System.out.println("Seu saldo atual é: " + this.getSaldoCC());
		if (this.getSaldoCC() >= v) {
			this.setSaldoCC((getSaldoCC() - v) - 10);
			System.out.println("Foi sacado o valor de: " + v);
			System.out.println("Seu novo saldo é: " + this.getSaldoCC());
		} else {
			System.out.println("Saldo insuficiente para realizar o saque. Efetue um deposito");
		}

	}

	public void depositar(double v) {
		this.setSaldoCC(this.getSaldoCC() + v);
		System.out.println("O valor depositado foi: " + v);
		System.out.println("Seu novo saldo é: " + this.getSaldoCC());
	}
	public void transferir(double v) {
		if (this.getSaldoCC() >= v) {
		this.setSaldoCC((this.getSaldoCC() - v)-10);
		System.out.println("O valor transferido foi: " + v);
		System.out.println("Seu novo saldo é: " + this.getSaldoCC());
		}else {
			System.out.println("Saldo insuficiente para realizar a transferencia. Efetue um deposito");
		}
		
		
		
		
	}
	
	
	

}
