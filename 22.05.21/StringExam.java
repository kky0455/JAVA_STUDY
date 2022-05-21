public class StringExam {
    public static void main(String[] args) {
        // 이 방식은 값이 상수영역에 저장, 변하지 않는 값
        // 동일 값을 중복 생성시 이미 메모리 영역에 존재하는 값이면 같은 인스턴스를 가리킴
        String str1 = "hello";
        String str2 = "hello";
        // 이 방식으로 생성할 경우 새로운 인스턴스를 힙영역에 생성
        // 동일 값을 중복 생성해도 다른 영역에 생성
        String str3 = new String("hello");
        String str4 = new String("hello");

        if (str1 == str2)
            System.out.println("같은 레퍼런스 입니다.");

        if (str1 == str3)
            System.out.println("같은 레퍼런스입니다");

        if (str3 == str4)
            System.out.println("같은 레퍼런스 입니다.");
        // 해당인덱스부터 이후 문자열을 출력
        System.out.println(str1.substring(3));
    }
}
