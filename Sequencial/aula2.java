package Sequencial;

//  + Adição
//  - Subtração
//  * Multiplicação
//  / Divisão
//  % Resto da divisão

//  Procedência   
//   Primeiros * / %
//   Segundos   = - 

public class aula2 {
    public static void main(String[] args) {

        int n1 = 5;
        int n2 = 5;
        var resultado = n1 + n2;

        System.out.println("O resultado da soma é " + resultado);

        int n3 = 6;
        int n4 = 2;
        var divisao = n3 / n4;

        System.out.println("O resultado da divisão é " + divisao);

        int n5 = 10;
        int n6 = 5;
        var subtracao = n5 - n6;

        System.out.println("O resultado da subtração é " + subtracao);

        int n7 = 5;
        int n8 = 5;
        var multiplicacao = n7 * n8;

        System.out.println("O resultado da multiplicação é " + multiplicacao);

        int n9 = 14;
        int n10 = 3;
        var resto = n9 % n10;

        System.out.println("O resultado da sobra é " + resto);

        int n11 = ((4 + 2) * 10);
        var procedencia = n11;

        System.out.println("O resultado é " + procedencia);

        double n12 = 1.60;
        double n13 = 1.40;
        var virgula = n12 + n13;

        System.out.println("O valor é " + virgula);

    }
}

