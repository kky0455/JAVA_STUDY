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
