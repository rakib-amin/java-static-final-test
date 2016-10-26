package net.therap.practice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.security.Permission;

/**
 * Created by rakibamin on 10/25/16.
 */
class Calculate{
    Scanner sc = new Scanner(System.in);
    public static final Calculate output = new Calculate();
    public Calculate(){}
    public static Calculate do_calc(){
        return new Calculate();
    }
    // cube
    public double get_volume(int a){
        return a*a*a;
    }
    // cuboid
    public double get_volume(int l, int b, int h){
        return l*b*h;
    }
    // sphere
    public double get_volume(double r){
        return (2*Math.PI*r*r*r)/3.0;
    }
    // cyllinder
    public double get_volume(double r, double h){
        return Math.PI*r*r*h;
    }
    public int get_int_val() throws IOException {
        return sc.nextInt();
    }
    public double get_double_val() throws IOException {
        return sc.nextDouble();
    }
    public void display(double vol) throws RuntimeException{
        if(vol<=0) {

        }
        else {
            System.out.printf("%.3f\n", vol);
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        DoNotTerminate.forbidExit();
        try {
            Calculate cal = new Calculate();
            int T = cal.get_int_val();
            while (T--> 0) {
                double volume = 0.0;
                int ch = cal.get_int_val();
                if (ch == 1) {
                    int a = cal.get_int_val();
                    if(a <= 0) {
                        throw new NumberFormatException("All the values must be positive");
                    }
                    volume = Calculate.do_calc().get_volume(a);
                } else if (ch == 2) {
                    int l = cal.get_int_val();
                    int b = cal.get_int_val();
                    int h = cal.get_int_val();
                    if(l <= 0 || b <= 0 || h <= 0) {
                        throw new NumberFormatException("All the values must be positive");
                    }
                    volume = Calculate.do_calc().get_volume(l, b, h);

                } else if (ch == 3) {
                    double r = cal.get_double_val();
                    if(r <= 0) {
                        throw new NumberFormatException("All the values must be positive");
                    }
                    volume = Calculate.do_calc().get_volume(r);

                } else if (ch == 4) {
                    double r = cal.get_double_val();
                    double h = cal.get_double_val();
                    if(r <= 0 || h <= 0) {
                        throw new NumberFormatException("All the values must be positive");
                    }
                    volume = Calculate.do_calc().get_volume(r, h);

                }
                cal.output.display(volume);
            }

        } catch (NumberFormatException e) {
            System.out.print(e);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }


    } //end of main
} //end of Solution

/**
 *This class prevents the user form using System.exit(0)
 * from terminating the program abnormally.
 *
 */
class DoNotTerminate {

    public static class ExitTrappedException extends SecurityException {}

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
} //end of Do_Not_Terminate

