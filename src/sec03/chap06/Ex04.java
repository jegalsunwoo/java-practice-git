package sec03.chap06;

import java.util.Locale;
// 대소문자 변환
public class Ex04 {
    public static void main(String[] args) {
        String str_1 = "AbcDeFG";

        str_1 = str_1.toUpperCase();
        System.out.println(str_1);
        str_1 = str_1.toLowerCase();
        System.out.println(str_1);

        String str_2 = "Hello! I'm fine Thank you";
        String str_3 = "thank";

        boolean bool_1 = str_2.toUpperCase().contains(str_3.toUpperCase());
        boolean bool_2 = str_2.toLowerCase().contains(str_3.toLowerCase());
    }
}
