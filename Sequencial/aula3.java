package Sequencial;

import java.util.Locale;

// %s para String
// %d para número inteiro
// %f número flutuante
// %n quebra de linha

public class aula3 {
    public static void main(String[] args) {
        
        String produto1 = "Computer";
        

        int age = 30;
        int code = 5290;

        char gender = 'F';

        double price1 = 2100.0;
        double measure = 53.75676475;

        System.out.println("Products:");
        System.out.printf("%s, with the price of $%.2f real%n", produto1, price1);

        System.out.printf("%n");

        System.out.print("Record: ");
        System.out.printf("%d years old, code %d and gender: %s %n", age, code, gender);

        System.out.printf("%n");

        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);


    }
}
