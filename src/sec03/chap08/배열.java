package sec03.chap08;

public class 배열 {
    public static void main(String[] args) {
        char[] abc = {'가','나','다','라','마'};

        char a = abc[0];
        System.out.println(a);

        boolean[] boolAry = new boolean[3];
        int[] intAry = new int[3];
        double[] dbAry = new double[3];
        char[] charAry = new char[3];
        String[] strAry = new String[3];

        char[] Array;
//        Array = {'가','나'}; 선언만 먼저 하였을 경우 사용불가
        Array = new char[]{'가','나'};




        //이중 배열
        int[][] intAry1 = new int[][]{
                { 1 , 2 , 3 },
                { 4 , 5 , 6 },
                { 7 , 8 , 9 }
        };
        //출력
        for(int i = 0 ; i<3;i++)
        {
            for(int j = 0 ; j<3 ; j++)
            {
                System.out.printf("%3d",intAry1[i][j]);
            }
            System.out.println("");
        }

        //삼중 배열
        int[][][] intAry2 = new int[][][]{
                {{1,1},{2,2},{3,3}},
                {{4,4},{5,5},{6,6}},

        };
        //출력
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                for(int k=0; k<2; k++){
                    if(k==0){
                        System.out.printf("{ %d, ",intAry2[i][j][k]);
                    }
                    else{
                        System.out.printf("%d }",intAry2[i][j][k]);
                    }
                }
                if(j<2){
                    System.out.print(" , ");
                }
            }
            System.out.print("\n");
        }
    }
}
