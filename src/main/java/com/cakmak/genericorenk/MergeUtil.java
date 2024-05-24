package com.cakmak.genericorenk;

import java.util.LinkedList;
import java.util.List;

public class MergeUtil {
     public static <E>  List<E> mergeList(List<E> arr1, List<E> arr2){
        List<E> list = new LinkedList<>();

        list.addAll(arr1);
        list.addAll(arr2);

        return list;
    }
}
