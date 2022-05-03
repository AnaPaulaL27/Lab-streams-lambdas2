package org.example.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MVP {

    /*
        Convert a List<String> to an object stream and for each element -> System,out.println.
     */
//      List<String> names1 = List.of("Linda", "Bob", "Ed");
    public void printNames(List<String> names) {
        names.forEach(name -> System.out.println(name));

    }

    //__________________________________________________________________________________________________________________

    /*
        Given a List<Integers>, return a List<Integer> with even numbers.
     */
    public List<Integer> returnEvenNumbers(List<Integer> numbers) {

   numbers=

      numbers.stream()
                        .filter((Integer number)-> number % 2 == 0)

                                  .toList();

        return numbers;
    }

    //__________________________________________________________________________________________________________________

    /*
        Given an int [], double the value of each int and return an int [].
    */
    public int[] doubleInts(int[] numbers) {

        Arrays.stream(numbers).map(number->number*2).toArray();

        //let's store this inside a variable 'doubling' so then we can return it more simply

        int[] doubling= Arrays.stream(numbers).map(n->n*2).toArray();


        return doubling;


    }


    //__________________________________________________________________________________________________________________
    /*
        Given a String, return a List<String>, all caps.
     */
    public List<String> splitToAllCapsList(String input) {


        //'asList' returns a list view of the array

        // store the split string in the  'toCapital' variable

        List<String> toCapital = Arrays.asList(input.split(""));

        toCapital= toCapital
                .stream().map(c -> c.toUpperCase()).toList();


        return  toCapital;
    }


    //__________________________________________________________________________________________________________________

    /*
    Given a list of animals:
     - filter the ones that start with a given letter
     - return sorted List<String>, all caps.
    */
    public List<String> filterByFirstLetterAndOrder(List<String> list, String letter) {
        // Take list of animals

        list = list

                .stream()                                   // stream to get access to richer methods
                .filter(l -> l.startsWith(letter))          // filter letters that start with a given letter
                .map(el -> el.toUpperCase())                  // convert string elements to uppercase
                .sorted()                                   // sort the elements
                .toList();                                  // once everything is done, convert back toList


        return list;
    }




    //__________________________________________________________________________________________________________________


    /*
        Given a list of words, return elements that:
         - are shorter than the given number and
         - start with a given letter.
    */
    public List<String> filterWords(List<String> words, int maxLength, String firstLetter) {

        words = words
                .stream()
                .filter(Words-> Words.length() < maxLength)
                .filter(Words->Words.startsWith(firstLetter))
                .toList();
        return words;


    }

    //Tests passed: 19 of 19 tests
}