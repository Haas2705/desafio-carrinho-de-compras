import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=== Carrinho de Compras ===");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Exibir carrinho");
            System.out.println("4. Acessar produto");
            System.out.println("5. Pesquisar produto");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    scanner.nextLine(); // Limpa o buffer do teclado
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();

                    Produto produto = new Produto(nome, preco);
                    carrinho.adicionarProduto(produto);
                    break;
                case 2:
                    System.out.print("Digite o índice do produto a ser removido: ");
                    int indiceRemover = scanner.nextInt();
                    carrinho.removerProduto(indiceRemover);
                    break;
                case 3:
                    carrinho.exibirCarrinho();
                    break;
                case 4:
                    System.out.print("Digite o índice do produto a ser acessado: ");
                    int indiceAcessar = scanner.nextInt();

                    Produto produtoAcessado = carrinho.acessarProduto(indiceAcessar);
                    if (produtoAcessado != null) {
                        System.out.println("Produto acessado: " + produtoAcessado);
                    }
                    break;
                case 5:
                    scanner.nextLine(); // Limpa o buffer do teclado
                    System.out.print("Digite o nome do produto a ser pesquisado: ");
                    String nomePesquisa = scanner.nextLine();

                    carrinho.pesquisarProduto(nomePesquisa);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
