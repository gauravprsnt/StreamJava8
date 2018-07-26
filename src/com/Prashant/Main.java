package com.Prashant;

import com.Prashant.Filter.UsingFilter;
import com.Prashant.Limit.UsingLimit;
import com.Prashant.Map.UsingMap;
import com.Prashant.Sort.UsingSort;
import com.Prashant.UsingStreamDifferently.UsingStreamDifferently;
import com.Prashant.forEach.UsingForEach;

public class Main {

    public static void main(String[] args) {
	// write your code here
        UsingForEach usingForEach=new UsingForEach();

        UsingLimit usingLimit=new UsingLimit();

        UsingSort usingSort=new UsingSort();

        UsingFilter usingFilter=new UsingFilter();

        UsingMap usingMap=new UsingMap();

        System.out.println("Using ForEach");
        usingForEach.trying();

        System.out.println("Using Limit");
        usingLimit.trying();

        System.out.println("Using Sorted");
        usingSort.trying();

        System.out.println("Using Filter");
        usingFilter.trying();

        System.out.println("Using Map");
        usingMap.trying();


        UsingStreamDifferently.trying();
    }
}
