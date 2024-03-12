package sec04.chap02;

public class ForEach {
    public static void main(String[] args) {

//        //기본적인 for 문
//        int[] iarr = {10,20,30,40,50};
//
//        for(int i=0; i<iarr.length; i++){
//            System.out.println(iarr[i]);
//        }
//
//        //for문을 이용한 간단한 구구단 예제
//        for(int i =1; i<=9; i++){
//            for(int j=2; j<=9; j++){
//                System.out.printf("%d X %d = %d\n",i,j,i*j);
//            }
//        }
//
//        //for-each문
//        //for(타입 변수명:출력하고싶은 자료구조)
//        for(int value:iarr){
//            System.out.println(value);
//        }
//
//        System.out.println("\n- - - - -\n");
//
//        String str = "안녕 하세요";
//        for (String s : str.split(" ")) { //.split() 입력받은 정규표현식 또는 특정 문자를 기준으로 문자열을 나누어 배열에 저장하여 리턴
//            System.out.println(s);
//        }
//
//        String[][] quotesInLangs = {{ "I am vengeance.", "I am night.", "I am Batman.",}, {"나는 복수를 하지.", "나는 밤이지.", "나는 배트맨이지.",},};
//
//        String result = "";
//        for (String[] quotes : quotesInLangs) {
//            for (String quote : quotes) {
//                result += quote + " ";
//                System.out.println("11"+result);
//            }
//            System.out.println("11111111111111111");
//            result = result.trim().concat("\n");
//        }
//
//        System.out.println(result);

        //label링
        outer:
        for(int i=0; i<10; i++)
        {
            inner:
            for(int j=0; j<10; j++)
            {
                if(i % 2 ==0) continue inner;
                if(i*j >= 30) continue outer;

                if(j>5) break inner;
                if(i-j>7) break outer;
                System.out.printf("i: %d, j: %d\n", i, j);
            }
            System.out.println("-----------------------");
        }
    }
}
