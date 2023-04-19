package com.green.java.ch06;

public class TvTest2 {
    public static void main(String[] args) {
        Tv2 tv = new Tv2();

        for (int i = 0; i < 11; i++) {
            tv.setChannelUP();
        }
        System.out.printf("channel : %d\n", tv.channel);

        for (int i = 5; i > -3 ; i--) {
            tv.channelDown();
        }

        System.out.printf("channel : %d\n", tv.channel);
    }

}
class Tv2{
    String color;
    boolean power;
    int channel;

    final int MAX_CHANNER = 5;
    final int MIN_CHANNER = 1;
    void power() { power = !power;} // 실행을 한번하였을때 true이다가 다시실행하면 false 다시실행하면 true
    void setChannelUP() {
        if (channel<MAX_CHANNER){
            channel++;
        }
    }
    void channelDown(){
        if (channel>MIN_CHANNER){
            --channel;
        }
    }
}
