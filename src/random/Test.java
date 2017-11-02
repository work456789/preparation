package random;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        testHashMap();
    }

    static void change(String text) {
        text = "STRING AFTER CHANGE";
    }

    static void testHashMap() {
        String testString = "BEFORE CHANGE";
        Map<Integer, String> testMap = new HashMap<>();
        testMap.put(1, testString);
        testString = "AFTER CHANGE";
        System.out.println(testMap.get(1));
    }

    static void testArrays() {
        Integer a = 5;
        String g = "TEST";
        Integer[] arrInt = new Integer[]{1, 2, 3, a};
        Integer[] arrInt2 = new Integer[]{1, 2, 3, a};
        String[] arrString = new String[]{"test1", "test2", g};
        TestObject[] arrTestObjects = new TestObject[1];
        TestObject testObject = new TestObject();
        testObject.testField = "Test One";
        arrTestObjects[0] = testObject;
        testObject.testField = "Test Two";

        Stream.of(arrTestObjects).forEach(o -> System.out.println(o.toString()));

        String beforeChange = "TEST STRING BEFORE CHANGE";
        change(beforeChange);
        System.out.println(beforeChange);
    }

    protected static void testProtected() {
        System.out.println("Test protected");
    }
}
