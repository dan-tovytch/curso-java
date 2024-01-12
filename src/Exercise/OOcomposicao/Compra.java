package Exercise.OOcomposicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itens = new ArrayList<>();
    private Produto[] produtos;

    double obterValorTotal() {
        double total = 0;
        for (Item item: itens) {
            for (Produto produto: produtos) {
                total = item.quatidade * produto.preco;
            }
        }
        return total;
    }
}
