/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperArray;

import java.util.Arrays;

/**
 *
 * @author mccormick.elliot19
 */
public class SuperArray{
    //Instance Variables
    private Object[] array;
    
    //Constructor Methods
    public SuperArray(){
        array = new Object[0];
    }
    
    public SuperArray(Object[] arr){
        this.array = arr;            
    }
    
    //Remove Values from Array
    public Object[] removeValueAtIndex(Object index){
        Object[] output = new Object[array.length - 1];
        int indexOfOutput = 0;
        
        for(int i = 0; i < array.length; i++){
            if (!index.equals(i)){
                output[indexOfOutput] = array[i];
                indexOfOutput++;
            }
        }
        
        array = output;
        return output;
    }
    
    //Add Values to Array
    public Object[] addValue(Object value){
        return addValue(array.length, value);
    }
    
    public Object[] addValue(int index, Object value){
        Object[] output = new Object[array.length + 1];
        int indexOfInputArray = 0;
        
        for(int i = 0; i < output.length; i++){
            if (i == index){
                output[i] = value;
                
            } else {
                output[i] = array[indexOfInputArray];
                indexOfInputArray++;
            }
        }
        
        array = output;
        return output;       
    }
    
    //toString
    public String toString(){
        String output = "";
        output += Arrays.toString(array);
        return output;
    }
}
