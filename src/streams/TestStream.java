package streams;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

enum Code {
    CODE_ONE,
    CODE_TWO
}

public class TestStream {



    public static String [] names = {new String("Tes"), new String("Test23333"), new String("Test355555"), new String("Test")};

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        List<List<Integer>> listOfList = new LinkedList<>();
        listOfList.add(list);
        listOfList.add(list2);
        //Stream.of(list).flatMap((x)->Stream.of(x)).forEach((x)->System.out.println(x));

//        Stream.of(list).forEach(System.out::println);
//        System.out.println("***********");
//        list.stream().forEach(System.out::println);

        listOfList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());

    }
}
