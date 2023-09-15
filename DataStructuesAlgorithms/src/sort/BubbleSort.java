package sort;

public class BubbleSort {

    public static void sortIncreasing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void display(int[]arr){
    for(int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
    }

}
