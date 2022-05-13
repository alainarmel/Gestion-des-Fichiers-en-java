package com.company;

import java.io.*;
import java.util.*;

public class FileSymptomWriter implements SymptomWriter {

    public  void writeFile(String filepathWriting,TreeMap<String, Integer> cleanSymptomList) throws IOException { /** writing file from an ArrayList our aim was to write each single ArrayList element onto our new file so we decided to build a function and counting occurrences*/

        FileWriter writer = new FileWriter(filepathWriting);// creating a new empty file

        //créer un fichier de sortie à partir d'une treemap
        
        for (Map.Entry<String,Integer> entry :cleanSymptomList.entrySet()) { //parcourir la liste triée
            writer.write(entry.getKey() + "="+entry.getValue() + System.lineSeparator());// écrire chaque ligne de la liste sur le fichier : symptome = nombre d'occurrences
        }
        writer.close();       

    }
}
