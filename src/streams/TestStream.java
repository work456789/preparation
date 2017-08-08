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
        Deque<String> deque = new LinkedList<>();
//        String s = deque.pop();

        List<String> filtered = new ArrayList<>();
        filtered.addAll(Arrays.asList(names));

        Stream.of(filtered).filter(name -> name.size() > 4).collect(Collectors.toList());

        filtered.forEach(name -> System.out.println(name));
    }
}
