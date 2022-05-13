package com.company;

import java.util.*;


public interface SymptomCounter {

    TreeMap<String, Integer> count(List<String> symptomList);
}
