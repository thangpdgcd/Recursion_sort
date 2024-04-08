package day3;

import java.util.Arrays;

public class Bubblesort_day3 {

    public void bubbleSort(int[] array) {
        for (int i = 0; i < array.length -1; i++) {
            int minIndex = i;
            for (int j = 0; j < array.length - i -1; j++) {
                if (array[j] < array[minIndex + 1]) {
                    minIndex = j;
                }
            }
            // swap
            int temp = array[minIndex+1];
            array[minIndex+1] = array[i];
            array[i] = temp;
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
