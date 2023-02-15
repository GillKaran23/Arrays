import java.util.*;
public class arraylist {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>(5);
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of elements: ");
        int n = sc.nextInt();
        System.out.println("Type the elements:");
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        System.out.println("ArrayList is: ");
        for(int j=0; j<n; j++){
            System.out.print(list.get(j));
        }
    }
}
