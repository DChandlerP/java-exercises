package org.launchcode.java.studios;

import java.util.ArrayList;

/**
 * Created by davidprince on 6/27/17.
 */
public class CountEvens {
    public static void main(String args[]){
        //Create an array list
        ArrayList<Integer> some_ints = new ArrayList<>();
        some_ints.add(1);
        some_ints.add(2);
        some_ints.add(3);
        some_ints.add(4);
        some_ints.add(5);
        some_ints.add(6);
        some_ints.add(7);
        some_ints.add(8);
        some_ints.add(9);
        some_ints.add(10);
        int sum = 0;
        for (int i = 0; i < some_ints.size(); i++) {
            if (i % 2 != 0) {
                sum += some_ints.get(i);
            }
        }
        System.out.printf("Sum: %s", sum);
    }
}
