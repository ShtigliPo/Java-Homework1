package ru.gb;

/**
 * Вывести все простые числа от 1 до 1000
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        for (int i = 2; i <= 1000; i++){
            boolean conformity = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    conformity = false;
                    break;
                }
            }
            if (conformity) {
                System.out.print(i + ", ");
            }
        }
    }
}

