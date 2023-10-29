package Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicioFinal {
    
    

    public static void main(String[] args) {
        
                                // CODE PARA SOMAR
         
        int n1 = 10;
        int n2 = 30;
        var soma = n1 + n2;
        System.out.println("A soma dos dois valores é igual a " + soma);

        int n3 = -30;
        int n4 = 10;
        var soma2 = n3 + n4;
        System.out.println("A soma dos dois valores é igual a " + soma2);

        int n5 = 0;
        int n6 = 0;
        var soma3 = n5 + n6;
        System.out.println("A soma dos dois valores é igual a " + soma3);
        
                                 // CODE PARA LER O VALOR DO RAIO

        double area1 = 2.00;
        double area2 = 100.64;
        double area3 = 150.00;
        double pi = 3.14159;
        double quadrado = 2;
        double A, B, C;

        Locale.setDefault(Locale.US);
            A = Math.pow(area1, quadrado);
            var resultado = A * pi;

        System.out.printf("O resultado da área é: %.4f%n", resultado);

            B = Math.pow(area2, quadrado);
            var resultado2 = B * pi;

        System.out.printf("O resultado da área é: %.4f%n", resultado2);

            C = Math.pow(area3, quadrado);
            var resultado3 = C * pi;

        System.out.printf("O resultado da área é: %.4f%n", resultado3);

                                    // CODE PARA CALCULAR A DIFERENÇA (A * B - C * D)

            int s1 = 5;
            int s2 = 6;
            int s3 = 7;
            int s4 = 8;
        
        var somatotal = s1 * s2 - s3 * s4;
        System.out.println("A diferença entre os números é de: " + somatotal);

            int x1 = 5;
            int x2 = 6;
            int x3 = -7;
            int x4 = 8;

        var somatotal1 = x1 * x2 - x3 * x4;
        System.out.println("A diferença entre os números é de: " + somatotal1);

                                    // CODE PARA CALCULAR UM SALARIO DE UMA PESSOA DE ACORDO COM AS HORAS TRABALHADAS


        Locale.setDefault(Locale.US);

            int id = 25;
            int horas = 100;
            double dinheiro = 5.50;

        var salario = dinheiro * horas;
        System.out.printf("O funcionário com id %d, receberá R$ %.2f reais%n", id, salario);

            int id1 = 1;
            int horas1 = 200;
            double dinheiro1 = 20.50;

        var salario1 = dinheiro1 * horas1;
        System.out.printf("O funcionário com id %d, receberá R$ %.2f reais%n", id1, salario1);

            int id2 = 6;
            int horas2 = 145;
            double dinheiro2 = 15.55;

        var salario2 = dinheiro2 * horas2;
        System.out.printf("O funcionário com id %d, receberá R$ %.2f reais%n", id2, salario2);

                         // CODE PARA CALCULAR O VALOR TOTAL DE UMA COMPRA ENVOLVENDO VARIAS PEÇAS

        Locale.setDefault(Locale.US);

            double preço = 5.30;

            int quantidadepeça1 = 2;
            double preço1 = 5.10;

            var peça2 = preço1 * quantidadepeça1;
            var preçototal = peça2 + preço;

        System.out.printf("O valor total das peças é de %.2f reais%n", preçototal);

            int quantidadepeça = 2;
            double preço2 = 15.30;

            int quantidadepeça2 = 4;
            double preço3 = 5.20;

            var peça13 = preço2 * quantidadepeça;
            var peça161 = preço3 * quantidadepeça2;

            var preçototal1 = peça13 + peça161;

        System.out.printf("O valor total das peças é de %.2f reais%n", preçototal1);

                         // CODE PARA CALCULAR LADOS DE UM TRIANGULO

        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A1, B1, C1, triangulo, circulo, trapezio, quadrado1, retangulo;
		
            A1 = sc.nextDouble();
            B1 = sc.nextDouble();
            C1 = sc.nextDouble();
		
		triangulo = A1 * C1 / 2.0;
		circulo = 3.14159 * C1 * C1;
		trapezio = (A1 + B1) / 2.0 * C1;
		quadrado1 = B1 * B1;
		retangulo = A1 * B1;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado1);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();
        

    }


}
