package sec03.chap08;

public class 원시자료형vs참조자료형 {
    public static void main(String[] args) {
        //원시자료형
        int a = 1;
        int b = 2;
        b=a;
        System.out.printf("a : %d, b : %d\n",a,b);
        a=3;
        System.out.printf("a : %d, b : %d\n",a,b);

        boolean bool1 = true;
        boolean bool2 = false;
        bool2=bool1;
        bool2 = false;
        System.out.printf("bool1 : %s, bool : %s\n",bool1,bool2);

        //참조자료형
        int[] intArry1 = new int[]{0,1,2,3,4};
        int[] intArry2 = new int[]{5,6,7,8,9};

        intArry2 = intArry1;

        intArry1[0]=9; intArry1[1]=8;

        System.out.print("intArry1 :");
        for(int i=0; i<5; i++){
            System.out.printf("%2d",intArry1[i]);
        }
        System.out.print("\n");

        System.out.print("intArry2 :");
        for(int i=0; i<5; i++){
            System.out.printf("%2d",intArry2[i]);
        }

    }
}
