// public class loop {
//     public static void main(String[] args){
//         for(int i=1;i<11;i++){
//             System.out.println(i);
//         }
//     }
    
// }

// public class loop {
//     public static void main(String[] args){
//         for(int i=10;i>0;i--){
//             System.out.println(i);
//         }
//     }
    
// }

// public class loop {
//     public static void main(String[] args){
//         for(int i=1;i<21;i++){
//             if(i%2==0)
//             System.out.println(i);
//         }
//     }
    
// }

// public class loop {
//     public static void main(String[] args){
//         int sum = 0;
//         for(int i=1;i<11;i++){
//             System.out.println(i);
//             sum += i;
//         }
//        System.out.println(sum);
//     }
    
// }


// import java.util.*;
// public class loop{
//     public static void main(String[] args){
//         int positive = 0;
//         int negative = 0;
//         int zero = 0;
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=0;i<=n;i++){
//             int num = sc.nextInt();
//             if(num>0){
//                 positive++;
//              }
//             else if(num<0){
//                 negative++;
//             }
//             else{
//                zero++;
//             }
//         }
//         System.out.println("positive"+positive);
//         System.out.println("negative"+negative);
//         System.out.println("zero"+zero);
//  sc.close();
//     }
// }

// import java.util.*;
// public class loop{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int max = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             int num = sc.nextInt();
//             if (num > max){
//                 max = num;
//             }
//         }
//         System.out.println(max);

// sc.close();

//     }
// }


// import java.util.*;
// public class loop {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             if(i == 6){
//                 break;
//             }
//             System.out.println(i);
//         }
//     }
// }


// import java.util.*;
// public class loop {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             if(i == 6){
//                 continue;
//             }
//             System.out.println(i);
//         }
// sc.close();
//     }
// }

// import java.util.*;
// public class loop {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print(" * ");
//             }
//             System.out.println("");
//         }
//         sc.close();
//     }
// }



// import java.util.*;
// public class loop {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=0;i<=n;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//         sc.close();
//     }
// }


// import java.util.*;
// public class loop {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=n;i>=0;i--){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//         sc.close();
//     }
// }


// import java.util.*;
// public class loop {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=0;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println("");
//         }
//         sc.close();
//     }
// }

import java.util.*;
public class loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =0;
        while(i<=n){
            if(i%i==0 && i%1==0){
                System.out.println(i);
            }
            i++;
        }
sc.close();
    }
}