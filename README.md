# 자바를 공부하며 문법 정리하기



## 22.05.16

- 자바 언어 특징

  - 타 언어에 비해 배우기 쉽다
  - 플랫폼에 독립적이다
  - 객체지향 프로그래밍이다 (재활용성, 직관성이 높음 / 메모리 관리를 자동으로 처리)
  - Garbage Collector로 사용되지 않는 메모리를 자동적으로 정리해준다
  - JVM - 자바로 제작된 프로그램을 실행시켜주는 프로그램

  

- cmd에서 컴파일 및 실행

  - 컴파일 방법 : javac 파일명.java
  - 실행방법 : java 파일명
  
  

- 자바의 구조
  - main은 프로그램의 시작점

```java
public class 파일명 {
    public static void main(String[] args) {
        System.out.println("출력 내용");
    }
}
```

- 변수 : 값을 저장할 수 있는 메모리 공간

  - int : 정수형 데이터를 저장
  - double : 실수형 데이터를 저장
  - String : 문자형 데이터를 저장
  - 변수명이 두 단어의 조합으로 구성되면 camelCase로 작성

  

- 상수 : 값이 한번 초기화되면 변하지않는 값, 변경할 때는 선언부분에서 지정된 값을 바꿔준다.

  - 상수 선언은 타입 앞에 final을 붙여준다.
  - 상수이름은 모두 대문자로 작성해주는 것이 관례
  - 자주 사용되는 고정값에 사용하면 좋다.

  

- 기본형 데이터 타입

| 자료형 | 키워드  | 크기(byte) |       표현 범위        |        사용 예         |
| :----: | :-----: | :--------: | :--------------------: | :--------------------: |
| 논리형 | boolean |     1      |     true or false      | boolean isFun - true;  |
| 문자형 |  char   |     2      |        0~65,535        |     char c = 'f';      |
| 정수형 |  byte   |     1      |        -128~127        |      byte b = 89;      |
|        |  short  |     2      |     -32,768~32,767     |    short s = 32760;    |
|        |  char   |     2      |        0~65,535        |      char c = 64;      |
|        |   int   |     4      | -2147483648:2147483647 | int x = 59; int z = x; |
|        |  long   |     8      |          ...           |  long big = 3456789L;  |
| 실수형 |  float  |     4      |    -3.4E038~3.4E038    |    float f = 32.5f     |
|        | double  |     8      |    -1.7E308~1.7E308    |    double d = 23.34    |



- 리터럴

  - 정수 리터럴
  - 실수 리터럴
  - 문자 리터럴
  - 논리 리터럴

  

- 타입별 크기

  - byte < short, char < int < long < float < double
  - 실수는 소수점을 담을 수 있는 공간이 필요해 실수타입의 크기가 더 큼



- 기본형의 타입 변환
  - 강제 형변환 : 큰 크기에서 작은 크기의 데이터 타입으로 변환할 때 앞에 데이터 타입을 붙여 강제적으로 바꾸는 것
  - 묵시적 형변환 : 작은 크기 데이터 타입에서 큰 크기의 데이터 타입으로 변환하는 것



- 연산자
  - 부호 연산자(+ -)
  - 산술 연산자( + - * / %)
  - 증감 연산자(++ --)
  - 비교연산자(== != < > <= >=)



- 연산자 우선순위

|     종류      |                    기호                     |
| :-----------: | :-----------------------------------------: |
| 최우선 연산자 |                   . [] ()                   |
|  단항 연산자  |                ++ -- ! ~ +/-                |
|  산술 연산자  | * / %   >   + -  >  시프트 연산자 >> << >>> |
|  비교 연산자  |               > < >= <= == !=               |
|  비트 연산자  |                  & \| ^ ~                   |
|  논리 연산자  |                 && > \|\| !                 |
|  삼항 연산자  |                  조건식 ?                   |
|  대입 연산자  |              = *= /= %= += -=               |

## 22.05.18

- 조건문

  - if문 : ()안의 조건이 참일 때 해당 구문을 수행

```java
if (조건) {
    실행구문
}else if (다음 조건) {
    실행구문
}else {
    실행구문
}
```



  - 논리 연산자

    - && : and 연산자
    - || : or 연산자
    - ! : not 연산자
    - ^ : xor 연산자

    

  - 삼항 연산자

```java
int b1 = (조건) ? true값 : false값
```



- switch문
  - 값에 해당하는 case를 찾아 실행문을 진행합니다.
  - switch는 찾는 값 이후로 아래로 쭉 모두 실행하기 때문에 break문이 필요할 수 있습니다.
  - default는 무조건 실행하는 문장입니다.
  - 실행값이 같은 case문을 모아놓을 수 있습니다.

