package Basic.ArraysECollections.colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {

            HashSet conjunto = new HashSet();

            conjunto.add(1.2); // double -> Double
            conjunto.add(true); // boolean -> Boolean
            conjunto.add("Teste"); // String
            conjunto.add(1); // int -> Integer
            conjunto.add('x'); //

            System.out.println(conjunto.remove("Teste"));
            System.out.println("Tamanho é " + conjunto.size());

            System.out.println(conjunto.contains('x'));

            Set nums = new HashSet();

            nums.add(1);
            nums.add(2);
            nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        // conjunto.add(nums); // União entre dois conjuntos
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}