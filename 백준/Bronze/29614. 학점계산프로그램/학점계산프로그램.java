import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("#.####");
        
        String str = br.readLine();

        double sum = 0.0;
        int count = 0;

        for(int i=0 ; i<str.length() ; i++) {
            char grade = str.charAt(i);
            double gradeValue = 0.0;
    
            //+붙은 경우
            if(i<str.length()-1 && str.charAt(i+1)=='+') {
                switch(grade) {
                    case 'A':
                        gradeValue += 4.5;
                        break;
                    case 'B':
                        gradeValue += 3.5;
                        break;
                    case 'C':
                        gradeValue += 2.5;
                        break;
                    case 'D':
                        gradeValue += 1.5;
                        break;
                }
                
                i++;
            } else { //아닌경우
                switch (str.charAt(i)) {
                    case 'A':
                        gradeValue += 4.0;
                        break;
                    case 'B':
                        gradeValue += 3.0;
                        break;
                    case 'C':
                        gradeValue += 2.0;
                        break;
                    case 'D':
                        gradeValue += 1.0;
                        break;
                    case 'F':
                        gradeValue += 0.0;
                        break;
                }
            }
            
            sum += gradeValue;
            count++;
        }

        double avr = sum / count;
        
        System.out.println(df.format(avr));
    }

}