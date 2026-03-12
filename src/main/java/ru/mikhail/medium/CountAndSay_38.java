package ru.mikhail.medium;

public class CountAndSay_38 {

    public static void main(String[] args) {
        System.out.println(countAndSay(9));
    }


    private static String countAndSay(int n) {
        String[] res = new String[]{"1"};
        dfs(n, res);
        return res[0];
    }

    private static void dfs(int n, String[] res) {
        if (n <= 1) return;
        dfs(n - 1, res);
        StringBuilder tmp = new StringBuilder();
        char prev = res[0].charAt(0);
        int counter = 0;
        for (int i = 0; i < res[0].length(); i++) {
            char c = res[0].charAt(i);
            if (prev == c) {
                counter++;
            } else {
                tmp.append(counter)
                        .append(prev);
                counter = 1;
                prev = c;
            }
        }
        tmp.append(counter)
                .append(prev);
        res[0] = tmp.toString();
    }
}
