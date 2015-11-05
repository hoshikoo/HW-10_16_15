package com.company;

import java.util.Stack;


import static com.company.MajorityElement.majorityElement;

public class Main {

    public static void main(String[] args) {
        String string = "(([])))";
        //String string = "((([]))";
        //String string = "([{}])";
        //String string = "(){}";
        //String string = "{[}]";
        //String string = ")(";

        System.out.println(CharacterOrder.character(string));


        int [] array = {3,3,4,2,4,4,2,4,4};

        System.out.println(MajorityElement.majorityElement(array));
    }


}
