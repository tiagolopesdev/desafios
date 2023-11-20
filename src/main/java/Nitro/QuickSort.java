package Nitro;

import java.util.Arrays;
import java.util.stream.IntStream;

public class QuickSort {

    public static int[] QuickSort(int[] elements) {
        if (elements.length < 2) {
            return elements;
        } else {
            int[] pivo = {elements[0]};

            int[] smallerElements = Arrays.stream(elements)
                    .skip(1)
                    .filter(item -> item <= pivo[0])
                    .toArray();
            int[] largerElements = Arrays.stream(elements)
                    .skip(1)
                    .filter(item -> item > pivo[0])
                    .toArray();

            IntStream concat = IntStream.concat(
                    IntStream.concat(Arrays.stream(QuickSort(smallerElements)), Arrays.stream(pivo)),
                    Arrays.stream(QuickSort(largerElements))
            );
            return concat.toArray();
        }
    }

    public static void main(String[] args) {

//        int[] elements = new int[]{33, 15, 10};
        int[] elements = new int[]{23, 5, 3, 12, 32, 4, 8, 76, 1, 7, 6};

        IntStream result = Arrays.stream(QuickSort(elements));

        result.forEach(item -> System.out.println(item));
    }
}
