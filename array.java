import java.util.*;
public class array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type number of elements: ");
        int n = sc.nextInt();
        String[] name = new String[n];
        System.out.println("Type elements: ");
        for(int i=0; i<n; i++){
            name[i] = sc.next();
        }
        System.out.println("Elements are: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(name[i]+" ");
        }
    }
}