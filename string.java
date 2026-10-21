// import java.util.*;
//public class string {
  //  public static void main(String[] args){
//     String str1 = "vanshika";
    // System.out.println(str.charAt(4));                          //isme hm kisi bhi index ko access kr skte h. 

    //str = "kanak";                                              //isme string change nhi hui h vo immutable hi h but string nenw bn gyi h 
    //System.out.println(str);
    
    // String str2 = "vanshika";
    // if(str1==str2){
    // System.out.println("true");}
    // else{
    //     System.out.println("false");
   // } 

//    String str2 = "vanshika";
//    if(str1.equals(str2)){
//         System.out.println(true);
//    }
//    else{
//     System.out.println(false);
//    }

//     String str2 = "vAnshika";
//     if(str1.equalsIgnoreCase(str2)){
//         System.out.println(true);
//     }
//     else{
//         System.out.println(false);
//     }


//     Scanner sc = new Scanner(System.in);
//     String str = sc.nextLine();
//     System.out.println(str);


    // sc.close();
//     System.out.println(str1.length());
//     System.out.println(str1.charAt(5));
//     System.out.println(str1.replace('n','m'));
//     System.out.println(str1.toUpperCase());
//     System.out.println(str1.toLowerCase());

// String str = "  ";
// System.out.println(str.length());
// System.out.println(str.isBlank());
// System.out.println(str.isEmpty());


// String name = "  vanshika  ";
// System.out.println(name.length());
// name = name.trim();
// System.out.println(name.length());

//     }
// }

class Car {
    String brand;
    int year;

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}
public class string {
    public static void main(String[] args) {

        Car car1 = new Car();  // Creating first object
        car1.brand = "Toyota";
        car1.year = 2020;
        car1.display();

        Car car2 = new Car();  // Creating second object
        car2.brand = "Ford";
        car2.year = 2018;
        car2.display();
    }
}