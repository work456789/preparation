package streams;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {
    public static StringBuilder [] names = {new StringBuilder("Test1"), new StringBuilder("Test2"), new StringBuilder("Test3"), new StringBuilder("Test4")};

    public static void main(String[] args) {
       // List<StringBuilder> reversedNames = Arrays.stream(names).map(name -> name.reverse()).collect(Collectors.toList());
        List<StringBuilder> filtered = Arrays.stream(names).filter(name -> name.length() > 4).collect(Collectors.toList());
        filtered.forEach(name -> System.out.println(name));


        LinkedList<String> arrayList = new LinkedList<>();
    }
}
