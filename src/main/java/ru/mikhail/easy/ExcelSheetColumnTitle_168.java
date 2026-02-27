package ru.mikhail.easy;

public class ExcelSheetColumnTitle_168 {

    private static final int ALPH_LENGTH = 26;

    public static void main(String[] args) {
        System.out.println(convertToTitle(749));
    }

    private static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            result.insert(0, (char) ((columnNumber % ALPH_LENGTH) + 'A'));
            columnNumber /= 26;
        }
        return result.toString();
    }
}
