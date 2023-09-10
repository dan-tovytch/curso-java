package Exercise.fudamentos;
import java.util.concurrent.TimeUnit;

public class exercise {
    public static void main(String[] args) {
        // Sequência de escape ANSI para definir a cor do texto em vermelho
        String redText = "\u001B[31m";
        // Sequência de escape ANSI para definir a cor do texto em verde
        String greenText = "\u001B[32m";
        // Sequência de escape ANSI para resetar a cor do texto para o padrão
        String resetText = "\u001B[0m";

        System.out.println(greenText + "✔ Test 1" + resetText);

        try {
            // Pausa de 5 segundos antes de exibir o próximo println
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(greenText + "✔ Test 2" + resetText);

        try {
            // Pausa de 5 segundos antes de exibir o próximo println
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(greenText + "✔ Test 3" + resetText);
    }
}