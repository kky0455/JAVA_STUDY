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

