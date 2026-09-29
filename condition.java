// import java.util.*;
// public class condition {
//     public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     if (a>0){
//     System.out.println("positive");
//        }
//     else
//         System.out.println("negative");
//     sc.close();
//     }
// }


// import java.util.*;
// public class condition {
//     public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();


// int opr = sc.nextInt();
//     if(opr == 1){
//         System.out.println(a+b);
//     }
//     else if(opr == 2){
//         System.out.println(a-b);
//     }
//     else if(opr == 3){
//         System.out.println(a*b);
//     }
//     else if(opr == 4){
//         System.out.println(a/b);
//     }
//     else if(opr == 5){
//         System.out.println(a%b);
//     }
//     sc.close();

// }
// }

// SECOND METHOD 

    // int n = sc.nextInt();
    // switch(n){
    //     case 1:
        //     System.out.println(a+b);
        //     break;
        // case 2:
        //     System.out.println(a-b);
        //     break;
        // case 3:
        //     System.out.println(a*b);
        //     break;
//         case 4:
//             System.out.println(a/b);
//             break;
//          case 5:
//             System.out.println(a%b);
//              break;
//         default:
//             System.out.println("nothing");
//         }
// sc.close();
//     }
// }


// import java.util.*;
// public class condition {
//     public static void main(String[] args){
//     System.out.println("enter your month number:");
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     if(n==1){
//         System.out.println("January");
//     }
//     else if(n==2){
//         System.out.println("february");
//     }
//     else if(n==3){
//         System.out.println("march");
//     }
//     else if(n==4){
//         System.out.println("April");
//     }
//     else if(n==5){
//         System.out.println("May");
//     }
//     else if(n==6){
//         System.out.println("June");
//     }
//     else if(n==7){
//         System.out.println("July");
//     }
//     else if(n==8){
//         System.out.println("August");
//     }
//     else if(n==9){
//         System.out.println("September");
//     }
//     else if(n==10){
//         System.out.println("October");
//     }
//     else if(n==11){
//         System.out.println("November");
//     }
//     else if(n==12){
//         System.out.println("December");
//     }
//        else{
//             System.out.println("nothing");
//         }
//     sc.close();
// }
//     }


//TRIANGLE VALIDITY
// 🔥 Level 2 — Triangle Validity
// Three angles a, b, c input lo.
// Check:
// Kya valid triangle hai?
// Agar valid hai, toh:
// a == b == c → Equilateral
// Any two equal → Isosceles
// All different → Scalene
//Hint: Valid triangle ke liye sum of angles 180 hona chahiye.


// import java.util.*;
// public class condition{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         if(a>0 && b>0 && c>0 && a+b+c == 180){
//             if(a==b && b==c && c==a){
//                 System.out.println("Equilateral");
//             }
//             else if(a==b||b==c||c==a){
//                 System.out.println("Isosceles");
//             }
//             else if(a!=b && b!=c && c!=a){
//                 System.out.println("Scalene");
//             }
//         }
//         else{
//             System.out.println("no triangle is valid");
//         }
// sc.close();
//     }
// }

//ELECTRICITY BILL
// Level 3 — Electricity Bill 💡
// Units input lo:
// First 100 units → ₹5/unit
// Next 100 units → ₹7/unit
// Above 200 → ₹10/unit
// Total bill calculate karke print karo


// import java.util.*;
// public class condition{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int unit = sc.nextInt();
//         if ( unit <= 100){
//             System.out.println(unit*5);
//         }
//         else if(unit <= 200){
//             System.out.println((100*5)+(unit-100)*7);
//         }
//         else{
//             System.out.println((100*5)+(100*7)+(unit-200)*10);
//         }
//         sc.close();
//     }
// }


// 🔥🔥 Level 5 — Date Validation
// Input lo:
// day month year
// Check karo date valid hai ya nahi.
// Example:
// Input:
// 29 2 2024
// Output:
// Valid Date
// But:
// Input:
// 29 2 2025
// Output:
// Invalid Date
// Isme month + days + leap year teenon ka logic combine hoga. 😈



// import java.util.*;
// public class condition{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int days = sc.nextInt();
//         int month = sc.nextInt();
//         int year = sc.nextInt();
//         if (month>=1 && month <=12){
//             if(month == 1 || month == 3 || month ==5 ||month ==7 ||
//                  month == 8 || month == 10 || month == 12){
//                 if(days >=1 && days <= 31){
//                     System.out.println("valid Date");
//             }
//                 else {
//                     System.out.println("Invalid Date");
//                 }
//             }
//             else if(month == 4 || month == 6 || month == 9 || month == 11){
//                 if(days >=1 && days <= 30){
//                     System.out.println("valid Date");
//             }
//                 else{
//                     System.out.println("Invalid Date");
//                 }
//             }
//             else{
//                 if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
//                     if(days >=1 && days <= 29){
//                         System.out.println("valid Date");
//             }
//                     else{
//                     System.out.println("Invalid Date");
//                 }
//             }
//                 else{
//                      if(days >=1 && days <= 28){
//                     System.out.println("valid Date");
//             }
//                 else{
//                     System.out.println("Invalid Date");
//                 }
//                 }
//                 }
//             }
        
//         else{
//             System.out.println("Invalid Month");
//         }
//         sc.close();
//     }
//     }

// import java.util.*;
// public class condition{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if(n%2 == 0){
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("odd");
//         }
//         sc.close();
//     }
// }

//USING TERNARY OPERATOR 

// import java.util.*;
// public class condition{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
// **     String result = (num % 2 == 0) ? "Even" : "Odd";
//         System.out.println(result);
//         sc.close();
//     }
// }

//SYNTAX OF TERNARY OPR -- DATATYPE VAR. = (CONDITION) ? "VALUE IF TRUE" : "VALUE IF FALSE" ;
// condition pratice completed 

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//🔥 JAVA ARRAY — COMPLETE CONCEPT + APPROACH ROADMAP
// 1.  Array Traversal ⭐ - Array ke har element ko ek-ek karke visit karna.
//Kab use karna hai? - print all elements,sum,count,maximum/minimum,search,frequency.
//MAIN LOGIC
//for(int i = 0; i < arr.length; i++) {
//  System.out.println(arr[i]);
//}

//2. Maximum / Minimum ⭐⭐ - Ek element ko initially max/min maan lo aur baaki elements se compare karo.
//MAIN LOGIC
// Maximum
// int max = arr[0];
// for(int i = 1; i < arr.length; i++) {
//     if(arr[i] > max) {
//         max = arr[i];
//     }
// }
// Minimum
// int min = arr[0];
// for(int i = 1; i < arr.length; i++) {
//     if(arr[i] < min) {
//         min = arr[i];
//     }
// }
// Use - largest,maximum,smallest,minimum
// Find largest element without sorting.

//3. Counting Approach ⭐⭐ - Jab kisi property wale elements ki quantity chahiye.
//MAIN LOGIC
// int count = 0;
// for(int i = 0; i < arr.length; i++) {
//     if(arr[i] % 2 == 0) {
//         count++;
//     }
// }
//Use - How many/count/number of

//4. Linear Search ⭐⭐ - Target ko array ke har element se compare karo.
//MAIN LOGIC
// for(int i = 0; i < arr.length; i++) {
//     if(arr[i] == target) {
//         System.out.println("Found");
//         break;
//     }
// }
//Use - Search an element,Find index of element,Count occurrences
//  of target,Find first occurrence,Find last occurrence

//5. Two Pointers ⭐⭐- Array ke do positions/pointers ko simultaneously move karna.
//use - Reverse array,Pair sum in sorted array,Palindrome,Remove duplicates from sorted array,Move certain elements,Partitioning.
//MAIN LOGIC
// int left = 0;
// int right = arr.length - 1;
// while(left < right) {
//     // logic
//     left++;
//     right--;
// }
//6. Second Largest ⭐⭐-Ek pass mein largest aur second largest maintain karo.
//Kab - Find second largest without sorting.
//MAIN LOGIC
// int largest = Integer.MIN_VALUE;
// int second = Integer.MIN_VALUE;
// for(int i = 0; i < arr.length; i++) {
//     if(arr[i] > largest) {
//         second = largest;
//         largest = arr[i];
//     }
//     else if(arr[i] > second && arr[i] != largest) {
//         second = arr[i];
//     }
// }

//7. Duplicate Elements ⭐⭐- if(arr[i] == arr[j]) 
//8. Move Zeros ⭐⭐- Non-zero elements ko beginning mein place karo.
//Two-pointer/write-index approach:
//MAIN LOGIC
// int index = 0;
// for(int i = 0; i < arr.length; i++) {
//     if(arr[i] != 0) {
//         arr[index] = arr[i];
//         index++;
//     }
// }
//9.Prefix Sum ⭐⭐ - 
//MAIN LOGIC
// prefix[0] = arr[0];

// for(int i = 1; i < arr.length; i++) {
//     prefix[i] = prefix[i - 1] + arr[i];
// }
//10. Sliding Window ⭐⭐- Array ke continuous elements ki ek window maintain karte hain.
//MAIN LOGIC
// int sum = 0;
// for(int i = 0; i < k; i++) {
//     sum += arr[i];
// }
// for(int i = k; i < arr.length; i++) {
//     sum += arr[i];
//     sum -= arr[i - k];
// }
//11. Binary Search ⭐⭐
// target == mid → found
//target < mid  → left side
//target > mid  → right side
// MAIN LOGIC
// int left = 0;
// int right = arr.length - 1;
// while(left <= right) {
//     int mid = left + (right - left) / 2;
//     if(arr[mid] == target) {
//         System.out.println("Found");
//         break;
//     }
//     else if(arr[mid] < target) {
//         left = mid + 1;
//     }
//     else {
//         right = mid - 1;
//     }
// }
//12.Kadane's Algorithm ⭐⭐ - Ye maximum subarray sum ke liye.
// MAIN LOGIC
// int current = arr[0];
// int maximum = arr[0];
// for(int i = 1; i < arr.length; i++) {
//     current = Math.max(arr[i], current + arr[i]);
//     maximum = Math.max(maximum, current);
// }