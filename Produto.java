public class Produto {
    
    private String nome;
    private double preco;
    
    public Produto (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // gettes
    public String getNome() { return nome; }
    public double getPreco() { return preco; }

    // setters
    public void setNome(String nome) { this.nome = nome; }
    public void setPreco(double preco) { this.preco = preco; }

    @Override
    public String toString () {
        return nome + " - R$ " + String.format("%.2f", preco);
    }

}
