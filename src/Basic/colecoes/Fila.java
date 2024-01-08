package Basic.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // offer e add -> adicionam elementos na fila
        // diferença é o comportamento ocorre
        // quando a fila está cheia!
        fila.add("Ana"); // retorna falso
        fila.offer("Bia"); // lança uma excesão
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Duda");
        fila.offer("Gui");

        // Peek e Element -> obter o proximo elementos
        // da fila sem remover

        // diferença é o comportamento ocorre
        // quando a fila está vazia!
        System.out.println(fila.peek()); // retorna falso
        System.out.println(fila.peek());
        System.out.println(fila.element()); // lança uma excesão
        System.out.println(fila.element());

//        fila.size();
//        fila.clear();
//        fila.isEmpty();

        // Pool e Remove -> Obter o proximo elemento
        // da fila e remove

        // diferença é o comportamento ocorre
        // quando a fila está vazia!
        System.out.println(fila.poll()); // retorna null
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove()); // lança uma exceção

//        fila.size();
//        fila.clear();
//        fila.isEmpty();
//        fila.contains();
    }
}

