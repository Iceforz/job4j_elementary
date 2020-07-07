package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < data.length; i++) {
                if (data[i - 1] > data[i]) {
                    int tmp = data[i];
                    data[i] = data[i - 1];
                    data[i - 1] = tmp;
                    isSorted = false;
                }
            }
        }
            return data;
        }
    }
        //for (int i = 0; i < data.length; i++) {
          //  int min = MinDiapason.findMin(data, 0, data.length);
           // int index = FindLoop.indexOf(data, min, 0, data.length);
          //  if (data[i] < data[index - 1]) {
              //  int temp = data[i];
             //   data[i] = data[index - 1];
             //   data[index - 1] = temp;
    //    }
      //  }
     //   return data;
   // }
//}




