package package4;

import java.util.Arrays;

public class bubbleSort {
    void bubblesort(String[] alphabet) {
        for(int i = bubble.length - 1; i >= 0; i--) {
            for(int j = 0; j < i; j++) {
//do swap adjacent files after comparison
                if(int(alphabet[j]) > int(alphabet[j + 1])) {
                    int temp = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = temp;
    }

    public static void main(String[] args) {
         String alphabet = {'j', 'l', 'a', 'f', 'p'};
        bubbleSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(Arrays.toString(arr));
    }
}

}
