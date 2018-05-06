package com.company;

public class Calculator {

    public double adunare(double x, double y) {
        return x + y;
    }

    public double scadere(double x, double y) {
        return x - y;
    }

    public double impartire(double x, double y) {
        return x / y;

    }

    public double inmultire(double x, double y) {
        return x * y;

    }

    public double procent(double intreg, double procent) {
        return (procent / 100) * intreg;
    }

    //public double putere(double baza, double exponent) {
    //    double rezultat = 1;
    //    double n = 1;

    //   if (baza >= 0 && exponent == 0) {
    //        rezultat = 1;
    //    } else if (baza == 0 && exponent >= 1) {
    //        rezultat = 0;
    //    } else if (exponent<0) {
    //       for (double i = -1; i>=exponent; i--){
    //            rezultat = rezultat*baza;
    //        }
    //        rezultat = n/rezultat;
    //    } else if (exponent>0) {
    //        for ( double i = 1; i <= exponent; i++) {
    //            rezultat = rezultat * baza;
    //        }
    //    }
    //    return rezultat;
    //}
    public double putere(double baza, double exponent) {
        return StrictMath.pow(baza, exponent);
    }

    public double radical(double subRad, double ordRad){
        return StrictMath.pow(subRad, 1/ordRad);
    }
}





