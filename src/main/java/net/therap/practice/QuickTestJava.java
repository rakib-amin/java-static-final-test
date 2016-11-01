package net.therap.practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by rakib on 10/31/2016.
 */
class QuickTest {

    public QuickTest(){}

    public String clipString(String input, String clipStart, String clipEnd){
        Pattern pattern = Pattern.compile(clipStart+"(.*?)"+clipEnd);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) { return matcher.group(1); }
        return "";
    }

    public void stringToken(){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        int count = 0;
        for (String retval: s.replaceAll("^\\s+", "").split("[ !,?._'@]+")) {
            if("".equals(retval) || "\n".equals(retval) || retval.trim().equals("") || retval.trim().equals("\n")) {
                count = 0;
                break;
            }
            else { count += 1; }
        }
        System.out.println(count);
        for (String retval: s.replaceAll("^\\s+", "").split("[ !,?._'@]+")) {
            if(retval.trim() != "") {
                System.out.println(retval.replaceAll("\\s+", ""));
            }
        }
        scan.close();
    }
}

public class QuickTestJava{
    public static void main(String[] args) {
        QuickTest quickTest = new QuickTest();
//        System.out.println(quickTest.clipString("abSFcd", "ab", "cd"));
//        System.out.println("Hi");
        quickTest.stringToken();
    }
}