```java
switch (값) {
    case 찾는값1:
    case 찾는값2:
        실행문;
    case 찾는값3:
    case 찾는값4:
        실행문;
    default :
        실행문;
}
```



- while문
  - 조건이 참인동안 실행내용을 계속 반복합니다.

```java
while (조건) {
    실행내용
}
```

- do-while문
  - 조건이 맞지 않아도 반드시 한번은 수행하는 while문
  - 여기서 사용자의 input을 받기위해 Scanner를 사용함
  - scan의 함수를 활용해 사용자 입력값의 타입을 결정해 받을 수 있음

```java
import java.util.Scanner;

public static void main(String[] args) {
        int value = 0;
        Scanner scan = new Scanner(System.in);
        do {
			value = scan.nextInt();
        }while(조건);
    }
```

## 22.05.20

- for문
  - 조건식이 참인 동안 계속 반복하는 방식
  - 내부에 조건을 활용해 다양한 결과를 만들 수 있음 

```java
for(변수초기화; 조건식; 증감식){
    
}
```



- 배열
  - 자바는 선언한 배열의 크기가 변하지 않으므로 조심해야함
  - 선언할 땐 항상 new를 붙이기
  - 배열의 변수는 하나인데 값은 여러개인 참조형 타입
  - 아래와 같은 타입은 1차원 배열

```java
public static void main(String[] args) {
        int[] array = new int[100];
    	// 선언된 배열에 값 할당하기
    	array[0] = 50;
        array[10] = 100;
    	// 배열을 선언하는 다양한 방법
    	int[] array2 = new int[]{1, 2, 3, 4};
        
        int[] array3 = {1, 2, 3, 4};
    }
```

- 배열 활용
  - for문을 통해 배열에 값을 넣을 수 있음
  - 외부에 변수를 생성하여 해당 변수에 for문을 통한 값을 넣을 수 있음
  - 단 , 스코프 내에 선언된 변수는 밖에서 사용할 수 없으므로 저장할 변수는 밖에서 만들기

```java
public static void main(String[] args) {
        int [] iarray = new int[100];

        for (int i = 0; i < iarray.length; i++){
            iarray[i] = i + 1;
        }
        int sum = 0;
        for (int i = 0; i < iarray.length; i++){
            sum += iarray[i];
        }
        System.out.println(sum);
    }
```

- 2차원 배열
  - 2차원 배열의 특징은 각 배열마다 다른 길이의 배열을 생성할 수 있다는 점

```java
public static void main(String[] args) {
    	// 2차원 배열 선언 및 값 넣기
        int[][] array1 = new int[3][4];
    	array1[0][1] = 10;
		
    	// 2차원 배열 선언 및 활용하는 다른 방법
        int[][] array2 = new int[3][];
        array2[0] = new int[1];
        array2[0][0] = 10;

        int[][] array3 = {{1}, {1, 2}, {1, 2, 3}};
        System.out.println(array3[0][0]);
    
    }
```

- foreach
  - for(타입 값을 받아줄 변수명:출력하고 싶은 자료구조)
  - 기존 for문과 다르게 자료 크기를 자동으로 판단하고 계산

```java
public static void main(String[] args) {
    	int[] iarr = {10, 20, 30, 40, 50};
        for(int value:iarr){
            System.out.println(value);
        }
    }
```

## 22.05.21

- 클래스
  - 객체를 만들기위한 틀
  - 만들어 놓은 클래스를 다른 파일에서 사용할 수 있음

```java
public class Car{
    // 클래스 선언한 파일
}
```

```java
public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
    }
```



- 참조형 변수
  - str변수 앞에 String클래스가 적혀있음
  - = 뒤에 new는 생성자
  - new 키워드는 객체를 메모리에 올려주며, 메모리에 올라간 객체를 인스턴스라고 함
  - 메모리에 올라간 인스턴스를 가르키는 변수, 참조하는 변수, 레퍼런스 하는 변수가 str이며 참조, 레퍼런스라는 것은 변수가 인스턴스를 가지고 있는게 아닌 가리킨다는 의미
  - str이라는 변수에 메모리의 위치 값이 저장되어 있지만 어떤 메모리에 저장되는지 그 정보를 알 수 있는 방법은 없기 때문에 참조한다라고만 표현함

```java
public static void main(String[] args) {
        String str = new String ("hello");
    }
```



