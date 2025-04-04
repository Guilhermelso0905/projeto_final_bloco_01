package projeto_final_bloco_01;

import java.math.BigDecimal;
import java.util.Scanner;
import projeto_final_bloco_01.controller.MenuController;
import projeto_final_bloco_01.model.ProdutoSimples;

public class Menu {

	public static void main(String[] args) {
		MenuController controller = new MenuController();
		
		Scanner lerScanner = new Scanner(System.in);
		int opcao,codigoproduto;
		String nomeString,marcaString;
		BigDecimal precoBigDecimal;
		String continuaString;
		
		boolean continuar = true;
		do {
			boolean reiniciarprograma = true;

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
			    lerScanner.nextLine(); // limpa o buffer
			    System.out.println("Digite o nome do Produto");
			    nomeString = lerScanner.nextLine();		

			    System.out.println("Digite a Marca do Produto");
			    marcaString = lerScanner.nextLine();
			        
			    System.out.println("Digite o Preço do Produto");
			    precoBigDecimal = lerScanner.nextBigDecimal();
			    
			    controller.cadastrar(new ProdutoSimples(controller.gerarCodigoproduto(),nomeString,marcaString,precoBigDecimal));
			    
			    while (reiniciarprograma) {
			        System.out.println("Deseja Continuar? s/n ");
			        continuaString = lerScanner.next().toUpperCase();
			        if (continuaString.equals("S")) {
			            continuar = true;
			            reiniciarprograma = false;
			        } else if (continuaString.equals("N")) {
			            System.out.println("\nPrograma Finalizado!");
			            continuar = false;
			            reiniciarprograma = false;
			        } else {
			            System.out.println("Opção Invalida Tente novamente\n");
			        }
			    }
			}
			break;


			case 2: {
				System.out.println("Listar todos os Produtos: \n\n");
				controller.listarTodas();
				
				while (reiniciarprograma) {
                    System.out.println("Deseja Continuar? s/n ");
                    continuaString = lerScanner.next().toUpperCase();
                    if (continuaString.equals("S")) {
                        continuar = true;
                        reiniciarprograma = false;
                        lerScanner.nextLine();
                    } else if (continuaString.equals("N")) {
                        System.out.println("\nPrograma Finalizado!");
                        continuar = false;
                        reiniciarprograma = false;
                    } else {

                        System.out.println("Opção Invalida Tente novamente\n");
                        reiniciarprograma = true;
                    }
                }
			}
				break;

			case 3: {
				System.out.println("Buscar um Produto: \n\n");
				
				System.out.println("Digite o codigo do produto");
				codigoproduto = lerScanner.nextInt();
				
				controller.procurarPorNumero(codigoproduto);
				
				
				while (reiniciarprograma) {
                    System.out.println("Deseja Continuar? s/n ");
                    continuaString = lerScanner.next().toUpperCase();
                    if (continuaString.equals("S")) {
                        continuar = true;
                        reiniciarprograma = false;
                        lerScanner.nextLine();
                    } else if (continuaString.equals("N")) {
                        System.out.println("\nPrograma Finalizado!");
                        continuar = false;
                        reiniciarprograma = false;
                    } else {

                        System.out.println("Opção Invalida Tente novamente\n");
                        reiniciarprograma = true;
                    }
                }
			}
				break;

			case 4: {
				System.out.println("Atualizar um Produto: \n\n");
				System.out.println("Digite o codigo do produto");
				codigoproduto = lerScanner.nextInt();
				lerScanner.skip("\\R?");
				
				var buscaProdutos = controller.buscarnaListaProdutos(codigoproduto);

				if (buscaProdutos != null) {
				
				System.out.println("Digite o nome do Produto");
		        nomeString = lerScanner.nextLine();		
		        
		        System.out.println("Digite a Marca do Produto");
		        marcaString = lerScanner.nextLine();
		        
		        System.out.println("Digite o Preço do Produto");
		        precoBigDecimal = lerScanner.nextBigDecimal();
		        controller.atualizar(new ProdutoSimples(codigoproduto,nomeString,marcaString,precoBigDecimal));
		        
				}else {
					System.out.println("\nProduto não encontrado!");
				}
				
				while (reiniciarprograma) {
                    System.out.println("Deseja Continuar? s/n ");
                    continuaString = lerScanner.next().toUpperCase();
                    if (continuaString.equals("S")) {
                        continuar = true;
                        reiniciarprograma = false;
                        lerScanner.nextLine();
                    } else if (continuaString.equals("N")) {
                        System.out.println("\nPrograma Finalizado!");
                        continuar = false;
                        reiniciarprograma = false;
                    } else {

                        System.out.println("Opção Invalida Tente novamente\n");
                        reiniciarprograma = true;
                    }
                }

			}
				break;

			case 5: {
				System.out.println("Apagar um Produto: \n\n");
				
				System.out.println("Digite o codigo do Produto: ");
				codigoproduto = lerScanner.nextInt();

				controller.deletar(codigoproduto);
				
				while (reiniciarprograma) {
                    System.out.println("Deseja Continuar? s/n ");
                    continuaString = lerScanner.next().toUpperCase();
                    if (continuaString.equals("S")) {
                        continuar = true;
                        reiniciarprograma = false;
                        lerScanner.nextLine();
                    } else if (continuaString.equals("N")) {
                        System.out.println("\nPrograma Finalizado!");
                        continuar = false;
                        reiniciarprograma = false;
                    } else {

                        System.out.println("Opção Invalida Tente novamente\n");
                        reiniciarprograma = true;
                    }
                }

			}
				break;

			default:
				System.err.println("Valor Inesperado utilize os codigos que estão no menu!!!!");
				
					while (reiniciarprograma) {
						System.out.println("Deseja Continuar? s/n ");
						continuaString = lerScanner.next().toUpperCase();
						if (continuaString.equals("S")) {
							continuar = true;
							reiniciarprograma = false;
							lerScanner.nextLine();
						} else if (continuaString.equals("N")) {
							System.out.println("\nPrograma Finalizado!");
							continuar = false;
							reiniciarprograma = false;
						} else {

							System.out.println("Opção Invalida Tente novamente\n");
							reiniciarprograma = true;
                    }
                }

			}

		} while (continuar);
	}
}
