package br.com.vinicius.hackerrank.findingTheRunningMedian;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    private static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // keeps track of the SMALL numbers
    private static  PriorityQueue<Integer> minHeap = new PriorityQueue<>();                           // keeps track of the LARGE numbers

    /*
     * Complete the runningMedian function below.
     */
    static double[] runningMedian(int[] a) {
        double[] result = new double[a.length];

        for (int i = 0; i < a.length; i++) {
            addNumber(a[i]);
            double median = getMedian();
            System.out.println(median);
            result[i] = median;
        }

        return result;

//        List<Integer> runningList = new ArrayList<>();
//        double[] result = new double[a.length - 1];
//
//        for(int i = 0; i < a.length -1; i++){
//            runningList.add(a[i+1]);
//
//            IntStream intStream = runningList.stream().mapToInt(Integer::intValue).sorted();
//
//            if(runningList.size() % 2 != 0){
//                // Impar
//                result[i] = Double.valueOf(intStream.skip(runningList.size()/2).findFirst().getAsInt());
//            } else {
//                // Par
//                result[i] = intStream.skip(runningList.size()/2-1).limit(2).average().getAsDouble();
//            }
//        }
//
//        return result;
    }

    private static void addNumber(int n) {
        if (maxHeap.isEmpty()) {
            maxHeap.add(n);
        } else if (maxHeap.size() == minHeap.size()) {
            if (n < minHeap.peek()) {
                maxHeap.add(n);
            } else {
                minHeap.add(n);
                maxHeap.add(minHeap.remove());
            }
        } else if (maxHeap.size() > minHeap.size()) {
            if (n > maxHeap.peek()) {
                minHeap.add(n);
            } else {
                maxHeap.add(n);
                minHeap.add(maxHeap.remove());
            }
        }
        // maxHeap will never have fewer elements than minHeap
    }

    private static double getMedian() {
        if (maxHeap.isEmpty()) {
            return 0;
        } else if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else { // maxHeap must have more elements than minHeap
            return maxHeap.peek();
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        runningMedian(new int[]{10,
                1,
                2,
                3,
                4,
                5,
                6,
                7,
                8,
                9,
                10});
    }
}