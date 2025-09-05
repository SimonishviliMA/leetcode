package ru.mikhail.easy;

public class AddBinary_67 {

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }


    private static String addBinary(String a, String b) {

        if (a.isEmpty()) return b;
        if (b.isEmpty()) return a;
        if (a.length() < b.length()) return addBinary(b, a);

        char[] maxArr = a.toCharArray();
        char[] minArr = b.toCharArray();
        boolean plusOne = false;
        int maxLength = maxArr.length;
        int minLength = minArr.length;
        char[] result = new char[maxLength + 1];

        for (int i = 0; i < maxLength; i++) {
            int resultInd = maxLength - i;
            int maxInd = resultInd - 1;
            char maxDig = maxArr[maxInd];

            int minInd = minLength - 1 - i;
            char minDig = minInd >= 0 ? minArr[minInd] : '0';

            if (maxDig == minDig) {
                result[maxInd + 1] = plusOne ? '1' : '0' ;
                plusOne = maxDig == '1';
            } else {
                result[maxInd + 1] = plusOne ? '0' : '1';
            }
        }
        if (plusOne) {
            result[0] = '1';
            return new String(result);
        } else {
            return String.copyValueOf(result, 1, result.length - 1);
        }
    }
}
