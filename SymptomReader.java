package com.company;

import java.io.*;
import java.util.*;
import java.nio.file.*;

    public class SymptomReader implements ReadSymptomFromFile{

        public  List<String> readSymptom (String filepath)throws IOException{ /**lecture des symptomes d'un fichier texte et les mettre dans une liste*/

            List <String> myList =  Files.readAllLines(Paths.get(filepath));
            return myList;
        }
    }

