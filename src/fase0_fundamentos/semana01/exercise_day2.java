package fase0_fundamentos.semana01;
import java.util.Scanner;
public class exercise_day2 {
    public static void main(String[] args) {
        // Conversor de Temperatura Celsius -> fahrenheit
        // Fórmula -> C / 5 = (F - 32) / 9

        double temperaturaCelsius, temperaturaFahrenheit;

        Scanner keyboard = new Scanner(System.in);
        //Criando Scanner para solicitar dados aos usuários.


        System.out.println("Digite o valor da temperatura em °C: ");
        temperaturaCelsius = keyboard.nextDouble();
        ;

        temperaturaFahrenheit = (((temperaturaCelsius / 5) * 9) + 32);

        System.out.printf("O resultado da conversão de °C: %.1f para Fahrenheit é de °F: %.1f",
                temperaturaCelsius, temperaturaFahrenheit);

        keyboard.close();
    }
}
