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
        System.out.println(array[a]);
        }

        //TODO: сделать сортировку массива по кратности числа на входе
        //TODO: сделать сортировку String удаляя спец символы
    }
}
