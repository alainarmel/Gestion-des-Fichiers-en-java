package com.company;

import java.io.*;
import java.util.*;


public interface SymptomWriter {

    void writeFile(String filepathWriting,TreeMap<String, Integer> cleanSymptomList) throws IOException;
}
