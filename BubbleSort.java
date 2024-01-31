package James_Module2;

public class BubbleSort {
    static int[] list = {1,4,5,6,7,11,23,34};
    public static void bubbleSort(int[] list){
        boolean needNextpass = true;
        for (int i = 0; i < list.length; i++) {
            if(list[i] > list[i + 1]){
                int temp = list[i];
                list[i] = list[i + 1];
                list[i + 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int j : list) {
            System.out.println(j + " ");
        }
    }
}
