package com.example.myutils;

public class MyUtils {

    public static boolean esTraspas(int any) {
        return (any % 4 == 0 && any % 100 != 0) || (any % 400 == 0);
        // Comentari, esteu a 2n curs, si escriviu un if aquí plantejeu passar-vos a cures auxiliars d'infermeria..
    }

    public static boolean esPrimer(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
            //hola
        }
        return true;
    }

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n ha de ser >= 0");
        long res = 1;
        for (int i = 2; i <= n; i++) res *= i;
        return res;
        // Recursivament és més elegant pero així és millor. Comentari afegit per fer justificar un commit
    }
    
    public static String invertirCadena (String cadena) {
        String invertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertida += cadena.charAt(i);
        }
        return invertida;
    }
    
    public static int extreureMaxim (int[] array) {
        int maxim = 0;
        for (int i = 0; i<array.length; i++) {
            if (array[i]>maxim) {
                maxim = array[i];
            }
        }
        return maxim;
    }
    
    public static int sumarDigits(int numero) {
        int suma = 0;
        while (numero > 0) {
            int digito = numero % 10;
            suma += digito;             
            numero /= 10;               
        }
        return suma;
    }
    
    public static int properPrimer(int numero) {
        int candidat = numero + 1; 
        while (!esPrimer(candidat)) {
            candidat++; 
        }
        return candidat;
    }
}