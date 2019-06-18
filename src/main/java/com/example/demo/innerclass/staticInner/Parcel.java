package com.example.demo.innerclass.staticInner;

import com.example.demo.innerclass.Destination;

public class Parcel {
    private static class ParcelDestination implements Destination {
        @Override
        public String printMsg() {
            return "ParcelDestination print msg.";
        }

        private ParcelDestination (String initMsg) {
            System.out.println("initMsg = [" + initMsg + "]");
        }
    }

    public static void main(String[] args) {
        ParcelDestination parcelDestination = new ParcelDestination("first init");
    }

}
