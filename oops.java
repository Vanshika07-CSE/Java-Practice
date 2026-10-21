//EMCAPSULATION-------------------------------------------------------------------------------------------------------------------------
// class Student {
//     int marks;
//     void setMarks(int m) {
//         marks = m;
//     }
// }
// public class oops{
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.setMarks(90);
//         System.out.println(s1.marks);
//     }
// }

// | Getter                           | Setter                       |
// | -------------------------------- | ---------------------------- |
// | Reads a value                    | Changes a value              |
// | Usually returns the field's type | Often has return type `void` |
// | Example: `getAge()`              | Example: `setAge(25)`        |


// | Concept         | Meaning                                        |
// | -------------   | ---------------------------------------------- |
// | Encapsulation   | Combining data and methods in a class          |
// | `private`       | Restricts direct access from outside the class |
// | Getter          | Reads a variable's value                       |
// | Setter          | Updates a variable's value                     |
// | Data hiding     | Protecting data from direct access             |
// | Validation      | Checking whether an input is valid             |


//Create a class with private variables and public methods

// class Student{
// private int marks;
// public int age;
// public void setMarks(int m){
//     marks = m;
// }
// public int getMarks(){
//     return marks;
// }
// }
// public class oops{
//     public static void main(String[] args){
//         Student s = new Student();
//         s.setMarks(85);
//         s.age = 12;
//         System.out.println("age: " + s.age);
//         System.out.println("marks:" + s.getMarks());
//     }
// }


//Getters and setters        Read and update private variables


// class Student {
//     private String name;
//     private int marks;

//     public int age;
//     public String collegeName;

//     // Setter for name
//     public void setName(String name) {
//         this.name = name;
//     }

//     // Getter for name
//     public String getName() {
//         return name;
//     }

//     //Setter for marks
//     public void setMarks(int marks) {
//         this.marks = marks;
//     }

//     // Getter for marks
//     public int getMarks() {
//         return marks;
//     }
// }
// public class oops {
//     public static void main(String[] args) {
//         Student s = new Student();

//         s.setName("Vanshika");
//         s.setMarks(85);

//         s.age = 19;
//         s.collegeName = "RCEW";

//         System.out.println("Name: " + s.getName());
//         System.out.println("Age: " + s.age);
//         System.out.println("Marks: " + s.getMarks());
//         System.out.println("College: " + s.collegeName);
//     }
// }

//Using this keyword      Differentiate instance variables from parameters

//class Student {
// private String name;
// private int age;
// // Setter for name
// public void setName(String name) {
//     this.name = name;
// }
// // Setter for age
// public void setAge(int age) {
//     this.age = age;
// }
// // Getter for name
// public String getName() {
//     return name;
// }
// // Getter for age
// public int getAge() {
//     return age;
// }
//     }
// public class oops {
// public static void main(String[] args) {
// Student s = new Student();

//     s.setName("Vanshika");
//     s.setAge(19);

//     System.out.println("Name: " + s.getName());
//     System.out.println("Age: " + s.getAge());
// }
//     }



//Data validation        Accept only valid marks, age, salary, etc.

// class Student {
//     private int marks;
//     public void setMarks(int marks) {
//         if (marks >= 0 && marks <= 100) {
//             this.marks = marks;
//         } else {
//             System.out.println("Invalid marks!");
//         }
//     }
//     public int getMarks() {
//         return marks;
//     }
// }
// public class oops {
//     public static void main(String[] args) {
//         Student s = new Student();
//         s.setMarks(85);
//         System.out.println("Marks: " + s.getMarks());
//         s.setMarks(150);
//         System.out.println("Marks: " + s.getMarks());
//     }
// }

//Multiple private variables        Encapsulate name, roll number, and marks

// class Student {
// private String name;
// private int rollNo;
// private int marks;
// // Setters
// public void setName(String name) {
//     this.name = name;
// }
// public void setRollNo(int rollNo) {
//     this.rollNo = rollNo;
// }
// public void setMarks(int marks) {
//     this.marks = marks;
// }
// // Getters
// public String getName() {
//     return name;
// }
// public int getRollNo() {
//     return rollNo;
// }
// public int getMarks() {
//     return marks;
// }
// // Display all details
// public void display() {
//     System.out.println("Name: " + name);
//     System.out.println("Roll Number: " + rollNo);
//     System.out.println("Marks: " + marks);
// }
// }
// public class oops {
// public static void main(String[] args){
// Student s = new Student();

//     s.setName("Vanshika");
//     s.setRollNo(101);
//     s.setMarks(85);
//     s.display();
// }
// }

// TOUGH - Real-world programs         Create a BankAccount, Student, or Employee class

// class BankAccount {
// private double balance;
// // Deposit money
// public void deposit(double amount) {
//     if (amount > 0) {
//         balance = balance + amount;
//         System.out.println("Amount deposited successfully!");
//     } else {
//         System.out.println("Invalid amount!");
//     }
// }
// // Withdraw money
// public void withdraw(double amount) {
//     if (amount > 0 && amount <= balance) {
//         balance = balance - amount;
//         System.out.println("Amount withdrawn successfully!");
//     } else {
//         System.out.println("Invalid amount or insufficient balance!");
//     }
// }
// // Getter
// public double getBalance() {
//     return balance;
// }
// }
// public class oops{
// public static void main(String[ ] args) {
// BankAccount account = new BankAccount();
//     account.deposit(5000);
//     account.withdraw(1000);
//     System.out.println("Balance: " + account.getBalance());
// }
// }
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------


//INHERITANCE-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------


// class Animal{
//     void eat(){
//         System.out.println("Animal is eating");
//     }
// }
// class Dog extends Animal{
// //extends is the keyword used for class inheritance.
//     void brak(){
//         System.out.println("Dogs are barking");
//     }
// }
// public class oops {
//     public static void main(String[] args){
//         Dog d = new Dog();
//         d.eat();
//         d.brak();
//     }
// }