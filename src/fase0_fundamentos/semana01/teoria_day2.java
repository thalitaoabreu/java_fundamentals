package fase0_fundamentos.semana01;

public class teoria_day2 {
    public static void main (String[] args) {
        //Estudando sobre variáveis - Tipos primitivos:

        int numero_01 = 25; //Números inteiros;
        double numero_02 = 5; //Números decimais;
        boolean choice = true; //Valores booleanos - True e False;
        double soma, subtracao, multiplicacao, divisãoInteira, divisãoResto, potencia, funcQuadratica, raizCubica ;
        //Declaro valores que possam receber números com casas decimais como double;


        String nome = "thalita"; //Armazena textos, sendo que String, não é um tipo primitivo de variável;

        // Realizando operações entre variáveis;

        // Soma de dois números;
        soma = (numero_01 + numero_02);
        System.out.println("Resultado da soma de dois números: " + soma);

        // Subtração de dois números;
        subtracao = (numero_01 - numero_02);
        System.out.println("Resultado da subtração de dois números: " + subtracao);

        // Multiplicação de dois números;
        multiplicacao = (numero_01 * numero_02);
        System.out.println("Resultado da multiplicação de dois números: " + multiplicacao);

        // Realiza uma divisão inteira;
        divisãoInteira = (numero_01 / numero_02);
        System.out.println("Resultado da divisão inteira de dois números: " + divisãoInteira);

        // Realiza uma divisão onde o valor que importa é o resto;
        divisãoResto = (numero_01 % numero_02);
        System.out.println("Resultado do resto da divisão inteira de dois números: " + divisãoResto);



        // O Java não possuí um operador que realiza operações exponenciais, para isso, usamos a biblioteca Math.;
        // Exponencial;
        potencia = Math.pow(numero_01, 2); //Estou elevando o valor armazenado na variável, ao quadrado;
        // Math.pow(base, expoente); -> resultado é do tipo Double;
        System.out.println("Valor elevado ao quadrado: " + potencia);

        //Raiz Quadrada
        funcQuadratica = Math.sqrt(numero_01); //Estou calculando a raiz quadrada do valor armazenado na variável;
        // Math.sqrt(valor_Base); -> resultado é do tipo Double;
        System.out.println("Valor da Raiz Quadrada: " + funcQuadratica);

        //Posso usar Math.pow para calcular a raiz de outros quocientes
        raizCubica = Math.pow(numero_01, 1/3.0); //Estou calculando a raiz cúbica do numero_01;
        System.out.println("Valor da Raiz Cúbica: " + raizCubica);

        // Assim como na matemática o Java respeita a Precedência, no caso, multiplicação se sobresai a soma.
        // Com isso, utilizamos aprentesis para definir a prioridade da operação

        //Calculando o delta
        double delta;
        int valorA = 2;
        int valorB = 12;
        int valorC = 9;

        //Fórmula > delta = -b^2 + 4ac
        delta = Math.pow(valorB, 2) - (4 * (valorA * valorC));
        System.out.println("O valor de Delta é: " + delta);
    }
}
