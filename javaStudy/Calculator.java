public interface Calculator {
    public int plus(int i, int j);
    public int multiple(int i, int j);
    // 인터페이스에서 default를 이용해 메소드 구현 가능
    default int exec(int i, int j){
        return i + j;
    }

    public static int exec2(int i, int j){
        return i*j;
    }
}
