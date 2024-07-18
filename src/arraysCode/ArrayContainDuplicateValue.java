//9 if an array contain duplicate values or not

package arraysCode;

import java.util.Arrays;

public class ArrayContainDuplicateValue {
	public static void main(String[] args){
	
	
	int[] numbes1= {1,2,3,4,5};//no duplicate
	int[] numbes2= {4,5,7,8,9,4};// contain duplicate
	
	if(Arrays.stream(numbes2).distinct().count()!=numbes2.length) {
		System.out.println("It contain Duplicate value");
	}else
	{
		System.out.println("It contain unique value");}

}
}
