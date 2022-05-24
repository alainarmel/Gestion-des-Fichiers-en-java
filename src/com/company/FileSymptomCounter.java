package com.company;

import java.util.*;


public class FileSymptomCounter implements SymptomCounter {

    public TreeMap<String, Integer> count(List<String> symptomList) {

        TreeMap<String,Integer> cleanSymptomList=new TreeMap<>();

        // Traverse through the list for adding elements into the map . What we must know here is that treemap doesn't allow replicate things.
        for (int index = 0; index < symptomList.size(); index++) {
            int nbreOccurrence = Collections.frequency(symptomList, symptomList.get(index));
            cleanSymptomList.put(symptomList.get(index),nbreOccurrence);
        }
        return cleanSymptomList;

    }

}

