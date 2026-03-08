package ru.mikhail.easy;

public class AddDigits_258 {

    public static void main(String[] args) {
        System.out.println(addDigits(10));
    }

    private static int addDigits(int num) {
        while(num >= 10) {
            int sum = 0;
            while(num % 10 != 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
