package com.green.java.ch07;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;         //레퍼런스 변수들끼리 형변환이 가능할땐 상속관계일때만 된다.
        FireCar fc = new FireCar();
        FireCar fc2 = null;

        fc.water();
        car=fc;       // (Car)가 원래는 있어야 한다 하지만 없어도 되는 것은 자동형변환이 되어서 된다.
       // car.water();    // 자신이 알고있는것만 호출할수있다 그래서 car.water();은 오류가 난다.
        if (car instanceof FireCar){        // Car 객체가 Car를 담고 있으면 false가뜬다.
            fc2 =(FireCar)car; // 강제로 형변환을 해주면 오류가 나지않는다.
            fc2.water();
        }
    }
}

class Car {
    void drive(){
        System.out.println("drive, Brrrrr~");
    }
    void stop(){
        System.out.println("stop!!!");
    }
}

class FireCar extends Car {
    void water() {
        System.out.println("water!!!");
    }
}
