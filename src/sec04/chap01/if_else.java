package sec04.chap01;

public class if_else {
    public static void main(String[] args) {
//        boolean study = true;
//        int startTime = 10, finishTime = 22;
//        int startLunchTime = 12, finishLaunchTime = 14;
//        int currentTime = 13;
//
//        if(currentTime >= 10 && currentTime <= 20){
//            if(currentTime >= 12 && currentTime <= 14){
//                System.out.println("밥먹는중");
//            }
//            else{
//                System.out.println("공부중");
//            }
//        }
//
//
//        else if (currentTime >= 20 && currentTime <= 10){
//            System.out.println("자는중");
//        }

//        int[] score = new int[]{85,72};
//        String[] subeject = new String[]{"국어","수학"};
//        char[] rank = new char[2];
//
//        for(var i=0 ; i<2 ; i++){
//            if(score[i] >= 90){
//                rank[i] = 'A';
//            } else if(score[i]>=80){
//                rank[i] = 'B';
//            } else if(score[i]>=70){
//                rank[i] = 'C';
//            } else if(score[i]>=60){
//                rank[i] = 'D';
//            } else {
//                rank[i] = 'F';
//            }
//            System.out.printf("%s 등급 : %c\n",subeject[i],rank[i]);
//        }

        int score = 85;
        //가독성 좋은 방식
        //return문을 만나면 메소드를 빠져나옴

        if (score >= 90) {
            System.out.println('A');
            return;
        }
        if (score >= 80) {
            System.out.println('B');
            return;
        }
        if (score >= 70) {
            System.out.println('C');
            return;
        }
        if (score >= 60) {
            System.out.println('D');
            return;
        }
        System.out.println('F');


    }
}
