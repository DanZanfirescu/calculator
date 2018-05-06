package com.company;
import java.util.Scanner;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("OPERATII +, -, /, *");
        System.out.println("Primul termen:");
            Scanner tastatura = new Scanner(System.in);
            double x = Double.parseDouble(tastatura.nextLine());
        System.out.println("Al doilea termen:");
            double y = Double.parseDouble(tastatura.nextLine());

            Calculator calc = new Calculator();

        System.out.println("Adunare:............................" + calc.adunare(x,y));
        System.out.println("Scadere:............................" + calc.scadere(x,y));
        System.out.println("Impartire:.........................." + calc.impartire(x,y));
        System.out.println("Inmultire:.........................." + calc.inmultire(x,y));

        System.out.println("CALCUL PROCENTUAL");
        System.out.println("Indica valoarea intregului:");
            double intreg = Double.parseDouble(tastatura.nextLine());
        System.out.println("Indica valoarea procentului:");
            double procent = Double.parseDouble(tastatura.nextLine());
        System.out.println("Rezultat procent:...................." + calc.procent(intreg,procent));

        System.out.println("RIDICARE LA PUTERE");
        System.out.println("Indica valoarea bazei:");
            double baza = Double.parseDouble(tastatura.nextLine());
        System.out.println("Indica valoarea exponentului:");
            double exponent = Double.parseDouble(tastatura.nextLine());
        System.out.println("Rrezultat ridicare la putere:......." + calc.putere(baza, exponent));

        System.out.println("CALCUL RADICAL");
        System.out.println("Indica valoarea de sub radical:");
            double subRad = Double.parseDouble(tastatura.nextLine());
        System.out.println("Indica ordinul radicalului:");
            double ordRad = Double.parseDouble(tastatura.nextLine());
        System.out.println("Rezultat radical:...................." + calc.radical(subRad,ordRad));
    }
}
