public class VariableScope {
    int globalScope = 10;
    static int staticVal = 7;

    public void scopeTest(int value) {
        int localScope = 20;
        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }

    public void scopeTest2(int value2) {
        System.out.println(globalScope);
//        System.out.println(localScope);
//        System.out.println(value);
    }

    public static void main(String[] args) {
//        System.out.println(globalScope);
//        System.out.println(localScope);
//        System.out.println(value);
        System.out.println(staticVal);
    }
}
