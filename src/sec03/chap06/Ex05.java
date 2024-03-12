package sec03.chap06;
//문자열 이어붙이기
public class Ex05 {
    public static void main(String[] args) {
        //concat
        String str_1 = "안녕";
        String str_2 = "하세";
        String str_3 = "yo~";

        String str_5 = str_1+str_2+str_3+123+3.141592f;

        //concat은 문자열만 가능 null있으면 사용 불ㄹ가
        String str_4 = str_1.concat(str_2).concat(str_3);

        //StringBuilder
        String str_6 = new StringBuilder(str_1)
                .append(str_2)
                .append(str_3)
                .toString();// 이부분에서 str_1,str_2,str_3 을 + 한 문자열이 생성됨

        System.out.println(str_6);

        //반복하기 repeat
        String a = "Yo~";
        String b = a.repeat(2);
        System.out.println(b);

        String c = a.concat(" ").repeat(3).trim();
        System.out.println(c);

        //잘라오기 substring
        String sstr_1 = "오늘 저녁은 치킨이다!~";
        String sstr_2 = sstr_1.substring(7);//7부터 끝까지
        System.out.println(sstr_2);
        String sstr_3 = sstr_1.substring(7,10);// 7부터 9까지
        System.out.println(sstr_3);

        String piece1 = "늘 저";
        String piece2 = "치킨";

        int a1 = sstr_1.indexOf(piece1);
        System.out.println(a1);
        int a2 = sstr_1.indexOf(piece2);
        System.out.println(a2);
        int a3 = piece2.length();
        System.out.println(a3);

        String sstr_4 = sstr_1.substring(sstr_1.indexOf(piece1), sstr_1.indexOf(piece2)+piece2.length());
        System.out.println(sstr_4);

        //치환
        String b1 = "아버지는 짜장면이 싫다고 하셨어~";
        String b2 = b1.replace("아버지","어머니");
        System.out.println(b2);

        String b3 = b1.replace("아버지","엄마")
                .replace("짜장면","짜장".repeat(5))
                .replace("하셨어~","했지!");

        System.out.println(b3);
    }
}
