package ru.itservice.testTask.component.builder;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * Компонент задачи про лексиграфический порядок строк:
 * Given two arrays of strings a1 and a2 return a sorted
 * array r in lexicographical order of the strings of a1 which are substrings of strings of a2.
 */
@Component
public class LexicographicalOrderResultBuilder {


    private TreeSet<String> treeMap = new TreeSet<>();

    /**
     * @param container массив в строках которого содержиться часть строк content массива
     * @param content   массив являющийся строки которого являются частью container массива
     * @return если есть совпадения строк из content массива в массиве container, то возвращается
     * content массив отсортированный по лексиграфическому порядку
     */
    public TreeSet<String> getLexicographicalOrderFromContent(String[] container, String[] content) {
        treeMap.clear();
        for (String containerValues : container) {
            Arrays.stream(content).filter(containerValues::contains).forEach(treeMap::add);
        }

        return treeMap;
    }


}