- String클래스

  - 생성 방식에 따라 저장하는 방식이 다름

  - ```java
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
    }
    ```

  - 이 방식은 값을 상수영역에 저장, 변하지 않는 값

  - 동일 값을 중복 생성 시 이미 메모리 영역에 존재하는 값이면 같은 인스턴스를 가리킴

  - ```java
    public static void main(String[] args) {
        String str3 = new String("hello");
        String str4 = new String("hello");
    }
    ```

  - 이 방식으로 생성할 경우 새로운 인스턴스를 힙영역에 생성

  - 동일 값을 중복 생성해도 다른 영역에 생성

- 필드

  - 선언한 클래스에서 필드라는 용어로 다양한 속성을 활용

  - ```java
    public class Car{
            String name;    
            int number;
        }
    ```

  - 위에 선언한 클래스를 다른 곳에서 인스턴스화하여 객체마다 다르게 활용 가능

  - ```java
    Car c1 = new Car();
    Car c2 = new Car();
    
    c1.name = "소방차";  
    c1.number = 1234;  
    c2.name = "구급차";
    c2.number = 1004; 
    
    
    System.out.println(c1.name); 
    System.out.println(c1.number); 
    String name = c2.name;
    ```

## 22.05.22

- 메소드

  - 함수처럼 입력값을 받아 어떠한 일을 수행한 후 결과를 도출해내는 수단
  - 인자(Argument) : 함수를 호출 시 전달되는 값
  - 매개 변수(Parameter) : 전달된 인자를 받아들이는 변수
  - 클래스가 가지고 있는 기능이므로 클래스 안에 선언됨

- 메소드 선언

  - ```java
    public class MyClass{
        public 리턴타입 메소드명 (매개변수) {
            구현부분
        }
    }
    ```

  - 리턴타입이 없으면 void, 있다면 타입에 맞춰서 적어준다.

  - 매개변수가 없다면 (), 여러개라면 ,로 구분하여 넣어주자

  - 리턴이 있을 때 구현부분에 return을 적어주자
  
- 메소드 활용

  - ```java
    public static void main(String[] args) {
            MyClass myclass = new MyClass();
            myclass.메소드명();
        	// 인자를 받는 경우
            myclass.method2(10);
        	// 리턴이 있는 경우
        	int value = myclass.method3();
        }
    ```

  - 메소드가 존재하는 클래스를 새롭게 선언

  - 그 메소드가 인자를 요구하는지, 리턴이 있는지에 따라 맞춰서 함수를 실행



## 22.06.04

- String 메소드

  - 문자열 길이 구하기(length)

  - ```java
    System.out.println(str.length());  //str
    ```

  - 문자열 붙이기(concat)

  - ```java
    String str = new String("hello");
    
    System.out.println(str.concat(" world"));  //출력결과는 hello world 
    System.out.println(str);  //출력결과는 hello 
    ```

  - 문자열 자르기(subString)

  - ```java
    System.out.println(str.substring(1, 3)); //출력결과  el
    System.out.println(str.substring(2));   //출력결과 llo world
    ```

- 변수의 scope와 static

  - scope : 사용되는 변수가 사용 가능한 범위, 보통 선언된 블럭이 그 변수의 사용범위

  - ```java
    public class ValableScopeExam{
    
            int globalScope = 10;   // 인스턴스 변수 
    
            public void scopeTest(int value){   
                int localScope = 10;
                System.out.println(globalScope);
                System.out.println(localScpe);
                System.out.println(value);
            }
        }
    ```

  - 클래스 속성인 globalScope의 범위는 클래스 전체

  - 매개변수와 메소드 내 선언된 localScope는 메소드 블럭 내에서 사용 가능

  - main은 static한 메소드이기 때문에 static하지 않은 globalScope는 사용불가

  - ```java
    public class VariableScopeExam {
            int globalScope = 10; 
    
            public void scopeTest(int value){
                int localScope = 20;            
                System.out.println(globalScope);
                System.out.println(localScope);
                System.out.println(value);
            }   
            public static void main(String[] args) {
                System.out.println(globalScope);  //오류
                System.out.println(localScope);   //오류
                System.out.println(value);        //오류  
            }   
        }
    ```

  - static : 클래스가 인스턴스화 되지 않아도 사용할 수 있음

  - ```java
    public class VariableScopeExam {
            int globalScope = 10; 
            static int staticVal = 7;
    
            public void scopeTest(int value){
                int localScope = 20;        
            }
    
            public static void main(String[] args) {
                System.out.println(staticVal);      //사용가능 
            }
    
        }
    ```

  - static한 변수는 저장할 수 있는 공간이 하나만 생성됨

  - ```java
    ValableScopeExam v1 = new ValableScopeExam();
    ValableScopeExam v2 = new ValableScopeExam();
    v1.golbalScope = 20;
    v2.golbalScope = 30; 
    
    System.out.println(v1.golbalScope);  //20 이 출력된다. 
    System.out.println(v2.golbalScope);  //30이 출력된다. 
    
    v1.staticVal = 10;
    v2.staticVal = 20; 
    
    System.out.println(v1.statVal);  //20 이 출력된다. 
    System.out.println(v2.statVal);  //20 이 출력된다. 
    ```

  - globalScope는 인스턴스가 생성될 때 생성되기 때문에 인스턴스 변수라고 함

  - staticVal은 클래스 변수

