import java.util.Scanner;

public class Sum {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] arr = new int[n];
    int i, j= 0, a= 0;

    Sum(){
        for (i =0; i<n; i++){
            arr[i] = s.nextInt();
        }
    }
    public int Add(){
        for (i=0; i< arr.length; i++){
            if (arr[i] == 6) {
                for (j = 0; j < arr.length; j++) {
                    if (arr[j] == 7) {
                        i = j+1;
                    }
                }
            }
                a = a+ arr[i];
        }
        return a;
    }

    public static void main(String[] args) {
        Sum obj =new Sum();
        System.out.println(obj.Add());
    }
}
