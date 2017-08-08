package javaBasic;

public class GetMean {
	public int getMean(int[] array) {
    int sum = 0;
		for(int j=0;j<array.length;j++)
            sum = sum + array[j];
     
    return sum/array.length;
	}
}