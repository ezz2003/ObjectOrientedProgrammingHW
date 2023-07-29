package problem1_2_4;

import java.util.*;

public class DataContainer<T> implements Comparator<T>{
    public ArrayList<T> container;
    ReverseComparator comparator;
    ISort<ArrayList<T>, ReverseComparator>sorting;

    public DataContainer(ArrayList<T> container) {
        this.container = container;
        this.comparator = new ReverseComparator();
        this.sorting = (a, c)-> Collections.sort(a, c);
    }

    public <T extends Comparable<T>> void mySort(DataContainer<T> container) {
        Collections.sort(this.container, this.comparator);
    }

    public void addItem(T item){
        this.container.add(this.container.size(), item);
    }

    public void removeItem(int position){
        this.container.remove(position);
    }

    public void printArray() {
        System.out.println();

        for (Object item : this.container) {
            System.out.print(item + " ");
        }
    }

    @Override
    public int compare(T o1, T o2) {
        return 0;
    }


}