package ru.gb;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
 * n! (произведение чисел от 1 до n)
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner (System.in);
        System.out.print ("Введите число n: ");
        int n = in.nextInt();
        in.close ();
        int sum = 0;
        int mult1 = 1;                      // для n до 13
        BigInteger mult2 = BigInteger.ONE;  // для больших значений
        for (int i = 1; i <= n; i++){
            sum = sum + i;
            mult1 = mult1 * i;
            mult2 = mult2.multiply(BigInteger.valueOf(i));

        }
        System.out.printf ("Сумма чисел от 1 до n: %d \n", sum);
        System.out.printf ("Произведение чисел от 1 до n: %d \n", mult1);
        System.out.printf ("Произведение чисел от 1 до n: %d \n", mult2);
    }
}