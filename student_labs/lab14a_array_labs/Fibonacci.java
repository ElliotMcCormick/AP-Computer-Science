package lab14a_array_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

public class Fibonacci {
    //instance variable
    private int [] fibArray;
    private int get;
    //constructors
    public Fibonacci(){
        
    }
    public Fibonacci(int size){
        setSize(size);
      
    }
    //set method
    public void setSize(int size){
        fibArray = new int[size]; 
    }
    public void setNumToGet(int numToGet){
        get = numToGet;
    }
    //get method
    public int getArray(){
        fibArray[0] = 1;
        
        if(fibArray.length > 1){       
            fibArray[1] = 1;
        }
        
        for (int i = 2; i < fibArray.length; i++){
            
            fibArray[i] = fibArray[i-1] + fibArray[i-2];
        }
        if (get > fibArray.length){
            return -1;
        } else {
            return fibArray[get - 1];
        }
    }
    //toString
    public String toString(){
        String output = "";
        output += getArray() + "\n";
        return output;
        
    }
}