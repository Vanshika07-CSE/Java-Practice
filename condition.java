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