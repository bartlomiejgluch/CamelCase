package pl.projects.bartek.camelcase;

import java.util.Scanner;

public class CamelCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj słowo w stylu camelCase:");
        String camel;

        camel = scanner.nextLine();

        int counter = 0;

        if (camel.isEmpty() || Character.isUpperCase(camel.charAt(0))) {

            System.out.println("To słowo nie jest w stylu camelCase");
            return;

        }

        for (int i = 0; i < camel.length(); i++) {
            if (i==0) {
                counter++;
            }
            if (Character.isDigit(camel.charAt(i))) {

                System.out.println("Słowo nie powinno zawierać liczb");
                return;
            }
            if (Character.isUpperCase(camel.charAt(i))) {

                counter++;
            }
        }
        System.out.println(counter);



    }
}




