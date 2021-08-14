package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*

Алгоритм нахождения НОД делением
Большее число делим на меньшее.
Если делится без остатка, то меньшее число и есть НОД (следует выйти из цикла).
Если есть остаток, то большее число заменяем на остаток от деления.
Переходим к пункту 1.
Пример:
Найти НОД для 30 и 18.
30 / 18 = 1 (остаток 12)
18 / 12 = 1 (остаток 6)
12 / 6 = 2 (остаток 0)
Конец: НОД – это делитель 6.
НОД (30, 18) = 6.

Алгоритм нахождения НОД вычитанием
Из большего числа вычитаем меньшее.
Если получается 0, то значит, что числа равны друг другу и являются НОД (следует выйти из цикла).
Если результат вычитания не равен 0, то большее число заменяем на результат вычитания.
Переходим к пункту 1.
Пример:
Найти НОД для 30 и 18.
30 - 18 = 12
18 - 12 = 6
12 - 6 = 6
6 - 6 = 0
Конец: НОД – это уменьшаемое или вычитаемое.
НОД (30, 18) = 6

НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());

        System.out.println(getNOD(n1, n2));
    }

    private static int getNOD(int n1, int n2) {
        if(n1 < 1 || n2 < 1) {
            throw new IllegalArgumentException();
        }
//        поиск НОДа делением
//        while (n1 != 0 && n2 != 0) {
//            if(n1 > n2) {
//                n1 %= n2;
//            }else {
//                n2 %= n1;
//            }
//        }
//        return (n1 + n2);

//        поиск НОДа вычетанием
        while (n1 != n2) {
            if(n1 > n2) {
                n1 -= n2;
            }else {
                n2 -= n1;
            }
        }
        return n1;
    }
}
