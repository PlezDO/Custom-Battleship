package main;
import java.util.ArrayList;
import java.util.Scanner;
//import java.lang.Math;
public class Battleship {
    public static int height = 0;
    public static int width= 0;
    public static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input board height: ");
        height = s.nextInt();
        System.out.println("Please input board width: ");
        width = s.nextInt();

    }
    private ArrayList[][] board = new ArrayList[height][width];
    public int shipNoDecider(int height, int width) {
        if(height > 4 || width > 4) {
            double size = width * height * .17;
            return (int) size;
        }
        else {
            System.out.println("ERROR: SHIPS COULD NOT BE DECIDED");
            return 0;
        }
    }
    //public static getNoShips() {
    //    return 
    //}
    
}