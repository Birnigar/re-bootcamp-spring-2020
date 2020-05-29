package src.day6_collection_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Set {
    public static void main(String[] args) {

        sortMethod("DC501GCCCA098911");

    }
    /**
     * Create a method that will take any String of
     * letters and numbers and sort each substring of numbers and
     * lettersEx:Input:"DC501GCCCA098911"OutPut: "CD015ACCCG011899"
     */
    public static void sortMethod(String str){

        List<String> list=new ArrayList<>(Arrays.asList(str.split("")));
        TreeSet<String> sorted=new TreeSet<>(list);

        System.out.println(sorted);

    }

}
