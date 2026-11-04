package fase0_fundamentos.semana01.exercícios;
public class Exercício02 {
    public static void main (String[] args) {
        // Calcular a média para três notas
        double notas_1, notas_2, notas_3, media;

        notas_1 = 34.5;
        notas_2 = 19.0;
        notas_3 = 29.7;

        media = (notas_1 + notas_2 + notas_3) / 3;

        System.out.printf("Para as notas cadastradas no sistema, temos a seguinte média: %.2f", media);

    }
}
