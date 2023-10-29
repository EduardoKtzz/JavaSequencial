package Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exerScanner {
    
    public static void main(String[] args) {
        

               //SOMAR
    Locale.setDefault(Locale.US);    
    Scanner sc = new Scanner(System.in);

        int A, B, soma;

        A = sc.nextInt();
        B = sc.nextInt();
        soma = A + B;

    System.out.println("SOMA = " + soma);

                //AREA

        double R, area;
        double pi = 3.14159;
        int dois = 2;

        R = sc.nextDouble();
        R = Math.pow(R, dois);
        area = R * pi;

    System.out.printf("Área: %.4f%n", area);

                //DIFERENÇA

        int s1, s2, s3, s4, dif;

        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        s4 = sc.nextInt();

        dif = s1 * s2 - s3 * s4;

    System.out.println("DIFERENÇA = " + dif);

                //CALCULO DE SALARIO

        int numero, horas;
        double valorHora, salario;
        
        numero = sc.nextInt();
        horas = sc.nextInt();
        valorHora = sc.nextDouble();
        
        salario = valorHora * horas;

    System.out.println("NUMBER = " + numero);    
    System.out.printf("SALARY = U$ %.2f%n", salario);

                //CALCULO DE COMPRAS DE PEÇAS

        double valor, valorTotal;
        int id, quantidade;

        id = sc.nextInt();
        quantidade = sc.nextInt();
        valor = sc.nextDouble();

        valorTotal = valor * quantidade;

    System.out.println("PEÇA = " + id);    
    System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);

                    //TRIANGULO

        double A1, B1, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		A1 = sc.nextDouble();
		B1 = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = A1 * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A1 + B1) / 2.0 * C;
		quadrado = B1 * B1;
		retangulo = A1 * B1;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
	
        sc.close();

    }

}
