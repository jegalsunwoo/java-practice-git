package sec03.chap06;

public class Ex02 {
    public static void main(String[] args) {
        String str2 = "얄리 얄리 얄라셩 얄라리 얄라";

        // indexOf/lastIndexOf : 일치하는 첫/마지막 문자열의 위치
        // 앞에서부터 카운트해서 int로 반환

        // 두 번째 인자 : ~번째 이후/이전부터 셈
        int int1 = str2.indexOf('얄');
        int int2 = str2.indexOf('얄', 4);//4번 째 이후 처음 얄

        int  int3 = str2.indexOf("얄라");
        int  int4 = str2.lastIndexOf("얄라");
        int  int5 = str2.lastIndexOf("얄라", 12);

        // 포함되지 않은 문자는 -1 반환
        int int6 = str2.indexOf('욜');
    }
}
