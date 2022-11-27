package ru.gb;

import java.util.Scanner;

/**
 * Реализовать простой калькулятор
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число A: ");
        float a = iScanner.nextFloat();
        System.out.printf("Введите операцию: ");
        String operation = iScanner.next();
        System.out.printf("Введите число B: ");
        float b = iScanner.nextFloat();

        if (operation.contains("+")) {
            System.out.printf("%.2f + %.2f = %.2f", a, b, a + b);
            System.out.println();
        }
        else if (operation.contains("-")) {
            System.out.printf("%.2f - %.2f = %.2f", a, b, a - b);
            System.out.println();
        }
        else if (operation.contains("*")) {
            System.out.printf("%.2f * %.2f = %.2f", a, b, a * b);
            System.out.println();
        }
        else if (operation.contains("/")) {
            System.out.printf("%.2f / %.2f = %.2f", a, b, a / b);
            System.out.println();
        }
        iScanner.close();
    }
}