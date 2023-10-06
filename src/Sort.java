import java.util.ArrayList;

public class Sort {

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static String[] bubbleSort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].toLowerCase().compareTo(array[j + 1].toLowerCase()) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size()-1-i; j++) {
                if (list.get(j) > list.get(j+1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set((j + 1), temp);
                }
            }
        }
        return list;
    }

    public static int[] selectionSort(int[] array) {
        for(int i = 0 ; i < array.length ; i ++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static String[] selectionSort(String[] array) {
        for(int i = 0 ; i < array.length ; i ++) {
            for (int j = i; j < array.length; j++) {
                if (array[i].toLowerCase().compareTo(array[j].toLowerCase()) > 0) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static ArrayList<String> selectionSort(ArrayList<String> list) {
        for(int i = 0 ; i < list.size() ; i ++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i).toLowerCase().compareTo(list.get(j).toLowerCase()) > 0) {
                    String temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

}
