package com.javarush.test.level06.lesson11.home03;

/**
 * JavaRush.ru
 * Level 06, Lesson 11, home 03
 * <p/>
 * Переставить один модификатор static, чтобы пример скомпилировался.
 * <p/>
 * Date: 27.01.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static int A = 5;
    public int B = 2;
    public int C = A * B;

    public static void main( String[] args )
    {
        A = 15;
    }
}


//Исходный вариант:
//public class Solution
//{
//
//    public int A = 5;
//    public int B = 2;
//    public static int C = A*B;
//
//    public static void main(String[] args)
//    {
//        A = 15;
//    }
//
//}