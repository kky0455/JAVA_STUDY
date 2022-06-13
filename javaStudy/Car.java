public class Car {
//    String name;
//    int number;
//
//    public Car(String n){
//        name = n;
//    }
//
//    public Car() {
////        this.name = "이름없음";
////        this.number = 0;
//        this("이름없음", 0);
//    }
//
//    public Car(String name, int number) {
//        this.name = name;
//        this.number = number;
//    }
    public Car() {
        System.out.println("Car의 기본 생성자입니다.");
    }
    public void run() {
        System.out.println("달리다.");
    }
}
