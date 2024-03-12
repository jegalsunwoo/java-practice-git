package sec04.chap04;

import sec05.chap03.ex01.SmartPhone;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Scanner 객체를 생성  new는 새로운 객체를 heap 메모리에 할당하겠다는 의미 System.in은 화면에서 입력을 받겠다는 의미
//        System.out.print("str1 입력 : ");
//        String str1 = sc.next(); //next는 스페이스바 등 공백 단위로 끊어서 문자열을 받음 잘 사용하지 않음
//        System.out.println("str 1 : "+str1);


        System.out.print("str3 입력 : ");
        String str3 = sc.nextLine(); //nextline은 줄바꿈 단위로 끊어서 문자열을 받음

        System.out.print("boolean 입력 : ");
        boolean bool = sc.nextBoolean();

        System.out.print("int 입력 : ");
        int intNum = sc.nextInt();

        System.out.print("double 입력 : ");
        double dblNum = sc.nextDouble();

        System.out.println("str 3 : "+str3);
        System.out.println("bool: " + bool);
        System.out.println("intNum: " + intNum);
        System.out.println("dblNum: " + dblNum);

    }
}
