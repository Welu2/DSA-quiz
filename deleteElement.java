package package6;

public class deleteElement {
    public static void main(String[] args) {
    int[] array = {3, 7, 1, 9, 4};
    int index =2;
    delete_element(array,index);
}
    static int delete_element(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                newArray[j++] = array[i];
            }
            if (index < 0 || index == array.length) {
                System.out.println("Invalid index");

            }
        }
    }
