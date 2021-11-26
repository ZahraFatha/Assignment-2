/**
 * @author Aanisha Newaz
 * @author Zahra Fatha
 * @version 1.0
 */

package sorting;

public class QuickSorter extends Sorter {

    /**
     * Main accessor function used to pass a list or array.
     *
     * Function takes in a list and passes it to quickSort function,
     * along with the starting and end index. It resets operation count
     * before passing it.
     *
     *
     * @param list          double array
     */

    public void sort(double[] list){
        resetOpCount(); //reset operation count
        printQuickArray(list);

        quickSort(list, 0, list.length-1);

        //used to print sorted list
        printQuickArray(list);
    }

    /**
     * Main sorting function that takes in a list, lower bound and upper bound index to
     * pass into partition function.
     *
     * Works recursively as it carries out divide and conquer strategy.
     *
     * @param list          double array
     * @param left          left most index of the "partition"
     * @param right         right most index of the "partition"
     */
    public void quickSort(double list[], int left, int right) {
        if (left < right) {
            countOp();
            int index = partition(list, left, right);

            quickSort(list, left, index-1);
            quickSort(list, index+1, right);
        }
    }

    /**
     *Function that creates a partition on the left and right of the 'pivot'
     * as the numbers swap based on their comparison
     *
     * @param list          double array
     * @param left          left most index of the "partition"
     * @param right         right most index of the "partition"
     * @return              Returns partition index to quickSort so
     *                      it can send in the next right and left bounds
     */

    private int partition(double list[], int left, int right) {
        //count operation assignment as the last element of the partition is assigned as the pivot
        countOp();
        //the pivot will be used as a comparator so elements could be swapped based on
        // whether they're greater or smaller
        float pivot = (float)list[right];

        int i = left; //used as an increment so the index stays within the partition
        int j = (left-1); //used as an index for swapping elements
        float temp; //temp var for swapping elements

        //loop though partitioned list and compare the elements with pivot one by one
        while (i < right) {
            //if element is smaller than pivot then place the element in the index before the pivot's position
            if (list[i] <= pivot) {
                j++;

                //count assignment operation every time the elements swap
                countOp();
                temp = (float)list[j];
                countOp();
                list[j] = list[i];
                countOp();
                list[i] = temp;
            }
                i++;
        }

        //count operation assignment on every step of the element swap
        countOp();
        temp = (float)list[j+1];
        countOp();
        list[j+1] = list[right];
        countOp();
        list[right] = temp;

        return j+1;
    }

    /**
     * Print sorted function when called by iterating through the passed list
     *
     * @param list          Sorted array that's passed from Sort function
     */
    public static void printQuickArray(double list[])
    {
        for (int i = 0; i < list.length; ++i)
            System.out.print(list[i] + " ");

        System.out.println();
    }
}