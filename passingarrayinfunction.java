import java.util.*;
public class passingarrayinfunction {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type number of elements: ");
        int n = sc.nextInt();
        int[] number = new int[n];
        System.out.println("Type elements: ");
        for(int i=0; i<n; i++){
            number[i] = sc.nextInt();
        }
        System.out.println("Elements are: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(number[i]+" ");
        }
        System.out.println();
        another(number);
        System.out.println("Now Elements are: ");
        for(int i=0; i<n; i++)
        {
            System.out.println(number[i]+" ");
        }
    }
    static void another(int[] arr){
        arr[2] = 23; //change 3rd element with 23.
    }   
}