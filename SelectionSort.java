package James_Module2;

public class SelectionSort {
    static double[] list = {1,3,4,7,3.5,7.5,9};
    public static void selectionSort(double[] list){
        for (int i = 0; i < list.length; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;
            for (int j = 0; j < list.length; j++) {
                if(currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (double v : list) {
            System.out.println(v + "");
        }
    }
}
