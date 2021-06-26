/**
 * @Anirudha
 * @since 26Jun2021
 * Generics
 */


package com.aniruddha.max;

public class MaxFinder {
    public static Integer findMax(Integer number1, Integer number2, Integer number3) {
        Integer max= number1;
        if (max < number2){
            max=number2;
        }
        if(max < number3){
            max=number3;

        }
        return max;

    }



}
