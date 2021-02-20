package com.company;
import static java.lang.Math.abs;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        float x = scan.nextFloat();
        System.out.println("Введите второе число");
        float y = scan.nextFloat();

        toCompare comp = new toCompare();
        comp.compare(x, y);
    }
}
interface Comparator{
    void compare(float x, float y);
}
class toCompare implements Comparator {
    public void compare(float x, float y) {
        if (abs(x) > abs(y)){
            System.out.println("Первое число больше второго по модулю");
        }
        else if (abs(x) == abs(y)){
            System.out.println("Первое и второе числа равны по модулю");
        }
        else {
            System.out.println("Первое число меньше второго по модулю");
        }
    }
}