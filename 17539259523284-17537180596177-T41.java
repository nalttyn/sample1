package testc;

public class T41 {
    public static void main(String[] args) {
        int[] array1 = {19, 46, 4, 20, 18, 30};
        printMinIndex(array1);
        System.out.println(average(array1));

        int[] array2 = {99, 88, 77, 66, 55};
        printMinIndex(array2);
        System.out.println(average(array2));
    }

    static void printMinIndex(int[] x) {
	// print the index of element with minimum value
        int min = x[0];
        int min_index =0;
        for (int i=0; i<x.length; i++) {            
            if(x[i] < min) {
                min = x[i];
                min_index=i;
            }
            
        }  
        System.out.println(min_index);
    }
    static double average(int[] x) {
	// return the average of integers in the array x. 
        double average = 0;
        for (int i=0; i<x.length; i++) {
            average += x[i];
        }
        average /= x.length;
        return average;
    }   
}
