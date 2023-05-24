package com.green.java.ioc.next;

import com.green.java.ioc.Speaker;
import com.green.java.ioc.Tv;

public class SamsungTv implements Tv {
    private Speaker speaker;

    public SamsungTv(Speaker speaker) {
        this.speaker = speaker;
    }


    @Override
    public void turnOn() {
        System.out.println("삼성 Tv켜기");
        speaker.volumeUp();

    }

    @Override
    public void turnOff() {
        System.out.println("삼성 Tv끄기");
        speaker.volumeDown();
    }
}
