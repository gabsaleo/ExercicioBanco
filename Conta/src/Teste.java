import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		String opc, opcCC, opcCP, opcSaida = "n", sair = "n";
		double valor;
		Scanner entrada = new Scanner(System.in);
		ContaCorrente CC = new ContaCorrente();
		ContaPoup CP = new ContaPoup();

		while ("n".equals(sair)) {
			System.out.println("\n Gostaria de visualizar qual tipo de conta? \n"
					+ " 1- Conta Corrente \n 2- Conta Poupança\n 3-Sair");
			opc = entrada.next();
			opcSaida = "n";

			while ("n".equals(opcSaida)) {

				if ("1".equals(opc)) {
					System.out.println("--------------------------------------");
					System.out.println(" 1-Sacar\n" + " 2-Depositar\n " + " 3-Transferir\n  0-Sair");
					System.out.println("Seu saldo é: " + CC.getSaldoCC());
					System.out.println("--------------------------------------");
					opcCC = entrada.next();
					
					if ("1".equals(opcCC)) {
						System.out.println("Informe o valor para saque: ");
						valor = entrada.nextDouble();
						CC.sacar(valor);
						System.out.println("--------------------------------------");
					}

					if ("2".equals(opcCC)) {
						System.out.println("Informe o valor para deposito: ");
						valor = entrada.nextDouble();
						CC.depositar(valor);
						System.out.println("--------------------------------------");
					}

					if ("3".equals(opcCC)) {
						System.out.println("Você está transferindo para sua conta poupança. ");
						System.out.println("Informe o valor para a transferencia: ");
						valor = entrada.nextDouble();
						CC.transferir(valor);
						CP.setSaldoCP(CP.getSaldoCP() + valor);
						System.out.println("--------------------------------------");
					}

					if ("0".equals(opcCC)) {
						opcSaida = "s";
						System.out.println("Saindo...");
					}
				}
			
				
				if ("2".equals(opc)) {
					System.out.println("--------------------------------------");
					System.out.println(" 1- Sacar\n" + " 2- Depositar\n " + " 3- Transferir\n  0- Sair");
					System.out.println("Seu saldo é: " + CP.getSaldoCP());
					System.out.println("--------------------------------------");
					opcCP = entrada.next();

					if ("1".equals(opcCP)) {
						System.out.println("Informe o valor para saque: ");
						valor = entrada.nextDouble();
						CP.sacarCP(valor);
						System.out.println("--------------------------------------");
					}

					if ("2".equals(opcCP)) {
						System.out.println("Informe o valor para deposito: ");
						valor = entrada.nextDouble();
						CP.depositarCP(valor);
						System.out.println("--------------------------------------");
					}

					if ("3".equals(opcCP)) {
						System.out.println("Você está transferindo para sua conta corrente. ");
						System.out.println("Informe o valor para a transferencia: ");
						valor = entrada.nextDouble();
						CP.transferirCP(valor);
						CC.setSaldoCC(CC.getSaldoCC() + valor);
						System.out.println("--------------------------------------");
					}

					if ("0".equals(opcCP)) {
						opcSaida = "s";
						
						System.out.println("Saindo...");
					}
				}
				if ("3".equals(opc)) {
					System.out.println("Saindo da aplicação....");
					opcSaida = "s";
					sair = "s";
					return;
				}
			}
			

			
		}
	}
}

