package intermediary.oo.composicao;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<>();

    void adicionarItem(String nome, int quantidade, double preco) {
        this.itens.add(new Item(nome, quantidade, preco));
    }

    void adicionarItem(Item item) {
        this.itens.add(item);
        item.compra = this;
    }

    double obeterValorTotal() {
        double total = 0;

        for (Item item: itens) {
            total += item.quatidade * item.preco;
        }
        return total;
    }
}
