package ru.netology.sqr;

public class SQRService {

    public static int sqrCalculate(int lowBand, int hiBand) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int j = i * i;
            if (j >= lowBand && j <= hiBand) {
                counter++;
                System.out.println("В границах диапазона " + i + " общее число в диапазоне = " + counter);
            }
        }
        System.out.println("Вышли из границ заданного диапазона");
        return counter;
    }
}
