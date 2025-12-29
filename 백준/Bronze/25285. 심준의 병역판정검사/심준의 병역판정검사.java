import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int T = Integer.parseInt(br.readLine());
        
        while(T-->0){
            st = new StringTokenizer(br.readLine());
            double cm = Double.parseDouble(st.nextToken());
            double kg = Double.parseDouble(st.nextToken());
            double bmi = kg / (cm*cm/10000);
            
            if(cm < 140.1){
                System.out.println(6);
            }else if(cm < 146){
                System.out.println(5);
            }else if(cm < 159){
                System.out.println(4);
            }else if(cm < 161){
                if(16.0<=bmi && bmi<35.0){
                    System.out.println(3);
                }else{
                    System.out.println(4);
                }
            }else if(cm < 204){
                if(20.0<=bmi && bmi<25.0){
                    System.out.println(1);
                }else if(18.5<=bmi && bmi<20.0){
                    System.out.println(2);
                }else if(25.0<=bmi && bmi<30.0){
                    System.out.println(2);
                }else if(16.0<=bmi && bmi<18.5){
                    System.out.println(3);
                }else if(30<=bmi && bmi<35.0){
                    System.out.println(3);
                }else{
                    System.out.println(4);
                }
            }else{
                System.out.println(4);
            }
        }
    }
}