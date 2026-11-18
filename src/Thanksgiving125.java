/**
 * Activity 1.2.5: Thanksgiving baking and return values.
 *
 * Store non-void return values in variables or use them in expressions.
 * Overloads must differ in their parameter lists, not just their return types.
 *
 * Expected output:
 * Pumpkin pie serves 8 guests.
 * Pumpkin pie has whipped cream.
 * Has topping: true
 * Pumpkin pie bakes for 15 minutes in the morning.
 * Pumpkin pie bakes for 90 minutes in the afternoon.
 * Pumpkin pie bakes for 105 minutes in total.
 */
public class Thanksgiving125 {
    public static void main(String[] args) {
        // TODO 1: Create a HolidayPie named "Pumpkin pie" that serves 8
        //         guests and has "whipped cream" as its topping.
        // TODO 2: Store the return values of getName() and getServings() in
        //         variables of the correct types. Print the first line above.
        // TODO 3: Use getTopping() and hasTopping() directly in print expressions.
        // TODO 4: Store the result of each bakingMinutes overload in an int.
        //         Pass 1.5 hours to the overload with a parameter.
        // TODO 5: Print the two times and their sum as shown above.
    }

    static class HolidayPie {
        String name;
        int servings;
        String topping;

        HolidayPie(String name, int servings, String topping) {
            this.name = name;
            this.servings = servings;
            this.topping = topping;
        }

        String getName() {
            return name;
        }

        int getServings() {
            return servings;
        }

        String getTopping() {
            return topping;
        }

        boolean hasTopping() {
            return !topping.isEmpty();
        }

        int bakingMinutes() {
            return 15;
        }

        int bakingMinutes(double hours) {
            // TODO 6: Replace the placeholder with hours converted to minutes.
            //         Cast the result to int before returning it.
            return 0;
        }
    }
}
