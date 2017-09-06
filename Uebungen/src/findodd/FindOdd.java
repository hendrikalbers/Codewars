/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findodd;

import java.util.Iterator;

/**
 *
 * @author Hendrik.Albers
 */
public class FindOdd {

    public static int findIt(int arr[]) {
        int count = 0;
        int i;

        for (i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }
        }

        if (count % 2 != 0) {
            return arr[i];
        } else {
            return -1;
        }

    }

}
