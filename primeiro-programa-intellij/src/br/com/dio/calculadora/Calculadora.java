package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");

        int a = scan.nextInt();

        System.out.println("Digite o segundo valor");

        int b = scan.nextInt();

        int soma = somar(a,b);

        int subtrair = subtr(a,b);

        int multiplicar = multi(a,b);

        double dividir = divisão(a,b);

        System.out.println(soma);
        System.out.println(subtrair);
        System.out.println(multiplicar);
        System.out.println(dividir);
    }


    public static int somar(int a, int b){
        int soma = a + b;
        return soma;
    }
    public static  int subtr(int a, int b){
        return a - b;
    }
    public static int multi(int a, int b){
        return  a * b;
    }
    public static  double divisão(int a, double b){
        return a / b;
    }
}
