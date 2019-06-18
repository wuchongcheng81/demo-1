package com.example.demo.innerclass;

public class DestinationTest {
    public Destination destination(final String msg) {
        return new Destination() {
            private int count;
            {
                count = Math.round(10);
                System.out.println("count = [" + count + "]");
                if(count > 1) {
                    System.out.println("init > 1");
                }else {
                    System.out.println("init < 1");
                }
            }

            @Override
            public String printMsg() {
                return msg;
            }
        };
    }

    public static void main(String[] args) {
        DestinationTest dt = new DestinationTest();
        Destination d = dt.destination("hello");
    }
}
