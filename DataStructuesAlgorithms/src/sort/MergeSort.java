package sort;

public class MergeSort {

    /*
     * find the length of the array if it contains more than one element find the mid of the array.
     * create a left and right half of the array
     * Call the method recursively on both right and left half of the array
     * Now after dividing the array till you only have only one element left in each array merge them
     * */

    public static void sort(int[] ar) {
        int len = ar.length;
        if (len > 1) {
            int mid = len / 2;
            int[] left = new int[mid];
            int[] right = new int[len - mid];

            for(int i = 0; i < mid; i++) {
                left[i] = ar[i];
            }
            for(int i = mid; i < len; i++) {
                right[i -mid] = ar[i];
            }


            sort(left);
            sort(right);
            merge(ar, left, right);
        }
    }

    /*
     * merge the left and right halves of the array into a single array
     * */
    public static void merge(int arr[], int left[], int right[]) {
        int ll = left.length;
        int rl = right.length;
        int i = 0, j = 0, k = 0;
        while (k < ll && j < rl) {
            if (left[k] >= right[j]) {
                arr[i++] = left[k++];
            } else {
                arr[i++] = right[j++];
            }
        }
        while (k < ll) {
            arr[i++] = left[k++];
        }
        while (j < rl) {
            arr[i++] = right[j++];
        }
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}


