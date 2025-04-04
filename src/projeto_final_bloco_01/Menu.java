package projeto_final_bloco_01;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);
		int opcao;
		boolean continuar = true;
		do {
			

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar um Produto                 ");
			System.out.println("            2 - Listar todos os Produtos             ");
			System.out.println("            3 - Buscar um Produto                    ");
			System.out.println("            4 - Atualizar um Produto                 ");
			System.out.println("            5 - Apagar um Produto                    ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = lerScanner.nextInt();

			if (opcao == 6) {
				System.out.println("\nObrigado por acessar");
				lerScanner.close();
				System.exit(0);
			}
			switch (opcao) {

			case 1: {
				System.out.println("Cadastrar um Produto: ");

			}
				break;

			case 2: {
				System.out.println("Listar todos os Produtos: ");

			}
				break;

			case 3: {
				System.out.println("Buscar um Produto: ");

			}
				break;

			case 4: {
				System.out.println("Atualizar um Produto: ");

			}
				break;

			case 5: {
				System.out.println("Apagar um Produto: ");

			}
				break;

			default:
				System.err.println("Valor Inesperado utilize os codigos que estão no menu!!!!");

			}

		} while (continuar);
	}
}
