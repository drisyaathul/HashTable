package com.bridgelabz;

public class HashTableMain {
    public static void main(String[] args) {

        String paraGraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] arrayWords = paraGraph.split(" ");      //split based on Paragraph;
        HashTable<String, Integer> hashTable = new HashTable<>(6);

        for (String word : arrayWords) {
//            System.out.println(word.hashCode());     //to find hashCode of each word;
            int index = hashTable.getIndex(word);     //to find index of each word;
            System.out.println(word + " => " +word.hashCode()+ " => " +index);
        }
    }
}
