import java.util.*;
public class twoDarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the number of elements: ");
        int n = sc.nextInt();
        int[][] number = new int[n][n];
        System.out.println("Type elements: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                number[i][j]=sc.nextInt();
            }
        }
        System.out.println("Elements are: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }
    }
}
