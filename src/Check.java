import java.util.Scanner;

public class Check {
    Scanner s= new Scanner(System.in);
    int n= s.nextInt();
    int[] arr = new int[n];
    int i,flag= 0;
    Check(){
        for (i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
    }
    public void m1(){
        for(i=0; i<n; i++){
            if(arr[i]== 1 || arr[i] ==4){
                flag= 1;
            }
            else {
                flag = 0;
                break;
            }
        }
        if (flag ==1)
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static void main(String[] args) {
        Check ob = new Check();
        ob.m1();
    }
}
