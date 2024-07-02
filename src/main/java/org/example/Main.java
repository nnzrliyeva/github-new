package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(numberToString[] args) {
//        System.out.println(solution("Wolrd"));
//        System.out.println(solution("Word"));
    }

    public static String solution(numberToString str) {

        String result = "";

        for (int a = str.length() - 1; a >= 0; a--) {
            result += str.charAt(a);
        }
        return result;
    }


    public static Double multiply(Double a, Double b) {
        return a * b;
    }


    public static int makeNegative(final int x) {

        return x > 0 ? -x : x;
    }


    class Kata {
        public static String numberToString(int num) {
            return String.valueOf(num);
        }
    }

    public class Positive {

        public static int sum(int[] arr) {
            int total = 0;
            for (int num : arr) {
                if (num > 0) {
                    total += num;
                }
            }
            return total;
        }
    }

    public class Solution {
        public static String repeatStr(final int repeat, final String string) {
            return string.repeat(repeat);
        }
    }

    public class RemoveChars {
        public static String remove(String str) {
            if (str.length() <= 2) {
                return "";
            }
            return str.substring(1, str.length() - 1);
        }
    }
    public class StringToNumber {
        public static int stringToNumber(String str) {

            return Integer.parseInt(str);
        }
    }
    public class HelloWorld {
        public static String greet() {
            return "hello world!";
        }
    }
    public class SmallestIntegerFinder {
        public static int findSmallestInt(int[] args) {
            int smallest = args[0];
            for (int i = 0; i < args.length; i++)
                if (args[i] < smallest){
                    smallest = args[i];
                }
            return smallest;
        }
    }
}









