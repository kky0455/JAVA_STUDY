public class ConstantExam {
    public static void main(String[] args) {
//        상수는 한번 저장한 데이터값 변경 불가능
        final int J;
        J = 10;

//        불가능
//        J = 5;

        double circleArea;
        final double PI = 3.14159;
        circleArea = 3 * 3 * PI;

        final int OIL_PRICE = 1450;
        int totalPrice = 50 * OIL_PRICE;

    }
}
