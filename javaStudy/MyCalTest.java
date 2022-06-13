public class MyCalTest {
    public static void main(String[] args) {
        Calculator cal = new MyCal();
        cal.plus(3, 4);
        int i = cal.exec(5, 6);
        System.out.println(i);
        //static한 메소드는 선언된 인터페이스를 통해 실행해야한다.
        Calculator.exec2(3, 4);
    }
}
