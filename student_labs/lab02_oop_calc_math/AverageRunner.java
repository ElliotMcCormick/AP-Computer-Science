package lab02_oop_calc_math;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class AverageRunner {

    public static void main(String[] args) {
        Average test = new Average();
        
        test.setNums(5, 5);
        test.average();
        test.print();
        
        test.setNums(90, 100.0);
        test.average();
        test.print();
        
        test.setNums(100, 85.8);
        test.average();
        test.print();
        
        test.setNums(-100, 55);
        test.average();
        test.print();
        
        test.setNums(15236, 5642);
        test.average();
        test.print();
        
        test.setNums(1000, 555);
        test.average();
        test.print();
    
        //add more test cases
    }
}