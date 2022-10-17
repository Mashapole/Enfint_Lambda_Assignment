package com.enfint.task1;

import java.util.ArrayList;
import java.util.List;

public class Exercise {

    public List<Integer> findDuplicates(List<Integer> integerList, int numberOfDuplicates) {
        // TODO: task1
        if(integerList==null)
        {
            return new ArrayList<>();
        }
        return  integerList.stream().distinct().filter(x->integerList.stream().filter(j->j==x && j!=null).count()==numberOfDuplicates).collect(Collectors.toList());
    }

}
