import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double vetCarrinhoValores[] = new double[50];
		String vetCarrinhoNomes[] = new String[50];
		int opcao=0;
		int posicaoAtual = 0;
		
		while(opcao!=7) {
			System.out.println("FIAPSTORE");
			System.out.println("1 - Colocar produto no carrinho");
			System.out.println("2 - Remover produto do carrinho");
			System.out.println("3 - Obter valor do carrinho");
			System.out.println("4 - Obter quantidade de produtos do carrinho");
			System.out.println("5 - Ver produto mais caro");
			System.out.println("6 - Exibir carrinho");
			System.out.println("7 - Sair");
			System.out.println("Digite a sua opção");
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				//Colocar produto no carrinho
				if (posicaoAtual==vetCarrinhoNomes.length) {
					System.out.println("O carrinho já está cheio. Não é possível inserir mais produtos");
				}else {
				System.out.println("Por favor, informe o nome do produto");
				vetCarrinhoNomes[posicaoAtual] = leitor.next();
				System.out.println("Por favor, informe o valor do produto");
				vetCarrinhoValores[posicaoAtual] = leitor.nextDouble();
				posicaoAtual++;
				}
				break;
			case 2:
				//Remover produto
				String nomeProduto;
				System.out.println("Por favor, insira o nome do produto que deseja remover");
				nomeProduto = leitor.next();
				for(int i=0;i<posicaoAtual;i++) {
					if(vetCarrinhoNomes[i].equals(nomeProduto)) {
						vetCarrinhoNomes[i] = "";
						vetCarrinhoValores[i] = 0;
					} 
				}
				break;
			case 3:
				//Valor total
				double valorTotal=0;
				for(int i=0;i<posicaoAtual;i++) {
					valorTotal = valorTotal + vetCarrinhoValores[i];
				}
				System.out.println("O total atual do carrinho é R$" + valorTotal);
				break;
			case 4:
				//Quantidade de produtos
				//Outra ideia é criar uma variável chamada produtoRemovido, que vai somando cada vez que o usuário remover um produto. Assim, basta somar posicaoAtual com produtosRemovido para saber quantos produtos tem no carrinho
				
				int qtde=0;
				for(int i=0;i<posicaoAtual;i++) {
					if(vetCarrinhoNomes[i].length()!=0) {
						qtde++;
					}
				}
				System.out.println("No carrinho existem " + qtde + " produtos");
				break;
			case 5:
				//Produto mais caro
				int posicaoDoMaisCaro=0;
				for(int i=0;i<posicaoAtual;i++) {
					if (vetCarrinhoValores[i] > vetCarrinhoValores[posicaoDoMaisCaro]) {
											
						posicaoDoMaisCaro = i;
					}
				}
				System.out.println("O produto mais caro é " + vetCarrinhoNomes[posicaoDoMaisCaro] + " e custa R$ " + vetCarrinhoValores[posicaoDoMaisCaro]);
				break;
			case 6:
				//Exibir carrinho
				System.out.println("\n\n\n\n");
				for(int i=0;i<posicaoAtual;i++) {
					if(vetCarrinhoNomes[i].length()!=0) {
					System.out.println(vetCarrinhoNomes[i] + " ... R$ " + vetCarrinhoValores[i]);
					}else {
						System.out.println("PRODUTO REMOVIDO");
					}
				}
				break;
			case 7:
				//Sair
				System.out.println("Saindo do sistema...");
				break;
			default:
				System.out.println("DIGITE UMA OPÇÃO VÁLIDA");
				break;
			}
		}
		
		leitor.close();

	}

}
