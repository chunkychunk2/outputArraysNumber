package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws Exception {
   /*     Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.
*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number[] = new int[3];
        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(reader.readLine());
        }
        if ((number[0] >= number[1] && number[0] <= number[2]) || (number[0] <= number[1] && number[0] >= number[2])) {
            System.out.println(number[0]);
        } else if ((number[1] >= number[0] && number[1] <= number[2]) || (number[1] <= number[0] && number[1] >= number[2])) {
            System.out.println(number[1]);
        } else {
            System.out.println(number[2]);
        }
    }
}
