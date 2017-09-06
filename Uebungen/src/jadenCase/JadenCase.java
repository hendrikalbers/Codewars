/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jadenCase;

/**
 *
 * @author Hendrik.Albers
 */
import java.lang.Character;

public class JadenCase {

    public String toJadenCase(String phrase) {

        if (phrase == null || phrase.equals("")) {
            return null;
        }

        char[] array = phrase.toCharArray();

        for (int x = 0; x < array.length; x++) {
            if (x == 0 || array[x - 1] == ' ') {
                array[x] = Character.toUpperCase(array[x]);
            }

        }
        return new String(array);
    }

}
