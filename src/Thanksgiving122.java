/**
 * Activity 1.2.2: Thanksgiving pies and constructors.
 *
 * Complete the overloaded Pie constructors, then create and inspect objects.
 * Java passes a copy of a primitive argument to a constructor.
 *
 * Expected output:
 * Default pie: 1 slice(s)
 * Integer pie: 2 slice(s)
 * Decimal pie: 3 slice(s)
 * Original decimal argument: 3.8
 * Empty pie plate: null
 */
public class Thanksgiving122 {
    public static void main(String[] args) {
        // TODO 1: Declare a double variable with the value 3.8.
        // TODO 2: Create and store three Pie references: one using each
        //         constructor. Pass the variable to the double constructor.
        // TODO 3: Print each object's slices and the original double variable
        //         in the format shown above. Why is the argument still 3.8?
        // TODO 4: Declare a Pie reference initialized to null and print it.
        //         Do not call a method or access a field on the null reference.
    }

    static class Pie {
        int slices;

        Pie() {
            // TODO 5: Set slices to 1.
        }

        Pie(int numberOfSlices) {
            // TODO 6: Set slices to the int parameter.
        }

        Pie(double numberOfSlices) {
            // TODO 7: Cast the double parameter to int and store it in slices.
            //         Then set the parameter itself to 0 to demonstrate that
            //         changing the parameter does not change the caller's variable.
        }
    }
}
