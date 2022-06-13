public class OperationExam {
    public static void main(String[] args) {
        int i1 = -5;
        int i2 = +i1;
        int i3 = -i1;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        int i4 = ++i3;
        System.out.println(i4);
        System.out.println(i3);
        int i5 = i3++;
        System.out.println(i5);
        System.out.println(i3);

        int i = 5;
        int j = 2;

        System.out.println(i + j);
        System.out.println(i - j);
        System.out.println(i * j);
        System.out.println(i / j);
        System.out.println(i / (double) j);
        System.out.println(i % j);

        i = 10;
        j = 10;

        System.out.println(i == j);
        System.out.println(i != j);
        System.out.println(i < j);
        System.out.println(i <= j);
        System.out.println(i > j);
        System.out.println(i >= j);
//        복합대입연산자
        i += 10;
        i -= 5;

    }
}
