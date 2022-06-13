public class Truck extends Car{
    public Truck() {
        // 실행 시 시스템이 자동으로 super()를 추가시켜놓음
//        super();
        // 만약 생성자가 필수 인자가 있는경우 직접 지정해줘야 에러가 발생하지 않는다.
        super("소방차");
        System.out.println("Truck의 기본 생성자입니다.");
    }
}
