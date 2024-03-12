package sec02.chap03;

public class Ex03_04 {
    public static void main(String[] args) {
        int age = 20;
        boolean isMarried = false;
        double height = 179.99;
        char sex = 'M';
        String name = "홍동길";

        System.out.println(age);

        age = 30;

        System.out.println(age);
//        자바같은 컴파일 언어는 정적 자료형을 사용해서 이후에 다른 자료형으로 변경 불가능
//        같은 변수를 두 번 선언하는 것 불가
//        age = "안녕";


//        char ch1, ch2, ch3 선언만 한번에 여러개
        char ch4 = 'A', ch5 = 'B';
        char ch1 = 'C', ch2 = 'D';
    }
}
