import java.util.*;
 public class Grading_system{
 public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     int marks =sc.nextInt();

     if(marks>90){
         System.out.print("excellent");
     }
     else if(marks>80){
         System.out.print("good");
     }
     else if(marks>70){
         System.out.print("fair");
     }
     else if(marks>60){
         System.out.print("meets expectations");
     }
     else {
         System.out.print("below par");
     }
 }

}