package com.company;

public class Uzel {
    private String hodnota;
    private Uzel front;
    private Uzel last;

    public Uzel(int hodnota) {

    }

    public String getHodnota() {
        return hodnota;
    }
    public void setHodnota(String hodnota) {
        this.hodnota = hodnota;
    }
    public Uzel getFront() {
        return front;
    }
    public void setFront(Uzel front) {
        this.front = front;
    }
    public Uzel getLast() {
        return last;
    }
    public void setLast(Uzel last) {
        this.last = last;
    }
}