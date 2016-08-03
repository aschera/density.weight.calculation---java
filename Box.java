
package matchbox;

public class Box {
 
   double width;
   double height;
   double depth;
   
   
 
   // This is an empty constructor
   Box() {
          ;
   }
 
   Box(double w, double h, double d) {
          width = w;
          height = h;
          depth = d;
   }
 
    //The getVolume method in this class calculates and reports the volume. 
   void getVolume() {
          System.out.println("Volume is : " + width * height * depth);
   }
}

