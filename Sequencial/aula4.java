package Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class aula4 {
    public static void main(String[] args) {
        
        //Definir uma string var a partir do teclado.

        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();

        System.out.println("Você digitou: " + x);

        //Definir uma número inteiro var a partir do teclado.

        int y;
        y = sc.nextInt();

        System.out.println("Sua idade é: " + y);

        //Definir um número flutuante var a partir do teclado.

        Locale.setDefault(Locale.US);
        double z;
        z = sc.nextDouble();

        System.out.println("Sua altura é: " + z);

        //Definir uma char var a partir do teclado.

        char a;
        a = sc.next().charAt(0);

        System.out.println("Seu sexo é: " + a);



        //Várias palavras antes de salvar

        String s0, s1, s2, s3;

        s0 = sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(s0);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        sc.close();

    }
    
}
