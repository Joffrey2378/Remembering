package com.promet;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int array[] = {59, 3, 17, 84, 35, 42, 9, 91, 77, 1};

        for (int i = array.length - 1; i >= 0; i--){
            for (int j = 0; j < i; j++ ){
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
//            System.out.print(array[i] + " ");
        }
        Arrays.sort(array);
        for (int a = 0; a < array.length; a++) {
//        System.out.println(array[a]);
        }

        //TODO: проверить сколько объектов создает String при конкатенации
        String one = "one";
        String t = one + " two";
//        System.out.println(t + " three");

        //TODO: сделать сортировку массива по кратности числа на входе
        int[] arr = {58, 34, 81, 76, 49, 135, 23, 11, 5, 64, 9, 12};
        for (int i = 0; i <= arr.length - 1; i++) {
            double multiplicity = arr[i] % 3;
            if (multiplicity == 0) /*if (arr[i] % 3 == 0)*/{
                System.out.print(arr[i] + " ");
            }
        }

        //TODO: v сделать сортировку String удаляя спец символы
        String s ="tW_A[S]{D}F@#'$'/^";
        s = s.toLowerCase();
        String newS = s.substring(0, 1).toUpperCase() + s.substring(1);
        char[] sChar = newS.toCharArray();
        for (int i = 0; i <= sChar.length - 1; i++){
            if ((sChar[i] >= 'A' && sChar[i] <= 'z') ^ (sChar[i] > 'Z' && sChar[i] < 'a')){
//                System.out.print(sChar[i]);
            }else {
            }
        }
    }
}
