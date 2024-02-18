import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Set<String> colors = new HashSet<String>();

        int input = 2;
        
        for(int i=0; i<4; i++){
            colors.add(sc.next());
        } 

        String[][] map = new String[colors.size()* colors.size()][2];

        int i=0;
        
        for(String color1: colors) {
            int j=0;
            
            for(String color2 : colors) {
                map[i*colors.size() + j][0] = color1;
                map[i*colors.size() + j][1] = color2;
                j++;
            }
            i++;
        }

        Arrays.sort(map, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(o1[0].toString().contentEquals(o2[0].toString()))
                    return o1[1].toString().compareTo(o2[1].toString());
                else
                    return o1[0].toString().compareTo(o2[0].toString());
            }
        });

        for(int k=0; k<map.length; k++){
            System.out.println(map[k][0] + " " + map[k][1]);    
        } 
    }
}