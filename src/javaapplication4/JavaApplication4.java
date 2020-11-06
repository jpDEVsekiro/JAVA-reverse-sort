/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Arrays;

/**
 *
 * @author Hermione
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int[] array={346,1,2,3,89,456,12};
        int count=1;
        while(count>0){
            count=0;
        for(int j=0;j<array.length-1;j++){
            if(array[j]<array[j+1]){
                int save=array[j];
                array[j]=array[j+1];
                array[j+1]=save;
                count++;
            }
        }}
        System.out.println(Arrays.toString(array));
    }    
    
        
    
}
