package intermediary.oo.composicao;

public class Item {

    String nome;
    int quatidade;
    double preco;
    Compra compra;

    Item(String nome, int quatidade, double preco) {
        this.nome = nome;
        this.quatidade = quatidade;
        this.preco = preco;
    }

}
