public class DivideNConquer {
    // Merge sort code ->
    // public static void printArr(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // System.out.println();
    // }

    // public static void mergeSort(int arr[], int si, int ei) {
    // //base case
    // if (si >= ei) {
    // return;
    // }
    // // kaam
    // int mid = si + (ei - si) / 2; // (si + ei) / 2
    // mergeSort(arr, si, mid); // left part
    // mergeSort(arr, mid + 1, ei); // right part
    // merge(arr, si, mid, ei);
    // }

    // //merge method to merge sorted parts
    // public static void merge(int arr[], int si, int mid, int ei) {
    // int temp[] = new int[ei - si + 1];
    // int i = si;// iteratr for left part
    // int j = mid + 1; // iterator for right part
    // int k = 0; // iterator for temp arr

    // while (i <= mid && j <= ei) {
    // if (arr[i] < arr[j]) {
    // temp[k] = arr[i];
    // i++;
    // } else {
    // temp[k] = arr[j];
    // j++;
    // }
    // k++;
    // }

    // // left part
    // while (i <= mid) {
    // temp[k++] = arr[i++];
    // }

    // // right part
    // while (j <= ei) {
    // temp[k++] = arr[j++];
    // }

    // // copy temp to original arr
    // for (k = 0, i = si; k < temp.length; k++, i++) {
    // arr[i] = temp[k];
    // }
    // }

    // Quick sort code ->
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        // base class
        if (si >= ei) {
            return;
        }
        // last element
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1); // left part
        quickSort(arr, pIdx + 1, ei); // right part
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make place for elements smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        // int arr[] = { 6, 3, 9, 5, 2, 8 };
        // mergeSort(arr, 0, arr.length - 1);
        // printArr(arr);
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
