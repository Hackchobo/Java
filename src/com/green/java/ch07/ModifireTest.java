package com.green.java.ch07;

public class ModifireTest {      //클래스에는 default아니면 public을 준다. public은 완전한 공유가 가능하다. 심지어 클래스가 달라도 가능 public은 어떻게 사용 가능하냐
    // class dd {} <- default 클래스 사용을 잘 안한다.
        private int num1;  // 같은 클래스 내부에서는 사용 가능 멤버필드면 private사용을 한다.
        int num2;          // 같은 패키지안에서만 사용가능하다. default
        protected  int num3; // 이걸 사용 하게 될경우 실력이 많이 늘어 난것이다.  상속관계에서 사용가능, 같은 패키지, 같은 클래스
        public  int num4;      // 완전 공유가 가능  상수만 public 준다.

        public void printNum1() {
            System.out.println(num1);
        }

}
