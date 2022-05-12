package com.company;

import java.io.*;
import java.util.*;


public interface SymptomWriter {

    void writeFile(String filepathWriting,List<String> myList,List<String> newList) throws IOException;
}
