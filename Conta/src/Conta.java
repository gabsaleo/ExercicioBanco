
public class Conta {

	private double saldo;
	private boolean status;
	private String tipo;

	public void abrirConta() {
		this.setStatus(true);
		System.out.println("Seja bem-vindo ao nosso banco");
	}

	public void sacar(double v) {
		if (this.getSaldo() >= v) {
			this.setSaldo((this.getSaldo() - v));
			System.out.println("Foi sacado o valor de: " + v);
			System.out.println("Seu novo saldo é: " + this.getSaldo());
		} else {
			System.out.println("O saldo é insuficiente");
		}
	}

	public void depositar(double v) {
		this.setSaldo(this.getSaldo() + v);
		System.out.println("O valor depositado foi: " + v);
		System.out.println("Seu novo saldo é: " + this.getSaldo());

	}

	public void transferir() {

	}

	public Conta() {
		this.setSaldo(0);
		this.setStatus(false);

	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
