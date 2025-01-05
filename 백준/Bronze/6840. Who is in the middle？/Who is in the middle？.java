import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        
        list.add(number1);
        list.add(number2);
        list.add(number3);
        
        Collections.sort(list);
        
        System.out.println(list.get(1));
    }
}