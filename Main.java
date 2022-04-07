package com.company;
import com.sun.jdi.connect.Connector;

import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.*;

public class Main {

    public static <String> List<String> removeDuplicates(List<String> myList) /**méthode de suppression des doublons sur la liste*/
    {

        List<String> newList = new ArrayList<String>();  // Create an empty new ArrayList

        // Traverse through the first list
        for (int index = 0; index < myList.size(); index++) {

            if (!newList.contains(myList.get(index))) {  // vérifier c'est l'index n'est pas dans la nouvelle liste si oui
                newList.add(myList.get(index));  //ajouter l'élément de l'index de la liste myListe dans la nouvelle liste (newList)
            }
        }

        return newList;  // retourner la nouvelle liste
    }


    public static <String> List<String> sortList(List<String> newList) {  /** méthode pour trier la liste par ordre croissant*/

        List<String> sortedList = newList.stream().sorted().collect(Collectors.toList());
        return sortedList;
    }


    public static void writingFile(String filepathWriting, List<String> sortedList) throws IOException { /** writing file from an ArrayList. our aim was to write each single ArrayList element onto our new file so we decided to build a function*/

     FileWriter writer = new FileWriter(filepathWriting); //créer un fichier de sortie à partir de la liste triée
        for (int index = 0; index < sortedList.size(); index++) { //parcourir la liste triée
            writer.write(sortedList.get(index) + System.lineSeparator());// écrire chaque ligne de la liste sur le fichier
        }
        writer.close();
    }


    public static void main(String[] args) throws IOException {  // drive function

        //lire le fichier puis le convertir en une liste
        List<String> myList = new ArrayList<String>(Files.readAllLines(Paths.get("C:\\Users\\Falcon\\Desktop\\Project2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt")));

        // Retirer les doublons
        List<String> newList = removeDuplicates(myList); // appel de la méthode de dédoublement

        System.out.println("ArrayList with duplicates removed:");//afficher la nouvelle liste sans doublon
        System.out.println(" ");

        for (int index = 0; index < myList.size(); index++) {// parcourir l'ancienne liste pour

            int nbreOccurrence = Collections.frequency(myList, myList.get(index));//compter les nombres d'occurrences de chaque symptome

            List<String> sortedList = sortList(newList); //appel de la méthode pour ranger les éléments par odre aphabétique (tri)

            System.out.println(sortedList.get(index) + "=" + nbreOccurrence); //afficher la liste triée

            writingFile("C:\\Users\\Falcon\\Desktop\\Project2\\result.out",sortedList);//on appelle la méthode qui permet d'écrire sur un fichier dépuis une liste

        }

    }

    }









