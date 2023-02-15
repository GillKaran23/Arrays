import java.util.*;
public class arraysobjects {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type number of elements: ");
        int n = sc.nextInt();
        int[] number = new int[n];
        System.out.println("Type elements: ");
        for(int i=0; i<n; i++){
            number[i] = sc.nextInt();
        }
        number[4]=3; //replace 5th element with 3.
        System.out.println("Elements are: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(number[i]+" ");
        }
    }
}
