package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while (!(str = reader.readLine()).equals("exit")) {
            try {
                if(str.contains(".")) {
                    print(Double.parseDouble(str));
                }else {
                    int n = Integer.parseInt(str);
                    if(n > 0 && n < 128) {
                        print((short) n );
                    }else {
                        print(n);
                    }
                }
            }catch (Exception e){
                print(str);
            }
        }
        reader.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
