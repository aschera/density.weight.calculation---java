/*
 * Extension of class Box
 * MatchBox = added a new attribute weight
 *
 * getVolume = method must both report the values of width, height, depth, and weight, but must also 
 * calculate and report the volume by multiplying height by width by depth.
 *
 * Add the method calculateWeight() that will calculate weight based upon the volume assuming that the volume is a 
 * quantity of water which weighs .03611 pounds per cubic inch. 
 * Also method calculateWeight should show the result like this: weight of MatchBox is X.
 */
package matchbox;

public class MatchBox extends Box{

    double weight;
    
        // This is an empty constructor
        MatchBox() {
          ;
        }
        
        // This is a constructor with parameters
        MatchBox(double w, double h, double d) {
          width = w;
          height = h;
          depth = d;
        }
        
        // calculate weight based upon volume.
        //Calculate M Given p and V -- Calculate mass(weight) given density(pounds per cubic inch)and volume. -- M = pV
        private void calculateWeight(double number) {
            System.out.println ("weight of MatchBox is " + (width * height * depth) * number);
        }
        
        //The getVolume method in this class reports the values of width, height, depth, and weight, 
        @Override
        void getVolume() {
            System.out.println ("width of MatchBox is " + width);
            System.out.println ("height of MatchBox is " + height);
            System.out.println ("depth of MatchBox is " + depth);
        }
        
       
    public static void main(String[] args) {

        Box box = new Box(5.0, 10.0, 3.0); // object of class Box
        MatchBox myBox = new MatchBox(5.0, 10.0, 3.0); //object of class MatchBox

        myBox.getVolume();  //calls the getVolume method from the MatchBox class.
        myBox.calculateWeight(0.03611);
        box.getVolume();  //calls the getVolume method from the Box class.

    }   
}
