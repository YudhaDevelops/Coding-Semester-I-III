/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rekursif;

/**
 *
 * @author Andreas
 */
public class Recursif {

    public static void main(String[] args) {
        double S = 27;
//        System.out.println(faktorial(5));
//        faktorial(5);
//        System.out.println(akarKuadrat(5, 0, 5) + " War");
        System.out.println(jmlDigit((int) S));
        System.out.println("S = " + S);
//        System.out.println("Code 1 : " + akarKuadrat2(S));
//        System.out.println("Lord   : " + hitungAkar_2(S));
//        System.out.println("Mekel  : " + hitungAkar(S));
//        System.out.println("Code 2 : " + sqrt(S, 1.4, S));
//        System.out.println("Code 2 : " + akar(S) + " (MODIF)");
        System.out.println("Cibrit : " + cibrit(S));
        System.out.println("Cbrt   : " + Cbrt(S));
        System.out.println("Lord   : " + hitungAkar_3(S));
    }

    public static int faktorial(int n) {
        if (n == 1 || n == 0) {
            System.out.print(1 + " = ");
            return 1;
        } else {
            System.out.print(n + ".");
            return n * faktorial(n - 1);
        }
    }
    
// Coba 1//
    public static double akarKuadrat(double bil, double akar, double galat) {
        double akarBaru = (akar + (bil / akar)) / 2.0;
        galat = akar - akarBaru;
        akar = akarBaru;
        if (galat > 0.00001) {
            return akarKuadrat(bil, akar, akarBaru);
        }
        if (-galat > 0.00001) {
            return akarKuadrat(bil, akarBaru, galat);
        }
        return akar;
    }
// Coba 1 //
    

/* SEPAKET */
    public static double GetSquareRoot(double n, double low, double high) {
        double errorMargin = 0.000000000001;
        double sqrt = (low + high) / 2;
        double diff = sqrt * sqrt - n;
        if (n == 1) {
            return 1;
        }
        if (diff > errorMargin) {
            return GetSquareRoot(n, low, sqrt);
        }
        if (-diff > errorMargin) {
            return GetSquareRoot(n, sqrt, high);
        }

        return sqrt;
    }

    public static double akarKuadrat2(double x) {
        return GetSquareRoot(x, 0, x);
    }
/* SEPAKET */
    
// babilonia //
    static double sqrt(double S, double x, double n) {

        if (S == 0 || S == 1) {
            return S;
        }
        if (n <= 0) {
            return x;
        } else {
            return sqrt(S, 0.5 * (x + S / x), n - 1);
        }

    }

    static double akar(double S) {
        int jml = jmlDigit((int) S);
        if (S <= 4) {
            return sqrt(S, 1.4, S);
        }
        if (jml >= 4) {
            return sqrt(S, jml * Math.pow(10, 2), jml);
        }
        return sqrt(S, jml * Math.pow(10, 2), S);
    }
// babilonia //

    
// cbrt ///
    static double cobrot(double S, double x, double n) {

        if (S == 0 || S == 1) {
            return S;
        }
        if (n <= 0) {
            return x;
        } else {
            return cobrot(S, (1.0 / 3.0) * ((2 * x) + (S / (x * x))), n - 1);
        }

    }

    static double cibrit(double S) {
        int jml = jmlDigit((int) S);
        if (S <= 13) {
            return cobrot(S, 1.3, S);
        }
        if (jml >= 5) {
            return cobrot(S, jml * Math.pow(10, 1), jml);
        }
            return cobrot(S, jml * Math.pow(10, 2), S);
    }
// cbrt ///

    
    


    
/* SEPAKET  */
    public static double GetCubicRoot(double n, double low, double high) {
        double errorMargin = 0.00001;
        double cbrt = (low + high) / 2;
        double diff = cbrt * cbrt * cbrt - n;
        
        if (n == 1) {
            return 1;
        }
        if (diff > errorMargin/Math.pow(10, jmlDigit(n))) {
            return GetCubicRoot(n, low, cbrt);
        }
        if (-diff > errorMargin/Math.pow(10, jmlDigit(n))) {
            return GetCubicRoot(n, cbrt, high);
        }
        return cbrt;
    }

    public static double Cbrt(double n) {
        return GetCubicRoot(n, 0, n);
    }
/* SEPAKET  */
    
    
    // hitung jumlah digit
    public static int jmlDigit(int n) {
        String s = Integer.toString(n);
        return s.length();
    }
    
    public static double jmlDigit(double n) {
        String s = Double.toString(n);
        return s.length();
    }

    

    /* Akar 1.0 */
    static int count = 0;
    public static double hitungAkar(double bil) {
        if (bil == 0 || bil == 1) {
            return bil;
        }
        if (count * count < bil && (count + 1) * (count + 1) > bil) {
            return count + ((bil - count * count) / ((count + 1) * (count + 1) - count * count));
        } else if (count * count != bil) {
            count++;
            return hitungAkar(bil);
        } else {
            double temp = count;
            count = 0;
            return temp;
        }
    }
/* Akar 1.0 */
    
    /* Looping */
    public static double hitungAkar_2(double bil) {
        double akar, akarBaru, galat;
        akar = bil;
        galat = akar;
        while (galat > 0.000000000001) {
            akarBaru = (akar + (bil / akar)) / 2.0;
            galat = akar - akarBaru;
            akar = akarBaru;
        }
        return akar;
    }
    
    public static double hitungAkar_3(double bilangan) {
        double hitung, akarBaru, galat, akar;
        akar = bilangan;
        galat = akar;
        while (galat > 0.000001) {
            akarBaru = (((2 * akar) + (bilangan / (akar * akar))) / 3);
            galat = akar - akarBaru;

            akar = akarBaru;
        }
        return akar;
    }
    /* Looping */

}
