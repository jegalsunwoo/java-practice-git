package sec03.chap02;

public class Ex02_03_04 {
    public static void main(String[] args) {
        //float의 최대값 최소값
        float fMin = -Float.MAX_VALUE;
        float fMax = Float.MAX_VALUE;
        System.out.println(fMin);
        System.out.println(fMax);

        //double의 최대값 최소값
        double dMin = -Double.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        System.out.println(dMin);
        System.out.println(dMax);

        //최소 절대값
        float fAbsMin = Float.MIN_VALUE;
        double dAbsMin = Double.MIN_VALUE;
        System.out.println(fAbsMin);
        System.out.println(dAbsMin);

        //double이 범위도 넓고, 정밀도도 높음
    }
}
