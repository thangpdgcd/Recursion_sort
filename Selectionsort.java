package day3;

import java.util.Arrays;

public class Selectionsort {
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // swap
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

    }
}
class sortrunner
{
    public  static  void main(String[] args)
    {
        int[] arr ={6,7,10,2,5,4,9};
        Selectionsort sorter =new Selectionsort();
        //start
        long startTime =System.nanoTime(); //set time out;
        sorter.sort(arr);


        //end
        long endTime= System.nanoTime();
        long elapsedTime=endTime-startTime;
        System.out.println("Sort Array " + Arrays.toString(arr));
        System.out.println("Time out " + elapsedTime);
    }
}
