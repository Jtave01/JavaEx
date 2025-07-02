package carrinhoDeCompras;
public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public Item() {

    }
    @Override
    public String toString() {
        return "Carrinho{" +
                "Nome='" + nome + '\'' +
                ", Preço=" + preco +
                ", Quantidade=" + quantidade +
                '}';
    }

    public String getNome() {
        return nome;
    }
    public double getPreço() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreço(double preço) {
        this.preco = preço;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
