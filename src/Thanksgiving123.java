/**
 * Activity 1.2.3: Decorating after Thanksgiving.
 *
 * Use the HolidayTree class through its documented methods. Each tree has its
 * own state. Void methods perform an action; they cannot be printed or assigned
 * to a variable.
 *
 * Expected output:
 * Tree: 2 ornament(s), no lights
 * Tree: 3 ornament(s), with lights
 * Tree: 1 ornament(s), no lights
 */
public class Thanksgiving123 {
    public static void main(String[] args) {
        // TODO 1: Create a tree with the no-argument constructor, call
        //         twoOrnaments(), and call show().
        // TODO 2: Create a separate tree, call threeOrnaments() and addLights(),
        //         then call show(). Add lights BEFORE displaying the tree.
        // TODO 3: Call oneOrnament() on the first tree and display it again.
        //         Notice that the second tree's lights did not affect it.
        // TODO 4: Initialize a HolidayTree reference to null, then replace null
        //         with a new HolidayTree before calling any methods on it.
    }

    static class HolidayTree {
        int ornaments = 1;
        boolean lights = false;

        void oneOrnament() {
            ornaments = 1;
        }

        void twoOrnaments() {
            ornaments = 2;
        }

        void threeOrnaments() {
            ornaments = 3;
        }

        void addLights() {
            lights = true;
        }

        void show() {
            System.out.println("Tree: " + ornaments + " ornament(s), "
                    + (lights ? "with lights" : "no lights"));
        }
    }
}
