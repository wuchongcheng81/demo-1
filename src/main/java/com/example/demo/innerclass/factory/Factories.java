package com.example.demo.innerclass.factory;

interface ServiceFactory {
    Service getService();
}

class ServiceImpl1 implements Service {

    @Override
    public void printString(String msg) {
        System.out.println("msg1 = [" + msg + "]");
    }

    @Override
    public void printInt(int num) {
        System.out.println("num1 = [" + num + "]");
    }

    public static ServiceFactory factory = () -> {
        return new ServiceImpl1();
    };
}

class ServiceImpl2 implements Service {

    @Override
    public void printString(String msg) {
        System.out.println("msg2 = [" + msg + "]");
    }

    @Override
    public void printInt(int num) {
        System.out.println("num2 = [" + num + "]");
    }

    public static ServiceFactory factory = () -> {
        return new ServiceImpl2();
    };
}

public class Factories {
    public static void serviceConsumer(ServiceFactory serviceFactory) {
        Service service = serviceFactory.getService();
        service.printString("test");
        service.printInt(3);
    }

    public static void main(String[] args) {
        serviceConsumer(ServiceImpl1.factory);
        serviceConsumer(ServiceImpl2.factory);
    }
}