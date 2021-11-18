import java.util.Scanner;

public class Number {
    int a, j, i;
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] arr = new int [n];

    Number(){
        a = s.nextInt();
        for(i =0; i< arr.length; i++){
            arr[i] = s.nextInt();
        }
    }
    public int find(){
        for(j =0; j<n; j++){
            if(arr[j] == a)
                return j;
        }
        return -1;
    }

    public static void main(String[] args) {
        Number obj = new Number();
        System.out.println(obj.find());
    }
}
