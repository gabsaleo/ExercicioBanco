public class ContaPoup extends Conta {

	public ContaPoup() {
		super();
	}

	private double saldoCP;

	public double getSaldoCP() {
		return saldoCP;
	}

	public void setSaldoCP(double saldoCP) {
		this.saldoCP = saldoCP;
	}

	public void sacarCP(double v) {
		System.out.println("Seu saldo atual é: " + this.getSaldoCP());
		if (this.getSaldoCP() >= v) {
			this.setSaldoCP(getSaldoCP() - v);
			System.out.println("Foi sacado o valor de: " + v);
			System.out.println("Seu novo saldo é: " + this.getSaldoCP());
		} else {
			System.out.println("Saldo insuficiente para realizar o saque. Efetue um deposito");
		}

	}

	public void depositarCP(double v) {
		this.setSaldoCP(this.getSaldoCP() + v);
		System.out.println("O valor depositado foi: " + v);
		System.out.println("Seu novo saldo é: " + this.getSaldoCP());
	}

	public void transferirCP(double v) {
		if (this.getSaldoCP() >= v) {
		this.setSaldoCP(this.getSaldoCP() - v);
		System.out.println("O valor transferido foi: " + v);
		System.out.println("Seu novo saldo é: " + this.getSaldoCP());
		}else {
			System.out.println("Saldo insuficiente para realizar a transferencia. Efetue um deposito");
		}
		

	}

}
