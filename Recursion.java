package Java;
import java.util.*;
public class Recursion {
    public static void cout(int num){
        if(num == 1){
            System.out.print("1");
            return;
        }
        cout(num-1);
        System.out.print(num);
    }
    public static void printing(int num){
        if(num == 1){
            System.out.print("1");
            return;
        }
        System.out.print(num + " ");
        printing(num - 1);
    }
    public static void main(String args[]) {
        cout(10);
    }
}