- 열거형(enum)

  - ```java
    public class EnumExam {
            public static final String MALE = "MALE";
            public static final String FEMALE = "FEMALE";
    
            public static void main(String[] args) {
                String gender1;
    
                gender1 = EnumExam.MALE;
                gender1 = EnumExam.FEMALE;                  
            }
        }
    
    ```

    - 위는 MALE, FEMALE이 아닌 값이 들어가도 문제가 발생하지 않는다.

  - ```java
    Gender gender2;
    
    gender2 = Gender.MALE;
    gender2 = Gender.FEMALE;
    
    enum Gender{
            MALE, FEMALE;
        }
    ```

    - 위와 같은 방식을 통해 열거형을 사용할 수 있으며, 정해진 값만 입력가능하다.

- 생성자

  - 리턴타입이 없다

  - 프로그래머가 만들지 않으면 매개변수가 없는 생성자가 컴파일할 때 자동으로 생성

  - 매개변수가 없는 생성자는 기본생성자

  - 생성자를 하나라도 프로그래머가 만들었다면 기본생성자는 자동으로 만들어지지 않는다

  - ```java
    public class Car{
            String name;
            int number;
    
            public Car(String n){
                name = n;
            }
        }
    ```

    - 생성자는 객체가 될 때 필드를 초기화하는 역할
    - 위 코딩은 객체가 반드시 이름을 갖고 생성되도록 생성자를 작성

  - ```java
    public class CarExam2{
            public static void main(String args[]){
    
                Car c1 = new Car("소방차");
                Car c2 = new Car("구급차");
                //Car c3 = new Car(); // 컴파일 오류가 발생합니다.
    
                System.out.println(c1.name);
    
                System.out.println(c2.name);
            }
        }
    ```

    - Car클래스는 기본생성자를 갖지 않으므로 반드시 매개변수가 들어가야한다.

- this

  - ```java
    public Car(String name){
            name = name;
    }
    ```

    - 앞서 String n은 n이 무엇을 의미하는지 쉽게 할 수 없음
    - n보다는 명확하게 name으로 나타내는게 좋다.
    - 하지만 이 경우 name이라는 변수명이 중복되고, 가깝게 선언된 변수를 우선 사용하므로 잘못된 결과를 가져온다.

  - ```java
    public Car(String name){
            this.name = name;
        }
    ```

    - 이 때, 필드라는 것을 컴파일러와 JVM에게 알려주기 위해 this키워드를 사용
    - 앞에 name은 필드를 말하고 뒤에 name은 매개변수를 의미

- 메소드 오버로딩

  - 매개변수 유형과 개수를 다르게 해 같은 이름의 메소드를 여러 개 가질 수 있게하는 기술

  - ```java
    class MyClass2{
            public int plus(int x, int y){
                return x+y;
            }
    
            public int plus(int x, int y, int z){
                return x + y + z;
            }
    
            public String plus(String x, String y){
                return x + y;
            }
        }
    ```

    - 이름은 같지만 매개변수가 다른 메소드
    - 단, 매개변수명은 다르지만, 타입과 개수가 동일한 메소드를 또 정의할 수 없다.

  - ```java
    public MethodOverloadExam{
            public static void main(String args[]){
                MyClass2 m = new MyClass2();
                System.out.println(m.plus(5,10));
                System.out.println(m.plus(5,10,15));
                System.out.println(m.plus("hello" + " world"));
            }
        }
    ```

    - 메소드의 인자에 어떤 값이 쓰이느냐에 따라 각기 다른 메소드가 호출

