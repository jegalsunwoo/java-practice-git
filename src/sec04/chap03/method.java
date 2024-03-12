package sec04.chap03;

public class method {
    public static void main(String[] args) {
        //addSubMulDiv(3.14,2.56);
        //System.out.println("결과: "+add(10,20));
//        if(check_text_contains("Hello World","HELLO")){
//            System.out.println("포함");
//        }
//        else{
//            System.out.println("미포함");
//        }
//        System.out.println(check_text_contains("Hello World","HELLO")?"포함":"미포함");

//        int[] array = new int[]{10,20,30,40,50};


        System.out.println(avg(10, 20, 30, 40, 50, 60));
//        for(int value:Min_Max(array))
//            System.out.println(value);



//        int min_value = Min_Max(array)[0];
//        int max_value = Min_Max(array)[1];
//        System.out.println("min : "+min_value);
//        System.out.println("max : "+max_value);



    }
    static void addSubMulDiv(double a, double b){
        System.out.printf("%f + %f = %f%n",a,b,a+b);
        System.out.printf("%f - %f = %f%n",a,b,a-b);
        System.out.printf("%f * %f = %f%n",a,b,a*b);
        System.out.printf("%f / %f = %f%n",a,b,a/b);
    }
    static int add(int a, int b){
        return a+b;
    }
    static boolean check_text_contains(String str, String str_token){
        return str.toLowerCase().contains(str_token.toLowerCase());

    }

    static double avg(int... nums){
        double sum = 0;
        for(int num:nums){
            sum+=num;
        }
        return sum/nums.length;
    }

    static int[] Min_Max(int[] array){
        int max=array[0],min=array[0];
        for(int num:array){
            max = max > num ? max : num;
            min = min < num ? min : num;
        }
        return new int[] {min,max};
    }

}

