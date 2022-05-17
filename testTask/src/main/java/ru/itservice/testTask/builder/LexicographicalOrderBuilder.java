package ru.itservice.testTask.builder;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.TreeSet;

@Component
public class LexicographicalOrderBuilder {

    public TreeSet<String> getLexicographicalOrderFromContent(String [] container, String [] content){
        TreeSet<String> treeMap = new TreeSet<>();
        for (String containerValues : container) {
            Arrays.stream(content).filter(containerValues::contains).forEach(treeMap::add);
        }
        return treeMap;
    }
}