- 생성자 오버로딩과 this

  - 생성자의 매개변수의 유형과 개수를 다르게하여 같은 이름의 생성자 여러 개를 만들 수 있다.

  - ```java
    public class Car{
            String name;
            int number;
    
            public Car(){
    
            }
    
            public Car(String name){
                this.name = name;
            }
    
            public Car(String name, int number){
                this.name = name;
                this.number = number;
            }
        }
    ```

    - 생성자도 메소드와 마찬가지로 여러개 선언 가능
    - 매개변수의 수와 타입이 다르다면 여러개의 생성자를 선언 가능

  - ```java
    public class CarExam4{
            public static void main(String args[]){
                // 오버로딩된 생성자 이용
                Car c1 = new Car();
                Car c2 = new Car("소방차");
                Car c3 = new Car("구급차", 1234);
            }
        }
    ```

  - ```java
    public Car(){
            this.name = "이름없음";
            this.number = 0;
        }
    ```

    - 위와 같은 기본생성자는 코드의 중복이 발생

  - ```java
    public Car(){
            this("이름없음", 0);
        }
    ```

    - 위 방법을 통해 자신의 생성자를 호출하여 중복을 방지할 수 있음

    

- 패키지 : 서로 관련있는 클래스 또는 인터페이스들을 묶어 놓은 묶음

  - 보통 도메인 이름을 거꾸로 적은 후, 그 뒤에 프로젝트 이름을 붙여서 생성
  - 각 폴더명은 숫자로 시작할 수 없음
  - 다른 패키지에 있는 클래스를 사용하려면 import 구문을 적어줘야함



- 상속 : 부모 클래스가 가지고 있는 것을 자식 클래스에게 물려주는 것

  - ```java
    public class Car{
    
        }
    
    public class Bus extends Car{
    
        }
    ```

    - 자바는 클래스 이름 뒤에 extends 키워드를 적고 부모클래스 이름을 적게 되면 부모 클래스가 갖고 있는 것을 상속받을 수 있음

  - ```java
    public class Car{
            public void run(){
                System.out.println("달리다.");
            }
        }
    ```

  - ```java
    public class BusExam{
            public static void main(String args[]){
                Bus bus = new Bus();
                bus.run();  
                //Bus class 는 아무런 코드를 가지지 않는다. 그럼에도 run 이라는 메소드를 사용하는데 문제가 발생되지 않는다. 
            }   
        }
    ```

    - bus는 Car에 존재하는 run메소드를 사용할 수 있고 자체적으로 선언한 메소드가 있다면 같이 사용할 수 있음.



- 접근제한자 : 클래스 내에서 멤버의 접근을 제한하는 역할

  - public : 어떤 클래스든 접근할 수 있다

  - protected : 자기 자신 / 같은 패키지 / 서로 다른 패키지여도 상속받은 자식 클래스에서 접근할 수 있음

  - private : 자기 자신만 접근할 수 있음

  - 접근제한자를 적지 않으면 default : 자기자신과 같은 패키지에서만 접근할 수 있음

  - ```java
    public class AccessObj{
            private int i = 1;
            int k = 2; // default접근 제한자
            public int p = 3;
            protected int p2 = 4;
        }
    ```

  - ```java
    // 같은 패키지 내에서 사용
    public class AccessObjExam{
            public static void main(String args[]){
                AccessObj po = new AccessObj();
    
                System.out.println(po.i); // 컴파일 오류가 발생합니다.
                System.out.println(po.k);
                System.out.println(po.p);
                System.out.println(po.p2);
            }
        }
    ```

  - ```java
    // 다른 패키지 내에서 사용
    public class AccessObjExam{
            public static void main(String args[]){
                AccessObj po = new AccessObj();
    
                System.out.println(po.i); // 컴파일 오류가 발생합니다.
                System.lout.println(po.k);// 컴파일 오류가 발생합니다.
                System.lout.println(po.p);
                System.lout.println(po.p2);// 컴파일 오류가 발생합니다.
            }
        }
    ```

  - ```java
    // 상속받은 후 사용
    public class AccessObjExam extends AccessObj{
            public static void main(String[] args) {
                AccessObjExam obj = new AccessObjExam();
                System.out.println(obj.p);
                System.out.println(obj.p2);
                System.out.println(obj.k);// 컴파일 오류가 발생합니다.
                System.out.println(obj.i);// 컴파일 오류가 발생합니다.
            }
        }
    ```



- 추상클래스 : 구체적이지 않은 클래스

  - ```java
    public abstract class Bird{
            public abstract void sing();
    
            public void fly(){
                System.out.println("날다.");
            }
        }
    ```

    - 클래스 앞에 abstract 키워드를 이용해서 정의
    - 미완성의 추상 메소드(내용X) 포함 가능
    - 추상 메소드는 리턴타입 앞에 abstract 키워드 붙여야함
    - 인스턴스 생성 불가

  - ```java
    public class Duck extends Bird{
            @Override
            public void sing() {
                System.out.println("꽥꽥!!");
            }
        }
    ```

    - 추상 클래스를 상속받은 클래스는 반드시 추상메소드를 구현해야함
    - 만약 상속받고, 추상 메소드를 구현하지 않으면 그 클래스도 추상클래스가 됨

