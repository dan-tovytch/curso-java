package Basic.controle;

public class Break {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }

            System.out.print(i);
        }
        System.out.println("Fim");
    }
}
