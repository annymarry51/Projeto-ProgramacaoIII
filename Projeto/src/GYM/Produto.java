package GYM;

public class Produto {
    private String nome;
    private String descricao;
    private float preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, String descricao, float preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if(quantidadeEmEstoque >= 0)
        {
            setQuantidadeEmEstoque(quantidadeEmEstoque);
        }
        else
        {
            System.out.println("Quantidade de estoque inválida");
        }
    }
}