## 22.06.08

- super와 부모생성자 

  - class가 인스턴스화 될 때 생성자가 실행되면서 객체를 초기화, 이 때 자신의 생성자만 실행이 되는 것이 아니고 부모 생성자부터 실행

  - ```java
    // 부모 생성자
    public class Car{
            public Car(){
                System.out.println("Car의 기본생성자입니다.");
            }
        }
    
        public class Bus extends Car{
            public Bus(){
                System.out.println("Bus의 기본생성자입니다.");
            }
    
        }
    ```

  - ```java
    // 생성자 테스트
    public class BusExam{
            public static void main(String args[]){
                Bus b = new Bus();
            }
        }
    ```

  - Car의 기본생성자입니다. 

  - Bus의 기본생성자입니다.

    - new 연산자로 Bus객체를 생성하면, Bus객체가 메모리에 올라갈때 부모인 Car도 함께 메모리에 올라간다.
    - 생성자는 객체를 초기화 하는 일을한다.
    - 생성자가 호출될 때 자동으로 부모의 생성자가 호출되면서 부모객체를 초기화 하게된다.

  - super

    - 자신을 가리키는 키워드가 this 라면, 부모들 가리키는 키워드는 super
    - super() 는 부모의 생성자를 의미한다.
    - 부모의 생성자를 임의로 호출하지 않으면, 부모 class의 기본 생성자가 자동으로 호출된다.
    - 아래 예제처럼 호출해보면 위에서 super()를 호출하지 않을때와 결과가 같다.

  - ```java
    // 부모의 기본생성자가 없는 경우
    public class Car{
            public Car(String name){
                System.out.println(name + " 을 받아들이는 생성자입니다.");
            }
        }
    ```

  - ```java
    public Bus(){
            super("소방차"); // 문자열을 매개변수로 받는 부모 생성자를 호출하였다.
            System.out.println("Bus의 기본생성자입니다.");
        }
    ```

    - 이런 문제를 해결하려면 자식 클래스의 생성자에서 직접 부모의 생성자를 호출해야 합니다.

- 오버라이딩

  - 부모의 메소드를 자식쪽에서 재정의 하는 것

  - ```java
    //run 메소드를 가지고 있는  Car클래스 
        public class Car{
            public void run(){
                System.out.println("Car의 run메소드");
            }
        }
    
        //Car 를 상속받는 Bus 클래스 
        public class Bus extends Car{
    
        }
    
        public class BusExam{
            public static void main(String args[]){
                Bus bus = new Bus();
                bus.run();  //Car의 run메소드가 실행된다. 
            }
        }
    ```

  - ```java
    public class Bus extends Car{
    	// 부모쪽과 모양이 같은 메소드 선언
            public void run(){
                System.out.println("Bus의 run메소드");
            }
        }
    
        public class BusExam{
            public static void main(String args[]){
                Bus bus = new Bus();
                bus.run();  //Bus run메소드가 실행된다. 
            }
        }
    ```

  - 실행 시 자식쪽에 정의 된 메소드가 실행된다.

  - 만약 부모메소드를 실행하고싶다면 super를 활용하여 호출할 수 있다.

  - ```
    public class Bus extends Car{
            public void run(){
                **super.run();**  // 부모의  run()메소드를 호출 
                System.out.println("Bus의 run메소드");
            }
        }
    ```



- 클래스 형변환

  - 부모타입으로 자식객체를 참조 시 자식객체가 가진 메소드나 속성을 사용하고 싶을 때 사용

  - ```java
    // 클래스 선언
    public class Car{
            public void run(){
                System.out.println("Car의 run메소드");
            }
        }
    
        public class Bus extends Car{
            public void ppangppang(){
                System.out.println("빵빵.");
            }   
        }
    ```

  - ```java
    // 부모가 가지고 있는 메소드만 사용 가능
    public class BusExam{
            public static void main(String args[]){
                Car car = new Bus();
                car.run();
                car.ppangppang(); // 컴파일 오류 발생
            }
        }
    ```

  - ```java
    // 자식 메소드도 사용하고 싶을 시 클래스 형변환을 사용할 수 있다.
    public class BusExam{
            public static void main(String args[]){
                Car car = new Bus();
                car.run();
                //car.ppangppang(); // 컴파일 오류 발생
    
                Bus bus = (Bus)car;  //부모타입을 자식타입으로 형변환 
                bus.run();
                bus.ppangppang();
            }
        }
    ```

  - 상속관계에 있었을 때만 가능

  - 부모타입으로 자식타입의 객체를 참조할 때는 묵시적으로 형변환 발생



