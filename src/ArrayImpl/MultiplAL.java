package ArrayImpl;

import java.util.ArrayList;

public class MultiplAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialize it for size 3
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
    }
}
