import java.util.*;
public class tostring {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type number of elements: ");
        int n = sc.nextInt();
        int[] number = new int[n];
        System.out.println("Type elements: ");
        for(int i=0; i<n; i++){
            number[i] = sc.nextInt();
        }
        System.out.print("Elements are: ");
        System.out.print(Arrays.toString(number)); //it shows Array in string form
    }
}
