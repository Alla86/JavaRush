package com.javarush.test.level27.lesson09.home01;

public class TransferObject {
    private int value;
    protected volatile boolean isValuePresent = false;

    public TransferObject() {
    }

    public synchronized int get() {
        while(!this.isValuePresent) {
            try {
                this.wait();
            } catch (InterruptedException var2) {
                ;
            }
        }

        System.out.println("Got: " + this.value);
        this.isValuePresent = false;
        this.notifyAll();
        return this.value;
    }

    public synchronized void put(int var1) {
        while(this.isValuePresent) {
            try {
                this.wait();
            } catch (InterruptedException var3) {
                ;
            }
        }

        this.value = var1;
        System.out.println("Put: " + var1);
        this.isValuePresent = true;
        this.notifyAll();
    }
}