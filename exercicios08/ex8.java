import java.util.ArrayList;
import java.util.Scanner;
public class ex8 {


		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			int opcao;
			ArrayList<String> estoque = new ArrayList<String>();
			String produto, produtoRemover, produtoVerifica, produtoNovo;
			do {
				System.out.printf("\nEstoque");
				System.out.printf("\n1. Adicionar ao estoque");
				System.out.printf("\n2. Remover do estoque");
				System.out.printf("\n3. Alterar o estoque");
				System.out.printf("\n4. Exibir o estoque atual");
				System.out.printf("\n0. Encerrar\n");
				opcao = ler.nextInt();
				
				switch(opcao) {
					
					case 1:
						ler.nextLine();
						System.out.printf("\nInforme o produto: ");
						produto = ler.nextLine();
						estoque.add(produto);
						break;
					
					case 2:
						ler.nextLine();
						System.out.printf("\nProduto a ser removido do estoque: ");
						produtoRemover = ler.nextLine();
						if(estoque.contains(produtoRemover)) estoque.remove(produtoRemover);
						else System.out.printf("\nProduto não encontrado, informe um item válido");
						break;
					
					case 3:
						ler.nextLine();
						System.out.printf("\nQual item gostaria de alterar? ");
						produtoVerifica = ler.nextLine();
						System.out.printf("\nQual item substitui %s? ", produtoVerifica);
						produtoNovo = ler.nextLine();
						if(estoque.contains(produtoVerifica)) {
							estoque.remove(produtoVerifica);
							estoque.add(produtoNovo);

						} else {
							System.out.printf("\n%s não existe no estoque atualmente", produtoVerifica);
						}
						break;
					
					case 4:
						ler.nextLine();
						System.out.printf("\nEstoque atual: %s\n", estoque);
						break;
					default:
						System.out.printf("\n\tEncerrando...\n");
				}
			
			} while(opcao != 0);
		
		}
	}

