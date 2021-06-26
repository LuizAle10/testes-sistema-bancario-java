package SistemaBancario;


import java.util.Scanner;

public class Main {

	static GerenciadoraClientes gerClientes;
	static GerenciadoraContas gerContas;

	public static void main(String[] args) {
		inicializaSistemaBancario(); // criando algumas contas e clientes fict�cios

		java.util.Scanner sc = new Scanner(System.in);
		boolean continua = true;

		while (continua) {

			printMenu();
			int opcao = sc.nextInt();

			switch (opcao) {

			// Consultar por um cliente
			case 1:
				System.out.print("Digite o Id do cliente");
				int idCliente = sc.nextInt();
				Cliente cliente = gerClientes.pesquisaCliente(IdCliente);

				if (cliente != null)
					System.out.println(cliente.toString());
				else
					System.out.println("Cliente não encontrado!");

				pulalinha();
				break;

			// Consultar por uma conta corrente
			case 2:
				System.out.print("Digite o id da conta!");
				int idConta = sc.nextInt();
				ContaCorrente conta = gerContas.pesquisaConta(idConta);

				if (conta != null)
					System.out.println(conta.toString());
				else
					System.out.println("Conta não encontrada");

				pulalinha();
				break;

			// Ativar um cliente
			case 3:
				System.out.print("Digite o id do cliente");
				int idCliente2 = sc.nextInt();
				Cliente cliente2 = gerClientes.pesquisaCliente(idCliente);

				if (cliente2 != null) {
					cliente2.setAtivo(true);
					System.out.println("Cliente ativo com sucesso!");
				} else
					System.out.println("Cliente não encontrado!");

				pulalinha();
				break;

			case 4:
				System.out.println("Digite o id do cliente");
				int idCliente3 = sc.nextInt();
				Cliente cliente3 = gerClientes.pesquisaCliente(idCliente);

				if (cliente3 != null) {
					cliente3.setAtivo(false);
					System.out.println("Cliente desativado com sucesso!");
				} else
					System.out.println("Cliente não encontrado!");

				pulalinha();
				break;

			// Sair
			case 5:
				continua = false;
				System.out.println("################# Sistema Encerrado #################");
				break;

			default:
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				break;

			}

		}

	}

}
