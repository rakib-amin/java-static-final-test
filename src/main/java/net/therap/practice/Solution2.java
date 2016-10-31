package net.therap.practice;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by rakib on 10/31/2016.
 */

public class Solution2{
    Scanner sc = new Scanner(System.in);
    CalculateVol output;
    public Solution2(){}
    public static CalculateVol do_calc(){
        return new CalculateVol();
    }

    public int get_int_val() throws IOException {
        return sc.nextInt();
    }
    public double get_double_val() throws IOException {
        return sc.nextDouble();
    }
}

class CalculateVol{
    // cube
    public double get_volume(int a){
        if(a <= 0) {
            throw new NumberFormatException("All the values must be positive");
        }
        return a*a*a;
    }
    // cuboid
    public double get_volume(int l, int b, int h){
        if(l <= 0 || b <= 0 || h <= 0) {
            throw new NumberFormatException("All the values must be positive");
        }
        return l*b*h;
    }
    // hemisphere
    public double get_volume(double r){
        if(r <= 0) {
            throw new NumberFormatException("All the values must be positive");
        }
        return (2*Math.PI*r*r*r)/3.0;
    }
    // cyllinder
    public double get_volume(double r, double h){
        if(r <= 0 || h <= 0) {
            throw new NumberFormatException("All the values must be positive");
        }
        return Math.PI*r*r*h;
    }

    public void display(double vol){
        System.out.printf("%.3f\n", vol);
    }
}
