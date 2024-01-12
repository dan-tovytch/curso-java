package Exercise.OOcomposicao;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    String nome;
    double preco;
    List<Produto> produtos = new ArrayList<>();

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


}
