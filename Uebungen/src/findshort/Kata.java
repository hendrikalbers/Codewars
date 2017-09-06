/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findshort;

import java.util.stream.Stream;

/**
 *
 * @author Hendrik.Albers
 */
public class Kata {

  public static int findShort(String s){
      return Stream.of(s.split(" "))
              .mapToInt(String::length)
              .min()
              .getAsInt();
  }
}
