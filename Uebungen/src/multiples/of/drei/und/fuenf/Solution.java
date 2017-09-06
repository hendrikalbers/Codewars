/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiples.of.drei.und.fuenf;

/**
 *
 * @author Hendrik.Albers
 */
public class Solution {
    
    public int solution(int number) {
        
        int sumOfMultibples = 0;
        
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sumOfMultibples += i;
            }      
        }
        
        return sumOfMultibples;
    }
    
}
