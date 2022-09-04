package com.test.design.adapter.object;
/**
 * 对象适配器基于组合
 */
public class Demo {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(3D);
        RoundPeg roundPeg = new RoundPeg(2.9);
        SquarePeg squarePeg = new SquarePeg(4);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        System.out.println(roundHole.fits(roundPeg));
        System.out.println(roundHole.fits(squarePegAdapter));


    }
}
