package com.enfint.task4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EvenAndOddFinder {

    Map<CharacterType, Set<String>> findFromCollection(List<Set<String>> input) {
        // TODO: task4

        HashMap<CharacterType,Set<String>> holder = new HashMap<>();

        if(input==null)
        {
            holder.put(CharacterType.ODD,new HashSet<>());
            holder.put(CharacterType.EVEN,new HashSet<>());
            return holder;
        }


        Set<String> set1=input.stream().filter(Objects::nonNull).map(i->i.stream().filter(x->x!=null && x.length()>0).filter(j->j.length()%2==0).collect(Collectors.toList())).flatMap(Collection:: stream).collect(Collectors.toSet());

        Set<String> set2=input.stream().filter(Objects::nonNull).map(i->i.stream().filter(x->x!=null && x.length()>0).filter(j->j.length()%2!=0).collect(Collectors.toList())).flatMap(Collection:: stream).collect(Collectors.toSet());

        holder.put(CharacterType.ODD, set2);
        holder.put(CharacterType.EVEN, set1);

        return holder;
    }

}
