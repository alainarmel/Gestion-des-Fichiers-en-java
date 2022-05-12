package com.company;

import java.util.*;


public class FileSymptomCounter implements SymptomCounter {

    public List<String>  count(List<String> symptomList) {

        List<String> cleanList = new ArrayList<>();

         List<String> sortedList = symptomList.stream().sorted().toList(); //ranger les éléments de la liste par ordre croissant

        // Traverse through the first list
        for (int index = 0; index < sortedList.size(); index++) {

            if (!cleanList.contains(sortedList.get(index))) {  // vérifier c'est l'index n'est pas dans la nouvelle liste si oui
                cleanList.add(sortedList.get(index));  //ajouter l'élément de l'index de la liste myListe dans la nouvelle liste (newList)
            }
        }
        return cleanList;
    }

}

