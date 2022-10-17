package com.enfint.task3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FindTheMaximumElements {

    public List<BigDecimal> getThreeMaximum(List<String> input) {
        // TODO: task3
        if(input==null)
            return new ArrayList<>();

        List<BigDecimal> newArr=input.stream().filter(x->x!=null && x.trim().length()>0).map(BigDecimal::new).collect(Collectors.toList());
        List<BigDecimal> three=newArr.stream().sorted(Collections.reverseOrder()).limit(3).collect(Collectors.toList());
        return three;
    }

}
