package com.practice.arrays;

import java.util.*;

/**
 * created by Praful Jha on 18/02/2018
 */
public class SortedArrayOnBasedOfFrequency {

    public static void main(String[] args) {
        int a[] = {5,4,3,2,1,0,5,3,2,4,1,2,3,5};

        System.out.println("Before Sorting");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] +" ");
        }

        sortByFreq(a);

        System.out.println("\nAfter Sorting");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] +" ");
        }
    }

    private static void sortByFreq(int[] a) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i <a.length; i++) {
           if(map.containsKey(a[i]))  {

               map.put(a[i],map.get(a[i])+1);
           }
           else {
               map.put(a[i],1);
           }
        }

        List list = new LinkedList(map.entrySet());

        Collections.sort(list, new Comparator<Object>() {

            @Override
            public int compare(Object o1, Object o2) {
                Map.Entry entry1 = (Map.Entry) o1;
                Map.Entry entry2 = (Map.Entry) o2;
                int val1 = (int)  entry1.getValue();
                int val2 = (int)  entry2.getValue();

                if(val1 == val2)
                {
                    return ((int) entry1.getKey()-(int) entry2.getKey())<0?1:-1;
                }
                else {
                    return  (val1-val2)<0?-1:1;
                }
            }
        });
        int count = 0;
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            for(int i=0; i< (int) entry.getValue(); i++) {
               a[count++] = (int) entry.getKey();
            }
        }
    }
}
