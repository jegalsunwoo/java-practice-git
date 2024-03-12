package sec03.chap06;

public class Ex01 {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = " \t\n";

        int int1 = str1.length();
        int int2 = str2.length();

        //  💡isEmpty : 문자열의 길이가 0인지 여부
        boolean bool1 = str1.isEmpty();
        boolean bool2 = str2.isEmpty();

        //  💡isBlank : 공백(white space)을 제외한 문자열의 길이가 0인지 여부
        boolean bool3 = str1.isBlank();
        boolean bool4 = str2.isBlank();

        String str3 = "\t 에 네 르 기 파!! \n";

        System.out.println(str3);
        str3 = str3.trim();
        System.out.println(str3);


        String str4 = "아야 슬슬 오함마 준비해야 쓰것다";

        // charAt : ~번째 문자 반환
        char ch1 = str4.charAt(0);
        char ch2 = str4.charAt(6);

        // 마지막 문자 얻기
        char ch3 = str4.charAt(str4.length() - 1);
    }
}
