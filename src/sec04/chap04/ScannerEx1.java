package sec04.chap04;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("boolean을 입력하세요 : ");
//
//        while(sc.hasNextBoolean()){//hasNextBoolean() -> 자료형이 boolean 이면 true 반환
//            System.out.println("입력된 값 : "+sc.nextBoolean());
//        }
//
//        System.out.println("끝");
//
//        System.out.print("정수 입력하세요 : ");
//
//        while(sc.hasNextInt()){//hasNextBoolean() -> 자료형이 boolean 이면 true 반환
//            System.out.println("입력된 값 : "+sc.nextInt());
//        }

//        System.out.println("단어를 입력해주세요.");
//
//        while (sc.hasNext()) {
//            String nextWord = sc.next();
//            if (nextWord.equalsIgnoreCase("quit")) break;
//            System.out.println("입력값: " + nextWord);
//        }
//
//        System.out.println("문장을 입력해주세요.");
//
//        while (sc.hasNextLine()) {
//            String nextSentence = sc.nextLine();
//            if (nextSentence.equalsIgnoreCase("quit")) break;
//            System.out.println("입력값: " + nextSentence);
//        }

//        while (sc.hasNextInt()) {
//            int repeatCount = sc.nextInt();
//

//            //  repeatCount 변수에 담은 이유
//            for (int i = 0; i < repeatCount; i++) {
//                //  💡 print (ln이 붙지 않은) : 같은 줄에 이어 출력
//                System.out.print("호우 ");
//            }
//            System.out.println("");
//        }
//        //  문자열 바로 입력하여 사용하기

        String [] strInputs = new String [5];

        for (int i = 0; i < strInputs.length; i++) {
            strInputs[i] = sc.nextLine();
        }


        for (String str : strInputs) {
            System.out.println(str);
        }

        sc.close();

    }
}
