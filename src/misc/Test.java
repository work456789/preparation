package misc;

import java.util.ArrayList;
import java.util.List;

public class Test {
    int counter;

    public Test() {

    }

    public static void main(String[] args) {
        String s = "test";
        List<String> list = new ArrayList<>();
        list.add(s);
        list.add(s);
        System.out.println(list.toString());
    }
}
