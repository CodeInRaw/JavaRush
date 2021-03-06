package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * JavaRush.ru
 * Level 05, Lesson 12, bonus 02
 * <p/>
 * Нужно добавить в программу новую функциональность.
 * Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
 * Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
 * <p/>
 * Date: 25.01.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        int a = Integer.parseInt( reader.readLine() );
        int b = Integer.parseInt( reader.readLine() );
        int c = Integer.parseInt( reader.readLine() );
        int d = Integer.parseInt( reader.readLine() );
        int e = Integer.parseInt( reader.readLine() );

        int minimum = min( a, b, c, d, e );

        System.out.println( "Minimum = " + minimum );
    }


    public static int min( int a, int b, int c, int d, int e )
    {
        int minimum = a < b ? a : b;

        minimum = minimum < c ? minimum : c;
        minimum = minimum < d ? minimum : d;
        return minimum < e ? minimum : e;
    }
}


//Исходный текст программы:
//public class Solution
//{
//
//    public static void main(String[] args) throws Exception
//    {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(reader.readLine());
//        int b = Integer.parseInt(reader.readLine());
//
//        int minimum = min(a,b);
//
//        System.out.println("Minimum = "+minimum);
//    }
//
//
//    public static int min(int a, int b)
//    {
//        return a < b ? a : b;
//    }
//
//}
