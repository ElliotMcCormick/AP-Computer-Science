package s14_arrays;

// A+ Computer Science
// www.apluscompsci.com

//array delete example

import static java.lang.System.*;

public class ArrayDelete
{
	/*
	 * countIt should return a count that
	 * states how many times val exists
	 * in the array iRay
	 */
	public static int countIt( int[] iRay, int val )
	{
		int count = 0;
		for(int item : iRay)
		{
			if( item == val )
			{
				count = count + 1;
			}
		}
		return count;
	}

	public static int[] removeIt( int[] iRay, int val )
	{
            int[] output = new int[iRay.length - countIt(iRay, val)];
            int outputIndex = 0;
            for (int i = 0; i < iRay.length; i++){
                if (iRay[i] != val){
                    output[outputIndex] = iRay[i];
                    outputIndex += 1;
                }
            }
            return output;
	}

	public static void printIt( int[] iRay  )
	{
		for(int item : iRay)
		{
			out.print(item + " ");
		}
	}

	public static void main(String[] args)
	{
		int[] nums = {7,7,1,7,8,7,4,3,7, 9,8};

		printIt( nums );
		System.out.println("\ncount of 7s == " + countIt( nums, 7 ));
		nums = removeIt( nums, 7 );
		printIt( nums );
		System.out.println("\ncount of 7s == " + countIt( nums, 7 ));
	}
}