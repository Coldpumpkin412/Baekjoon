import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int L = sc.nextInt();
		int R = sc.nextInt();
		int A = sc.nextInt();

		int sum = L + R + A;
		int tmp = A - Math.abs(L-R);

		System.out.println((tmp>=0) ? sum-tmp%2 : sum-Math.abs(tmp));
	}
}