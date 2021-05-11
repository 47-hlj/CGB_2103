package HLJ.day0324;

import java.util.Arrays;

public class ToString {
    public static void main(String[] args) {
        int [] arr=new int[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = i + 1;
        }
        int[] arr1=Arrays.copyOf(arr,12);
        System.out.println(Arrays.toString(arr1));
    }
}
