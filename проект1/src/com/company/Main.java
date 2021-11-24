
package com.company;


import java.util.Scanner;

public class Main {
    public static double logab(double a, double b) {
        return Math.log(b) / Math.log(a);
    }

    public static void main(String[] args) {

        System.out.println("Введите 1 чтобы перейти к элементарным операциям");
        System.out.println("Введите 2 чтобы перейти к триганометрическим операциям");
        System.out.println("Введите 3 чтобы перейти к операциям с log");
        Scanner scanner = new Scanner(System.in);
        byte sk = scanner.nextByte();

        if (sk == 1) {
            System.out.println("Введите 1 чтобы перейти к сложению");
            System.out.println("Введите 2 чтобы перейти к вычитанию");
            System.out.println("Введите 3 чтобы перейти к умножению");
            System.out.println("Введите 4 чтобы перейти к делению");
            byte eo = scanner.nextByte();
            if (eo == 1) {
                System.out.println("Введите переменную a");
                double a = scanner.nextDouble();
                System.out.println("Введите переменную b");
                double b = scanner.nextDouble();
                double n = a + b;
                System.out.println("Результат сложения равен: " + n);
            }
            if (eo == 2) {
                System.out.println("Введите переменную a");
                double a = scanner.nextDouble();
                System.out.println("Введите переменную b");
                double b = scanner.nextDouble();
                double n = a - b;
                System.out.println("Результат вычитания равен: " + n);
            }
            if (eo == 3) {
                System.out.println("Введите переменную a");
                double a = scanner.nextDouble();
                System.out.println("Введите переменную b");
                double b = scanner.nextDouble();
                double n = a * b;
                System.out.println("Результат умножения равен: " + n);
            }
            if (eo == 4) {
                System.out.println("Введите переменную a");
                double a = scanner.nextDouble();
                System.out.println("Введите переменную b");
                double b = scanner.nextDouble();
                if (b == 0) {
                    System.out.println("Заменатель равен 0");
                } else {
                    double n = a / b;
                    System.out.println("Результат деления равен: " + n);
                }
            }
        }
        if (sk == 2) {
            System.out.println("Введите 1 чтобы вычислить sin x");
            System.out.println("Введите 2 чтобы вычислить cos x");
            System.out.println("Введите 3 чтобы вычислить tan x");
            System.out.println("Введите 4 чтобы вычислить ctg x");
            System.out.println("Введите 5 чтобы вычислить sin 2x");

            byte tr = scanner.nextByte();
            if (tr == 1) {
                System.out.println("Введите x");
                double x = scanner.nextDouble();
                double n = Math.sin(x);
                System.out.println("Значение x: " + n);
            }
            if (tr == 2) {
                System.out.println("Введите x");
                double x = scanner.nextDouble();
                double n = Math.cos(x);
                System.out.println("Значение x: " + n);
            }
            if (tr == 3) {
                System.out.println("Введите x");
                double x = scanner.nextDouble();
                double n = Math.tan(x);
                System.out.println("Значение x: " + n);
            }
            if (tr == 4) {
                System.out.println("Введите x");
                double x = scanner.nextDouble();
                double n = Math.cos(x) / Math.sin(x);
                System.out.println("Значение x: " + n);
            }
            if (tr == 5) {
                System.out.println("Введите x, sin x");
                double x = scanner.nextDouble();
                System.out.println("Введите t, cos t");
                double t = scanner.nextDouble();
                double n = 2 * (Math.sin(x)) * (Math.cos(t));
                System.out.println("sin 2x: " + n);
            }
            if (tr == 6) {
                System.out.println("Введите x, sin x");
                double x = scanner.nextDouble();
                System.out.println("Введите t, cos t");
                double t = scanner.nextDouble();
                double n = Math.pow(Math.cos(t), 2) - Math.pow(Math.sin(x), 2);
                System.out.println("cos 2x: " + n);
            }
        }
        if (sk == 3) {
            System.out.println("Введите 1 чтобы вычислить log a по основанию b");
            System.out.println("Введите 2 чтобы вычислить log b*c по основанию a");
            System.out.println("Введите 3 чтобы вычислить log b/a по основанию a");
            byte lg = scanner.nextByte();
            if (lg == 1) {
                System.out.println("Введите а");
                System.out.println("Введите b");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double n = logab(b, a);
                System.out.println(" log a по основанию b: " + n);
            }
            if (lg == 2) {
                System.out.println("Введите а");
                System.out.println("Введите b");
                System.out.println("Введите c");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double n = (logab(b, a)) + (logab(c, a));
                System.out.println("log b*c по основанию a: " + n);
            }
            if (lg == 3) {
                System.out.println("Введите а");
                System.out.println("Введите b");
                System.out.println("Введите c");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double n = (logab(b, a)) - (logab(c, a));
                System.out.println("log b/c по основанию a: " + n);
            }
        }


    }
}



