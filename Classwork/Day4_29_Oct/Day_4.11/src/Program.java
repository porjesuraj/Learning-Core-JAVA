//import java.lang.Math;  // jva.Lang class is directly included

//import static java.lang.Math.PI;
//import static java.lang.Math.pow;
import static java.lang.System.out;
import static java.lang.Math.*;
public class Program{

    public static void main(String[] args) {
       
      
        float radius = 10;
  
        float area = (float) (PI * pow(radius,2));
    
        out.println("Area : " + area);
  
      }


    public static void main2(String[] args) {
       
      
      float radius = 10;

      float area = (float) (Math.PI * Math.pow(radius,2));
  
      System.out.println("Area : " + area);

    }
    public static void main1(String[] args) {
       
      
        float radius = 10;
  
        float area = ((float) 3.14 * radius * radius);
    
        System.out.println("Area : " + area);
  
      }
}