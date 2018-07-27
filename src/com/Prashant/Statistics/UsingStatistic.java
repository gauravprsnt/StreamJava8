package com.Prashant.Statistics;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class UsingStatistic {
    public static void trying() {
        List<Integer> numbers = Arrays.asList(3, 2, 4, 7, 8, 9, 5, 1);

        IntSummaryStatistics statistics = numbers.stream().mapToInt(x -> x * x).summaryStatistics();
        System.out.println(statistics);
        System.out.println("Highest no is::" + statistics.getMax());
        System.out.println("Lowest no is::" + statistics.getMin());
        System.out.println("Sum of nos is::" + statistics.getSum());
        System.out.println("Average of nos is::" + statistics.getAverage());
    }
}
