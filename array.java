// import java.util.*;
// public class array {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int number[] = new int[size];

//         for(int i=0;i<size;i++){
//             number[i] = sc.nextInt();
//         }
//         for(int i=0; i<number.length;i++){
//             System.out.println(number[i]+" ");
//         }
//         sc.close();
//     }
// }



// TAKE AN ARRAY OF NAMES AS INPUT FRROM THE USER AND PRINT THEM ON THE SCREEEN.
// import java.util.*;
//  public class array{
//    public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         String names[] = new String[n];         // CREATE AN ARRAY OF NAMES 
//         for(int i=0;i<n;i++){
//             names[i] = sc.next();
//         }
//         for(int i =0;i<n;i++){
//             System.out.println("names " + (i+1) +" is : " + names[i]);
//         }
// sc.close();
//     }
//}


// FIND THE MAXIMUM AND MINIMUM NUMBER IN AN ARRAY OF INTEGERS.


// import java.util.*;
// public class array{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//     int max = Integer.MIN_VALUE;
//     int min = Integer.MAX_VALUE;
    
//     for(int i=0;i<arr.length;i++){
//         if(arr[i] < min ){
//             min = arr[i];
//         }
//         if(arr[i] > max){
//             max = arr[i];
//         }
//     }
//     System.out.println("Largest number is :" + max);
//     System.out.println("Shortest number is :" + min);
// sc.close();
//     }
// }

// SORTING BUBBLE SORT

// import java.util.*;
// public class array{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int temp;
//         int[] arr = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<n-1;i++){
//             for(int j =0;j<n-1-i;j++){
//                 if(arr[j]> arr[j+1]){
//                 temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;
//                 }
//             }
//         }
// System.out.println("Sorted array:");
// for(int i=0;i<n;i++){
//     System.out.print(arr[i] + " ");
// }
// sc.close();
//     }
// }

// TAKE AN ARRAY OF NUMBERS AS INPUT AND CHECK IF IT IS AN ARRAY SORTED IN ASCENDING ORDER.

// import java.util.*;
// public class Arrays {
//    public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       int size = sc.nextInt();
//       int numbers[] = new int[size];

//       for(int i=0; i<size; i++) {
//           numbers[i] = sc.nextInt();
//       }

//       boolean isAscending = true;
//        for(int i=0; i<numbers.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
//            if(numbers[i] > numbers[i+1]) { // This is the condition for descending order
//                isAscending = false;
//            }
//        }

//        if(isAscending) {
//            System.out.println("The array is sorted in ascending order");
//        } else {
//            System.out.println("The array is not sorted in ascending order");
//        }
// sc.close(); 
//    }
// }


// 2D-ARRAY ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// import java.util.*;
// public class array {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         int columns = sc.nextInt();
//         int x = sc.nextInt();
//         int[][] numbers = new int[rows][columns];
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<columns;j++){
//                 numbers [i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<columns;j++){
//                 System.out.print(numbers[i][j] + " ");
//             }
//             System.out.println();
//         }
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<columns;j++){
//                 if(numbers[i][j] == x){
//                     System.out.println("x found at location ("+ i +","+ j +")");
//                 }  
//           }
//     }
//     sc.close();
//     }
// }

// import java.util.*;
// public class array{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         int columns = sc.nextInt();
//         int[][] arr2 = new int[rows][columns];
//         for(int i=0;i< rows;i++){
//             for(int j=0;j<columns;j++){
//                 arr2[i][j] = sc.nextInt();
//             }
//         }
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<columns;j++){
//                 System.out.print(arr2[i][j]+" ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }