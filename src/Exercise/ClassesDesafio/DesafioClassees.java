package Exercise.ClassesDesafio;

public class DesafioClassees {
    public static void main(String[] args) {

        DesafioClasseDatas d1 = new DesafioClasseDatas();
        d1.Dia = 10;
        d1.Mes = 9;
        d1.Ano = 2023;


        var d2 = new DesafioClasseDatas();
        d2.Dia = 7;
        d2.Mes = 9;
        d2.Ano = 2023;


        var d3 = new DesafioClasseDatas();
        d3.Dia = 25;
        d3.Mes = 12;
        d3.Ano = 2023;

        System.out.printf("\nData 1: %d/%d/%d", d1.Dia, d1.Mes, d1.Ano);
        System.out.printf("\nData 2: %d/%d/%d", d2.Dia, d2.Mes, d2.Ano);
        System.out.printf("\nData 3: %d/%d/%d", d3.Dia, d3.Mes, d3.Ano);

    }
}
