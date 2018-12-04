package s18_advoop;

// A+ Computer Science
// www.apluscompsci.com

//OOP example

import static java.lang.System.*;

public class Triangle
{
   private int sideA, sideB, sideC;

   public Triangle()
   {
      setSides(0,0,0);
   }

   public Triangle(int a, int b, int c)
   {
      //complete method Triangle(int,int,int)
       setSides(a,b,c);


   }

   public void setSides(int a, int b, int c)
   {
		//complete method setSides
       sideA = a;
       sideB = b;
       sideC = c;


   }

   public void setSideA(int a)
   {
   	sideA=a;
   }
   public void setSideB(int b)
   {
   	sideB=b;
   }
   public void setSideC(int c)
   {
   	sideC=c;
   }

   //add set methods for b and c









   public int getSideA()
   {
   	return sideA;
   }
   public int getSideB()
   {
   	return sideB;
   }
   public int getSideC()
   {
   	return sideC;
   }
  
   //add get methods for b and c









   public String toString()
   {
   	return sideA + " " + sideB + " " + sideC;
   }
}