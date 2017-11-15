package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

enum Code {
    CODE_ONE,
    CODE_TWO
}

public class TestStream {



    public static String [] names = {new String("Tes"), new String("Test23333"), new String("Test355555"), new String("Test")};

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<List<Integer>> listOfLists = new LinkedList<>();
        listOfLists.add(list);
        listOfLists.add(list2);

//        Stream.of(listOfLists)
//                .flatMap(l->l.stream())
//                .flatMap(l->l.stream())
//                .forEach(System.out::println);


        System.out.println(listOfLists.stream().flatMap(l -> l.stream()).collect(Collectors.toList()).toString());

//        System.out.println("************");
//        listOfLists.stream().flatMap(Stream::of).forEach(System.out::println);
//        Stream<List<Integer>> listStream = listOfLists.stream().flatMap(Stream::of);
//        System.out.println(Stream.of(list).count());
//        System.out.println("************");
//        System.out.println(list.stream().count());
//        Stream.of(list).forEach(System.out::println);
//        System.out.println("***********");
//        list.stream().forEach(System.out::println);

//        listOfList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());


//        List<Nature> nature = new LinkedList<>();
//        List<Human> humans = new LinkedList<>();
//        nature = humans;
//        nature.add(new Animal());
//        Human human = humans.get(0);

        List<Number> listOfObjects = new ArrayList<>();
        listOfObjects.add(1l);

        List<List<? super GrandChild>> l = new ArrayList<>();
        List<Parent> p = new ArrayList<>();
        List<Child> c = new ArrayList<>();
        l.add(p);
        l.add(c);
        //l.stream().flatMap(Stream::of).count();
        flatMap(l);
    }

    class A {
        B field;
        class B {
            String field;
        }
    }

    void foo(A a) {

        if (a != null && a.field != null); // print b

        Optional.ofNullable(a).flatMap(obj -> Optional.of(obj.field));

    }


    static <T,R> Stream<R> flatMap(List<List<? super T>> mapper) {
        return null;
    }

    private static class Parent {}
    private static class Child extends Parent {}
    private static class GrandChild extends Child {}

}
