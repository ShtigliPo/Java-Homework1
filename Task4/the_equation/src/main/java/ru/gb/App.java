package ru.gb;

/**
 * Задано уравнение вида q + w = e, где q, w, e >= 0.
 * Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
 * Требуется восстановить выражение до верного равенства. 
 * Предложить хотя бы одно решение или сообщить, что его нет.
 */
public class App 
{
    public static void main( String[] args )
    {
       for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                if ((10 + i) + ((j *10) + 5) == 69) {
                    System.out.printf("Равенство верно, если i = %d, j = %d\n", i, j);
                    System.out.printf("1%d + %d5 = 69\n", i, j);
                    break;
                }
            }
       }
    }
}