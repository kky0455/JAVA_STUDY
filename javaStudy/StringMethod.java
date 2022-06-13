public class StringMethod {
    public static void main(String[] args) {
//        String str = new String("hello");
        String str = "hello";
        System.out.println(str.length());
//        변수 안의 내용이 바뀌지는 않는다
        System.out.println(str.concat(" world"));
        str = str.concat(" world");
        System.out.println(str);
        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 6));
    }
}
