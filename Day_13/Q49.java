import java.util.*;
class Q49{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("The the Number of Entries");
    int n = sc.nextInt();
    int arr[]= new int[n];
    System.out.println("Enter the Array");
    for(int i =0; i<arr.length; i++){
        arr[i]= sc.nextInt();
    }
    for(int i =0; i<arr.length; i++){
        System.out.print(" The Entry at Index No "+i+" is = "+arr[i]+"\n");
    }
    sc.close();
}
}
// dynamic initialisation 


// ArrayList<Integer> list = new ArrayList<>();

//         System.out.println("Enter numbers (-1 to stop):");

//         while (true) {
//             int x = sc.nextInt();
//             if (x == -1)
//                 break;
//             list.add(x);
//         }

//         System.out.println("Elements are:");
//         for (int x : list) {
//             System.out.print(x + " ");