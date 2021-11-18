import java.util.Scanner;

public class Char {
    int i;
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] arr = new int [n];
    Char() {
        for (i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
    }
        public void convert(){
            for(int j= 0; j<n; j++){
                System.out.println((char)arr[j]);
            }
        }

    public static void main(String[] args) {
        Char obj = new Char();
        obj.convert();
    }
}
