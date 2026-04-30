public class Carrinho {
    private static final int TAMANHO_MAXIMO = 100;
    private Produto[] produtos;
    private int tamanhoAtual = 0;
    
    public Carrinho () {
        produtos = new Produto[TAMANHO_MAXIMO];
        this.tamanhoAtual = 0;
    }

    // getters
    public int getTAMANHO_MAXIMO() { return TAMANHO_MAXIMO; }
    public int getTamanhoAtual() { return tamanhoAtual; }

    // métodos
    public void adicionarProduto (Produto p) {
        if (tamanhoAtual < TAMANHO_MAXIMO) {
            produtos[tamanhoAtual] = p;
            tamanhoAtual++;
            System.out.println("Produto adicionado ao carrinho.");
        } else {
            System.out.println("O carrinho está cheio. Não é possível adicionar mais produtos.");
        }
    }

    public void removerProduto (int indice) {
        if (indice >= 0 && indice < tamanhoAtual) {
            for (int i = indice; i < tamanhoAtual -1; i++) {
                produtos[i] = produtos[i + 1];
            }
            produtos[tamanhoAtual - 1] = null;
            tamanhoAtual--;
            System.out.println("Produto removido do carrinho.");
        } else {
            System.out.println("Índice inválido. Produto não encontrado no carrinho.");
        }
    }

    public void exibirCarrinho() {
        System.out.println("=== Carrinho de Compras ===");

        if (tamanhoAtual > 0) {
            for (int i = 0; i < tamanhoAtual; i++) {

                if (produtos[i] != null) {
                    System.out.println("Produto " + i + ": " + produtos[i]);
                }
            }
        } else {
            System.out.println("O carrinho está vazio.");
        }
    }

    public Produto acessarProduto(int indice) {
        if (indice >= 0 && indice < tamanhoAtual) {
            return produtos[indice];
        } else {
            System.out.println("Índice inválido. Produto não encontrado no carrinho.");
            return null;
        }
    }

    public void pesquisarProduto(String nome) {
        boolean encontrado = false;
        for (int i = 0; i < tamanhoAtual; i++) {
            //equalsIgnoreCase é um método da classe String em Java que verifica se duas strings são iguais, ignorando diferenças de caixa alta/baixa.
            if (produtos[i].getNome().equalsIgnoreCase(nome)) {
                System.out.println("Produto encontrado:");
                System.out.println("Nome: " + produtos[i].getNome());
                System.out.println("Preço: " + produtos[i].getPreco());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Produto não encontrado no carrinho.");
        }
    }

}
