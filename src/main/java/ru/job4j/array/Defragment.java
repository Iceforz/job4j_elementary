package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
           for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
               int point = index;
               for (int j = point + 1; j < array.length; j++) {
                   if (array[j] != null) {
                       String temp = array[index];
                       array[index] = array[j];
                       array[j] = temp;
                       break;
              // while (point < array.length - 1) {
                 //  point++;
                 //  if (array[point] != null) {
                     //  String temp = array[index];
                      // array[index] = array[point];
                      // array[point] = temp;
                      // break;
    }
}
}
        System.out.print(array[index] + " ");
        }
        return array;
}

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
