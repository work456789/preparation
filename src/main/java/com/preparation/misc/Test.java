package com.preparation.misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Test<T> extends com.preparation.random.Test {
    int counter;
    static boolean b = false;

    public <E> Test(E e) {

    }
        //D E A C B
    public static void main(String[] args) {
        String str;

        if (b = true) { str = "true"; }

        Map<Integer, String> map = new HashMap<>();
      //  testProtected();

        map.put(10, "A");
        map.put(222, "B");
        map.put(333, "C");
        map.put(434, "D");
        map.put(5123, "E");

        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");

        List<String> stringList2 = new ArrayList<>();
        stringList.add("A2");
        stringList.add("B2");
        stringList.add("C2");

        List<List<String>> listOfLists = new ArrayList<>();
        listOfLists.add(stringList);
        listOfLists.add(stringList2);

        listOfLists.stream().forEach(System.out::println);
        Stream.of(listOfLists).forEach(System.out::println);

//        List<String> filteredList = new ArrayList<>();
//        stringList.stream().filter((s) -> s.equals("A")).map((s) ->filteredList.add(s));
//        System.out.println(filteredList.toString());
//
//        map.put(1112, "F");
//        map.put(3333, "G");
//        map.put(234324, "H");
//        map.put(345345, "I");
//        map.put(345345, "J");
//
//        map.put(989789, "K");
//        map.put(678678, "L");
//        map.put(45645645, "M");
//        map.put(567567, "N");
//        map.put(345345, "O");
       // startTest();
    }

    private static void startTest() {
        try {
            testThrowException();
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    private static <T> void test2() {
        Test<Integer> test = new Test<>("String");

    }

    private void testClone() throws CloneNotSupportedException {
        super.clone();
    }

    private static void testThrowException() throws NullPointerException {
        int i = 0;
        while(true) {
            i++;
            if (i < 3) {
                throw new NullPointerException("Exception " + i);
            } else {
                return;
            }
        }
    }

}