- 인터페이스 : 서로 관계가 없는 물체들이 상호 작용을 하기 위해서 사용하는 장치나 시스템

  - 인터페이스 정의법

  - 

  - ```java
    // 추상메소드와 상수를 정의할 수 있음
    public interface TV{
            public int MAX_VOLUME = 100;
            public int MIN_VOLUME = 0;
    
            public void turnOn();
            public void turnOff();
            public void changeVolume(int volume);
            public void changeChannel(int channel);
    }
    ```

  - ```java
    // 컴파일시 자동으로 아래와 같이 변경됨
    public static final int MAX_VOLUME = 100;
    public static final int MIN_VOLUME = 0;
    ```

  - ```java
    // 인터페이스 메소드는 다음과 같이 추상메소드로 변경
    public abstract void on();
    public abstract void off();
    public abstract void volume(int value);
    public abstract void channel(int number);
    ```

- 인터페이스 사용

  - ```java
    // 인터페이스를 구현하는 클래스에서 implements키워드를 이용
    public class LedTV implements TV{
            public void on(){
                System.out.println("켜다");
            }
            public void off(){
                System.out.println("끄다");   
            }
            public void volume(int value){
                System.out.println(value + "로 볼륨조정하다.");  
            }
            public void channel(int number){
                System.out.println(number + "로 채널조정하다.");         
            }
        }
    ```

  - ```java
    // 인터페이스의 메소드를 활용할 수 있음
    public class LedTVExam{
            public static void main(String args[]){
                TV tv = new LedTV();
                tv.on();
                tv.volume(50);
                tv.channel(6);
                tv.off();
            }
        }
    ```
## 22.06.10

- default메소드(Java8이 등장하며 변경된 interface 기능)

  - 인터페이스에 default로 선언된 메소드는 이를 구현할 수 있으며, 이를 구현하는 클래스는 오버라이딩할 수 있다.

  - ```java
    public interface Calculator {
            public int plus(int i, int j);
            public int multiple(int i, int j);
            default int exec(int i, int j){      //default로 선언함으로 메소드를 구현할 수 있다.
                return i + j;
            }
        }
    
        //Calculator인터페이스를 구현한 MyCalculator클래스
        public class MyCalculator implements Calculator {
    
            @Override
            public int plus(int i, int j) {
                return i + j;
            }
    
            @Override
            public int multiple(int i, int j) {
                return i * j;
            }
        }
    
        public class MyCalculatorExam {
            public static void main(String[] args){
                Calculator cal = new MyCalculator();
                int value = cal.exec(5, 10);
                System.out.println(value);
            }
        }
    ```

    - 인터페이스 변경 시, 이를 구현하는 모든 클래스가 해당 메소드를 구현해야 하는 문제가 있는데 이를 해결하기 위해 default기능을 추가하였다.

- static메소드

  - ```java
    public interface Calculator {
            public int plus(int i, int j);
            public int multiple(int i, int j);
            default int exec(int i, int j){
                return i + j;
            }
            public static int exec2(int i, int j){   //static 메소드 
                return i * j;
            }
        }
    
        //인터페이스에서 정의한 static메소드는 반드시 인터페이스명.메소드 형식으로 호출해야한다.  
    
        public class MyCalculatorExam {
            public static void main(String[] args){
                Calculator cal = new MyCalculator();
                int value = cal.exec(5, 10);
                System.out.println(value);
    
                int value2 = Calculator.exec2(5, 10);  //static메소드 호출 
                System.out.println(value2);
            }
        }
    ```

    - static메소드를 인터페이스에 선언함으로, 인터페이스를 이용한 간단한 기능을 가진 유틸리티성 인터페이스를 만들 수 있다.

