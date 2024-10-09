import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
    int target = Integer.parseInt(br.readLine()) / 3;

    int answer = 0;
      
    for(int i=1 ; i<=target ; i++) {
      for(int j=1 ; j<=target-i ; j++) {
        if(target-i-j > 0) {
          answer += 1;
        }
      }
    }
    System.out.println(answer);
  }
}