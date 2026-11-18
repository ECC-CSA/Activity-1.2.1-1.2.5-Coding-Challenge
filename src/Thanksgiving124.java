/**
 * Activity 1.2.4: Preparing a Thanksgiving table with parameterized methods.
 *
 * Method arguments must match the number, order, and types of the parameters.
 * Overloaded methods share a name but have different parameter lists.
 *
 * Expected output:
 * Family table has pumpkin pie.
 * Family table has 2 pumpkin pie(s) for 8 guest(s).
 * Family table has 8 guest(s).
 * Family table is decorated.
 * Family table is decorated with a cornucopia.
 * Family table has 3 red and 6 orange napkin(s).
 * Family table is set.
 * Family table is ready for dinner!
 * Family table has 4 chairs in the dining room.
 */
public class Thanksgiving124 {
    public static void main(String[] args) {
        // TODO 1: Create a DinnerTable named "Family table".
        // TODO 2: Call both provided serve overloads with "pumpkin pie",
        //         2 pies, and 8 guests as appropriate. Match the parameter order.
        // TODO 3: After implementing serve(int) below, call it with 8 guests.
        // TODO 4: Call both decorate overloads, using "cornucopia".
        // TODO 5: Declare int variables for 3 red and 6 orange napkins and
        //         pass them to setNapkins. The method receives copies of their values.
        // TODO 6: Call setTable(), announceDinner(), and
        //         addChairs(4, "the dining room"), in that order.
    }

    static class DinnerTable {
        String name;

        DinnerTable(String name) {
            this.name = name;
        }

        void serve(String food) {
            System.out.println(name + " has " + food + ".");
        }

        void serve(String food, int amount, int guests) {
            System.out.println(name + " has " + amount + " " + food
                    + "(s) for " + guests + " guest(s).");
        }

        // TODO 7: Add an overloaded void serve(int guests) method that prints
        //         the number of guests as shown above. The food parameter in
        //         the other serve methods is not in scope here.

        void decorate() {
            System.out.println(name + " is decorated.");
        }

        void decorate(String decoration) {
            System.out.println(name + " is decorated with a " + decoration + ".");
        }

        void setNapkins(int red, int orange) {
            System.out.println(name + " has " + red + " red and "
                    + orange + " orange napkin(s).");
        }

        void setTable() {
            System.out.println(name + " is set.");
        }

        void announceDinner() {
            System.out.println(name + " is ready for dinner!");
        }

        void addChairs(int chairs, String room) {
            System.out.println(name + " has " + chairs + " chairs in " + room + ".");
        }
    }
}
