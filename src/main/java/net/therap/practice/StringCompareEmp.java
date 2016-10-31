package net.therap.practice;

import java.util.*;

/**
 * Created by rakib on 10/31/2016.
 */

// Write your Checker class here

class Checker implements Comparator<Player>{

    public int compare(Player a, Player b){
        if(a.score < b.score) return 1;
        else if(a.score == b.score) {
            if((a.name).compareTo(b.name) < 0) return -1;
            else if((a.name).compareTo(b.name) > 0) return 1;
            else return 0;
        }
        else return -1;
    }
}

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class StringCompareEmp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}