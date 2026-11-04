package fase0_fundamentos.semana01;
import java.util.Scanner;
public class exercise_day2 {
    public static void main (String[] args) {

        //Estudando sobre variáveis - Tipos primitivos:

        int numero_01 = 25; //Números inteiros
        double numero_02 = 5; //Números decimais
        boolean choice = true; //Valores booleanos - True e False
        String nome = "thalita"; //Armazena textos;

        double soma, subtracao, multiplicacao, divisãoInteira, divisãoResto, potencia, funcQuadratica, raizCubica ;

        /*
            Como temos a intenção de realizar operações matemáticas que possam resultar em nhúmeros que possuam casas decimais, vamos
            declara-los como double.
        */

        // Realizando operações entre variáveis
        soma = (numero_01 + numero_02); // Soma de dois números
        System.out.println("Resultado da soma de dois números: " + soma);
        subtracao = (numero_01 - numero_02); // Subtração de dois números
        System.out.println("Resultado da subtração de dois números: " + subtracao);
        multiplicacao = (numero_01 * numero_02); // Multiplicação de dois números
        System.out.println("Resultado da multiplicação de dois números: " + multiplicacao);
        divisãoInteira = (numero_01 / numero_02); // Realiza uma divisão inteira
        System.out.println("Resultado da divisão inteira de dois números: " + divisãoInteira);
        divisãoResto = (numero_01 % numero_02); // Realiza uma divisão, mas, o foco aqui é no resto da divisão
        System.out.println("Resultado do resto da divisão inteira de dois números: " + divisãoResto);

        // O Java não possuí um operador que realiza operações exponenciais, para isso, usamos a biblioteca Math.

        // Exponencial
        potencia = Math.pow(numero_01, 2); //Estou elevando o salário ao quadrado -> resultado é do tipo Double
        System.out.println("Valor elevado ao quadrado: " + potencia);
        funcQuadratica = Math.sqrt(numero_01); //Estou calculando a raiz quadrada de 25 -> resultado é do tipo Double
        System.out.println("Valor da Raiz Quadrada: " + funcQuadratica);

        //Posso usar Math.pow para calcular a raiz de outros quocientes
        raizCubica = Math.pow(numero_01, 1/3.0); //Estou calculando a raiz cúbica do numero_01 -> resultado é do tipo Doubl
        System.out.println("Valor da Raiz ao Cubo: " + raizCubica);

        // Assim como na matemática o Java respeita a Orecedência, no caso, multiplicação se sobresai a soma.
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