- 내부클래스

  - 인스턴스 클래스 : 필드를 선언하는 위치에 선언되는 클래스 안 인스턴스 변수

  - ```java
    public class InnerExam1{
            class Cal{
                int value = 0;
                public void plus(){
                    value++;
                }
            }
    
            public static void main(String args[]){
                InnerExam1 t = new InnerExam1();
                InnerExam1.Cal cal = t.new Cal();
                cal.plus();
                System.out.println(cal.value);
    
            }
        }
    ```

  - static 클래스 : 내부 클래스가 static으로 정의된 경우

  - ```java
    public class InnerExam2{
            static class Cal{
                int value = 0;
                public void plus(){
                    value++;
                }
            }
    
            public static void main(String args[]){
                InnerExam2.Cal cal = new InnerExam2.Cal();
                cal.plus();
                System.out.println(cal.value);
    
            }
        }
    ```

  - 지역클래스 : 메소드 안에 클래스를 선언한 경우

  - ```java
    public class InnerExam3{
            public void exec(){
                class Cal{
                    int value = 0;
                    public void plus(){
                        value++;
                    }
                }
                Cal cal = new Cal();
                cal.plus();
                System.out.println(cal.value);
            }
    
    
            public static void main(String args[]){
                InnerExam3 t = new InnerExam3();
                t.exec();
            }
        }
    ```

  - 익명클래스 : 생성자 이름에 해당하는 클래스를 상속받는 이름없는 객체를 만드는 것

  - ```java
    //추상클래스 Action 
        public abstract class Action{
            public abstract void exec();
        }
    
        //추상클래스 Action을 상속받은 클래스 MyAction
    
        public class MyAction extends Action{
            public void exec(){
                System.out.println("exec");
            }
        }
    
        //MyAction을 사용하는 클래스 ActionExam 
        public class ActionExam{
            public static void main(String args[]){
                Action action = new MyAction();
                action.exec();
            }
        }
    
        //MyAction을 사용하지 않고 Action을 상속받는 익명 클래스를 만들어서 사용하도록 수정해 보도록 하겠습니다.
        public class ActionExam{
            public static void main(String args[]){
                Action action = new Action(){
                    public void exec(){
                        System.out.println("exec");
                    }
                };
                action.exec();
            }
        }
    ```

    - Action을 상속받는 클래스가 해당 클래스에서만 사용되고 다른 클래스에서 사용되지 않을경우 활용할 수 있음

- Exception

  - 프로그램 실행중 예기치 못한 사건을 예외라고 하는데, 이를 미리 예측하고 처리하는 과정을 예외처리라고 함

  - ```java
    public class ExceptionExam {
            public static void main(String[] args) {
                int i = 10;
                int j = 0;
                try{
                    int k = i / j;
                    System.out.println(k);
                }catch(ArithmeticException e){
                    System.out.println("0으로 나눌 수 없습니다. : " + e.toString());
                }finally {
                    System.out.println("오류가 발생하든 안하든 무조건 실행되는 블록입니다.");
                }
            }
        }
    ```

    - try블록에서 여러종류의 예외가 발생한다면 catch블록을 여러개 만들 수 있음
    - Exception을 두게되면 어떤 오류가 발생하던지 하나의 catch블록에서 모든 오류를 처리할 수 있다.

## 22.06.13

- Throws : 예외가 발생했을 때 예외를 호출한 쪽에서 처리하도록 던져주는 것

  - ```java
    package javaStudy;
        public class ExceptionExam2 {
    
            public static void main(String[] args) {
                int i = 10;
                int j = 0;
                try{
                    int k = divide(i, j);
                    System.out.println(k);
                } catch(ArithmeticException e){
                    System.out.println("0으로 나눌수 없습니다.");
                }
    
            }
    
            public static int divide(int i, int j) throws ArithmeticException{
                int k = i / j;
                return k;
            }
    
        }
    ```

- throw : 강제로 오류를 발생시킴

  - ```java
    public class ExceptionExam3 {   
            public static void main(String[] args) {
                int i = 10;
                int j = 0;
                try{
                    int k = divide(i, j);
                    System.out.println(k);
                }catch(IllegalArgumentException e){
                    System.out.println("0으로 나누면 안됩니다.");
                }           
            }
    
            public static int divide(int i, int j) throws IllegalArgumentException{
                if(j == 0){
                    throw new IllegalArgumentException("0으로 나눌 수 없어요.");
                }
                int k = i / j;
                return k;
            }   
        }
    ```



- 사용자 정의 Exception

  - Exception 클래스를 상속받아 정의한 checked Exception

  - RuntimeException 클래스를 상속 받아 정의한 unChecked Exception

  - ```java
    // RuntimeException을 상속받은 BizException객체
    public class BizException extends RuntimeException {
            public BizException(String msg){
                super(msg);
            }       
            public BizException(Exception ex){
                super(ex);
            }
        }
    ```

  - ```java
    // BizService클래스는 업무를 처리하는 메소드를 보유
    public class BizService {
            public void bizMethod(int i)throws BizException{
                System.out.println("비지니스 로직이 시작합니다.");
                if(i < 0){
                    throw new BizException("매개변수 i는 0이상이어야 합니다.");
                }
                System.out.println("비지니스 로직이 종료됩니다.");
            }
        }
    ```

  - ```java
    // BizService를 이용하는 BizExam 클래스
    public class BizExam {  
            public static void main(String[] args) {
                BizService biz = new BizService();
                biz.bizMethod(5);
                try{
                    biz.bizMethod(-3);
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        }
    ```

