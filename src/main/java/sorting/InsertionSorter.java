/**
 * @author Aanisha Newaz
 * @author Zahra Fatha
 * @version 1.0
 */

package sorting;

public class InsertionSorter extends Sorter {

    /**
     * Main sorting function that sorts by insertion
     * Function takes in a list and starts from the first index element and iterates through the list.
     *          As it passes through the list, the elements before the current index are sorted as
     *          they are compared with the current index.
     *
     * @param list          double array
     */
    public void sort(double[] list){
        resetOpCount(); //reset assignment operation count to 0
        printInsertionArray(list);
        double pivot; //will be used as a "key" to be compared to and be placed in sorted array
        int current; //will be used to loop through sorted part of list to set pivot

        //loop through all indexes to set each element as pivot to sort the left part of the list
        for (int i = 1; i < list.length; ++i) {

            //count assignment operation of pivot
            countOp();
            //initialize pivot as a current element
            pivot = list[i];

            //initialize current index which will be used to compare elements with the pivot
            current = i-1;

            //loop through "sorted" part of the array from the pivot to 0 index until the element is smaller than pivot
            while (current >= 0 && list[current] > pivot) {
                //count assignment operation of list changing order of elements
                countOp();
                //initialize the element after the current index as the current element
                list[current+1] = list[current];

                //change of index as it reaches 0
                current = current - 1;

            }


            //count assignment operation as the next element is initialized as the pivot
            countOp();
            // once the index j reaches 0 or an element smaller than pivot is found,
            //      let the next element be initialized as the pivot
            list[current+1] = pivot;
        }

        printInsertionArray(list); //used to print array
    }

    /**
     * Print sorted function when called by iterating through the passed list
     *
     * @param list          Sorted array that's passed from Sort function
     */

    public static void printInsertionArray(double list[])
    {
        for (int i = 0; i < list.length; ++i)
            System.out.print(list[i] + " ");

        System.out.println();
    }
}
