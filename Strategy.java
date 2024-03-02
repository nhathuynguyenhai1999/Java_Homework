package DesignPattern.Behavioral;
import java.util.ArrayList;
import java.util.List;
public class Strategy {
    public interface SortStrategy {
        <T> void sort (List<T> teams);
    }
    public static class QuickSort implements SortStrategy {
        @Override
        public <T> void sort(List<T> teams) {
            System.out.println("Quick sort");
        }
    }
    public static class MergeSort implements SortStrategy {
        @Override
        public <T> void sort(List<T> items) {
            System.out.println("Merge sort");
        }
    }
    public static class SelectionSort implements SortStrategy {
        @Override
        public <T> void sort(List<T> teams) {
            System.out.println("Selection sort");
        }
    }
    public static class SortedList {
        private SortStrategy strategy;
        private final List<String> items = new ArrayList<>();
        public void setSortStrategy(SortStrategy sortStrategy) {
            this.strategy = strategy;
        }
        public void add (String name){
            items.add(name);
        }
        public void sort() {
            strategy.sort(items);
        }
    }
    public static void main(String[] args) {
        SortedList sortedList = new SortedList();
        sortedList.add("Java");
        sortedList.add("PHP");
        sortedList.add("C#");
        sortedList.add("Python");
        sortedList.setSortStrategy(new QuickSort());
        sortedList.sort();
        sortedList.setSortStrategy(new MergeSort());
        sortedList.sort();
    }
}
