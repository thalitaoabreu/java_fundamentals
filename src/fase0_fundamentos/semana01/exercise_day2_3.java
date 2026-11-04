package fase0_fundamentos.semana01;

import java.util.Scanner;

public class exercise_day2_3 {
    public static void main(String[] args) {
        //Solicitar ao usuário um valor em segundos para convertermos em Horas e Minutos
        int valorNumerico, horas, horasResto, minutos, segundos;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite um valor  em segundos para ser convertido em Horas e Minutos: ");
        valorNumerico = keyboard.nextInt();

        //Calculando as horas
        horas = valorNumerico / 3600;

        //Calculando os Minutos
        minutos = (valorNumerico % 3600) / 60;
        // Resto das horas -> dá segundos | utilizo esses sgundos e divido por 60 -> tenho os minutos

        //Calculando os Segundos
        segundos = (valorNumerico % 3600) % 60; //ao calcular o % de 60, eu estou pegando os Segundos que sobram dos minutos

        //Exibição Separado
        System.out.printf("Horas: %d%n", horas);
        System.out.printf("Minutos: %d%n", minutos);
        System.out.printf("Segundos: %d%n", segundos);

        //Exibição como relógio:
        System.out.printf("%d h %d min %d s%n", horas, minutos, segundos);
        /* Como ler a formatação
            Cada %d é um espaço reservado que será preenchido por uma variável, na ordem em que elas aparecem depois da vírgula.
            O primeiro %d recebe horas, o segundo recebe minutos, e assim por diante.
            O %n quebra a linha. Ele substitui o System.out.println() que você usava depois de cada printf.
            O que fica fora dos % (como “ h “ e “ min “) é impresso do jeito que está.
        */

    }
}
