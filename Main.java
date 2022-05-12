package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {  // drive function

        List<String> symptomList;
        List<String> cleanList;

        // polymorhisme appliqué à toutes les instances des classes qui implémentent chacune une interface

            SymptomReader reader = new FileSymptomReader();
            SymptomWriter writer = new FileSymptomWriter();
            SymptomCounter counter = new FileSymptomCounter();


            //appel des différentes méthodes avec les variables des instances des classes créees en utilisant les interfaces pour en faire usage du polymorphisme et mettre en exergue l'abstraction

            symptomList=reader.readSymptom("C:\\Users\\Falcon\\Desktop\\Project2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt");
            cleanList=counter.count(symptomList);
            writer.writeFile("C:\\Users\\Falcon\\projet\\result.out",symptomList,cleanList);

        System.out.println(" The end of the project 2");

    }
}








