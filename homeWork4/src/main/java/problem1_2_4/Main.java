package problem1_2_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Main {

    static<T> void printElement(T forPrint, String end){
        System.out.print(forPrint+" " + end);
    }

    public static void printArray(ArrayList arrayList){
        System.out.println();
        for (Object item:arrayList) {

            System.out.print(item+" ");             // первый вариант
//            printElement(item, " \n");        // второй вариант
        }
    }


    public static void main(String[] args) {
        // задание 1
        String end = "\n";
        printElement(123, end);
        printElement(1.23, end);
        printElement("Hello", end);
        // задание 2
        ArrayList<String> listStr = new ArrayList<>(Arrays.asList("Hello", "Mister"));
        ArrayList<Integer> listInt = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        Collections.addAll(listInt, 6,7,8,9);
        ArrayList<Double> listDouble = new ArrayList<>();
        Collections.addAll(listDouble, 2.11,3.12,4.14);
        printArray(listStr);
        printArray(listInt);
        printArray(listDouble);
        System.out.println();

//        Задание 4
        // test int
        DataContainer dataContainer = new DataContainer(new ArrayList<>(List.of(3,5,2,4,11, 1)));
        dataContainer.printArray();
        dataContainer.addItem(33);
        dataContainer.printArray();
        dataContainer.mySort(dataContainer);
        dataContainer.printArray();
        System.out.println();
        // test String
        DataContainer dataContainerStr = new DataContainer(new ArrayList<>(List.of("gg","bb", "aa", "dd", "cc")));
        dataContainerStr.printArray();
        dataContainerStr.addItem("tt");
        dataContainerStr.mySort(dataContainerStr);
        dataContainerStr.printArray();
        System.out.println();
        // test Double
        DataContainer dataContainerDouble = new DataContainer(new ArrayList<>(List.of(1.21,2.58, 21.77, 12.05, 7.4)));
        dataContainerDouble.printArray();
        dataContainerDouble.addItem(6.54);
        dataContainerDouble.mySort(dataContainerDouble);
        dataContainerDouble.printArray();
        // тест для всех: удаление третьего элемента и печать
        dataContainer.removeItem(2);
        dataContainerStr.removeItem(2);
        dataContainerDouble.removeItem(2);
        dataContainer.printArray();
        dataContainerStr.printArray();
        dataContainerDouble.printArray();
    }

}


