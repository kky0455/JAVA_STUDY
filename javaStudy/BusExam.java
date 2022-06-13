public class BusExam {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.run();
        bus.ppangppang();

        Car car = new Car();
        car.run();

        // 부모타입으로 자식타입을 생성할 때
        // 자식타입에 존재하는 메소드를 사용할 수 없다.
        Car c = new Bus();
        // 클래스의 형변환을 통해 자식 메소드를 활용할 수 있다.
        // 이는 생성 시 Bus클래스로 생성했기 때문에 사용할 수 있는 방식
        // 처음에 Car클래스로 생성되었다면 사용할 수 없다.
        Bus b = (Bus)c;
        b.run();
        b.ppangppang();
    }
}
