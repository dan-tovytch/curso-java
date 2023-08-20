package Exercise.fudamentos;

public class desafioLogicos {
    public static void main(String[] args) {

        boolean trab1 = true;
        boolean trab2 = true;

        boolean tv30 = trab1 && trab2;
        boolean tv50 = trab1 ^ trab2;

        boolean soverte = (trab1 && trab2) || (trab1 ^ trab2);

        System.out.println("Televisão de 30 polegadas: " + tv30);
        System.out.println("Televisão de 50 polegadas: " + tv50);
        System.out.println("sorvete: " + soverte);

    }
}
