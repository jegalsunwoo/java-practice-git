package sec04.chap03;

public class 재귀함수 {
    public static void main(String[] args) {

        int num = 0;

        increaseNum(num);

        int result = factorial(4);
        System.out.println(result);

    }
    static void increaseNum(int num){
        System.out.println(num);

        if(num<10){
            increaseNum(++num);
        }
        else{
            System.out.println("종료");
            return;
        }
    }

    static int factorial(int num){
        return num==0 ? 1:num*factorial(--num);
    }


}
