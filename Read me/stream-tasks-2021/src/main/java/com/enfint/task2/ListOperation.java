package com.enfint.task2;


import java.util.List;

public class ListOperation {

    public int integerSum(List<String> input) {
        // TODO: task2

        int sumInts =0;
        String extract = String.valueOf(input);

        if(extract.matches(".*\\d.*"))
        {
            String newStr = extract.replaceAll("[^-0-9]+", " ");
            List<String> strList = Arrays.asList(newStr.trim().split(" "));
            List<Integer> list = strList.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
            sumInts = list.stream().mapToInt(Integer::intValue).sum();
        }
        else
        {
            sumInts=0;
        }

        return sumInts;
    }

}
