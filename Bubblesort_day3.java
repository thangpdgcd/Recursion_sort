package day3;

import java.util.Arrays;

public class Bubblesort_day3 {
    public void bubbleSort(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            for (int j = 1; j < array.length ; j++) {
                if (array[j] < array[j - 1]) {
                    // swap
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
class runnerbuble{
    public static void main (String[] args)
    {
        int [] arr ={10,24,5,6,2,9,11,21};
        Bubblesort_day3 bubblesortDay3=new Bubblesort_day3();

        //start
        long startTime =System.nanoTime(); //set time out;
        bubblesortDay3.bubbleSort(arr);

        long endTime= System.nanoTime();
        long elapsedTime=endTime-startTime;
        System.out.println("Bubble  Sort Array " + Arrays.toString(arr));
        System.out.println("Time out " + elapsedTime);
    }
}
