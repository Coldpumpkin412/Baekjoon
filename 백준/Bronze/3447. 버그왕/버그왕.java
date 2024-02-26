import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String str;

        while((str = br.readLine()) != null){

            while(str.contains("BUG")) {
                str = str.replaceAll("BUG", "");
            }

            sb.append(str + "\n");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}