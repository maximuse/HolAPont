package hu.nyirszikszi;

import hu.nyirszikszi.holapont.HolAPont;

public class Main {
    public static void main(String[] args) {
        HolAPont p = new HolAPont(1, 1);
        System.out.println(p.hely());

        HolAPont p1 = new HolAPont(6, -7);
        System.out.println(p1.hely());
    }
}