package entidadeOnze;

public class Produto {
    private String nome;
    private int quantidade;
    private double valor;

    public Produto(String nome, int quantidade, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void comprarEstoque(int novosProdutos) {
        if (novosProdutos > 0) {
            this.quantidade += novosProdutos;
        } else {
            System.out.println("Digite uma quantidade válida!");
        }
    }

    public void venderEstoque(int produtoVendido){
        if(produtoVendido>0 && produtoVendido<this.quantidade){
            this.quantidade-= produtoVendido;

        }else{
            System.out.println("digite uma quatidade válida!");
        }

    }
}