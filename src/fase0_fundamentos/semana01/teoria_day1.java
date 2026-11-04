package fase0_fundamentos.semana01;

public class teoria_day1 {
    public static void main(String[] args) {
        String nome = "Thalita";
        int idade = 25;

        /* Maneiras de se imprimir algo no JAVA

            * print -> Imprime na tela a informação e mantém o cursor na mesma linha
            * println -> Imprime na tela a informação e pula o cursor para a próxima linha
            * println ->Imprime o texto formatado, por exemplo:
                 %s -> formata String
                 %d -> formata inteiro
                 %.2f -> formata a quantidade de casas decimais que quero imprimir
        */

        System.out.println("Hello World");
        System.out.printf(
                "Eu sou %s e tenho %d anos de idade.%n",
                nome,
                idade);

        //Imprimindo dados Formatados

        System.out.println("=== TABELA DE PRODUTOS ===");
        System.out.println();
        System.out.printf("Produto 01: %s | Preço: R$ %.2f" , "Pão", 25.80 );
        System.out.println();
        System.out.printf("Produto 03: %s | Preço: R$ %.2f" , "Salame", 5.10 );
        System.out.println();
        System.out.printf("Produto 01: %s | Preço: R$ %.2f" , "Manteiga", 2.35 );
        System.out.println();
    }
}