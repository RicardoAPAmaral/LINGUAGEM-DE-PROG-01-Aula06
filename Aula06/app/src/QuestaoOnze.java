import entidadeOnze.Produto;

public class QuestaoOnze {
    public static void main(String[] args) {
        Produto produto = new Produto("Laptop", 150,3000);
        System.out.println("Produto "+produto.getNome());
        System.out.println("Quantidade "+ produto.getQuantidade());
        System.out.println("Preço "+produto.getValor());
        System.out.println();

        produto.comprarEstoque(900);


        System.out.println("Produto "+produto.getNome());
        System.out.println("Quantidade "+ produto.getQuantidade());
        System.out.println("Preço "+produto.getValor());
        System.out.println();

        produto.venderEstoque(1000);


        System.out.println("Produto "+produto.getNome());
        System.out.println("Quantidade "+ produto.getQuantidade());
        System.out.println("Preço "+produto.getValor());


    }
}
