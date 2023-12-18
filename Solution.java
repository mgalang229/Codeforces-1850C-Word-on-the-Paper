import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			char[][] s = new char[8][];
			for (int i = 0; i < 8; i++) {
				s[i] = fs.next().toCharArray();
			}
			String ans = "";
			for (int i = 0; i < 8; i++) {
				for (char c : s[i]) {
					if (Character.isAlphabetic(c)) {
						ans += c;
					}
				}
			}
			System.out.println(ans);
		}
		fs.close();
	}
}
