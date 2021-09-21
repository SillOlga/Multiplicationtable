/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtable;


import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Vladimir
 */
public class Multiplicationtable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Создаем переменные, которые будут хранить коды для цвета текста.
    String colorReset = "\u001B[0m"; // Необходимо указать в конце строки, чтобы сбросить цвет обратно на стандартный.
    String red = "\u001B[31m";
    String green = "\u001B[32m";

    Random r = new Random();
    int a, b; // Два будущих случайных числа.
    int score = 0; // Число правильных ответов. Пока что 0, т.к. ещё ни один пример не был решен.

    Scanner s = new Scanner(System.in);

    // Цикл, который будет выполнять код 5 раз, так как в задании сказано создать 5 примеров.
    for (int i = 0; i < 5; i++) {
        // Генерируем два случайных числа от 0 до 10. Сохраняем их в ранее созданные переменные.
        a = r.nextInt(11);
        b = r.nextInt(11);

        // System.out.print() в конце не добавляет знак перехода на новую строку,
        // поэтому ответ можно писать сразу после выражения.
        System.out.print(a + " * " + b + " = ");
        if (s.nextInt() == a * b) {
            System.out.println(green + "Правильно!" + colorReset);
            score += 1; // Увеличиваем число правильных ответов на 1.
        } else {
            System.out.println(red + "Ошибка!" + colorReset);
        }
    }

        // Смотрим, сколько правильных ответов дал пользователь, и выдаем комментарий.
        switch (score) {
            case 5:
                System.out.println("Молодец!");
                break;
            case 4:
            case 3:
                System.out.println("Надо бы ещё поучить.");
                break;
            default:
                System.out.println("Срочно нужно учить таблицу умножения!");
                break;
        }
    
    }
    
    
    


