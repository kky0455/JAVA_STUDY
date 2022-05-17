public class ifExam {
    public static void main(String[] args) {
        int x = 50;
        int y = 60;
        if (x < y){
            System.out.println("x는 y보다 작습니다.");
        }
//        감싸는 블럭이 없을 경우 한줄만 if문에 영향
        if (x == y)
            System.out.println("x는 y와 같습니다.");

        if (x == y) {
            System.out.println("x는 y와 같습니다.");
        }else if(x < y){
            System.out.println("x와 y는 작습니다.");
        }else {
            System.out.println("x는 y보다 큽니다.");
        }
    }
}
