package com.practice.arrays;

import java.util.Arrays;

/**
 * created by Praful Jha on 04/03/2018
 */
public class Segregate012 {


    private  synchronized  int e;
    public static void main(String[] args) {

        String s = null;
        String s2= 'null';
        int ab = 5;
        int cd = ab;
        ab*=2;
        cd+=1;
        int x = 100;
        double y = 100.1;
        boolean z = (x=y);

        System.out.println(ab+"  ... "+cd);
        StringBuilder sb = new StringBuilder("upwork");
        sb.insert(6,"-");
        sb.insert(0,"-");
        sb.insert(4,"-");
        System.out.println(sb);

        int arr[] = {1,2,0,0,2,2,1,1,1,0,2};

        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid<high) {

            switch (arr[mid]) {
                case 0 :
                    int temp = arr[low];
                    arr[low++] = arr[mid];
                    arr[mid++] = temp;
                    break;
                case 1 :
                  mid++;
                    break;
                case 2 :
                     temp = arr[high];
                     arr[high] = arr[mid];
                     arr[mid] = temp;
                     high--;
                     break;
             }
        }
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}
