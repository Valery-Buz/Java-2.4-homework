package ru.netology.sqr;
public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();

        int myDown = 200;
        int myUp = 300;
        System.out.println("Calculate SQR from "+myDown+" to "+myUp); // Выводим начальные значения
        System.out.println("Result = "+SQRService.sqrCalculate(myDown, myUp)); // Вызываем расчет (метод sqrCalculate класса SQRService, передавая значения окна диапазона)
    }
}
