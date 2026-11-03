package fase0_fundamentos.semana01;

public class Semana01_ex01 {
    public static void main(String[] args) {
        String nome = "Thalita";
        int idade = 25;

        System.out.println("Hello World");
        System.out.printf(
                "Eu sou %s e tenho %d anos de idade.%n",
                nome,
                idade);

        /* Maneiras de se imprimir algo no JAVA

            * print -> Imprime na tela a informação e mantém o cursor na mesma linha
            * println -> Imprime na tela a informação e pula o cursor para a próxima linha
            * println ->Imprime o texto formatado, por exemplo:
                 %s -> formata String
                 %d -> formata inteiro
                 %.2f -> formata a quantidade de casas decimais que quero imprimir
        */

    }
}