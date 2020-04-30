import com.mrle.stream.Person;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class CommTest {

    @Test
    public void m1() {

        List<Person> lst = new ArrayList<>();

        lst.add(new Person("a", 11, 33.1));
        lst.add(new Person("a", 12, 33.2));
        lst.add(new Person("a", 12, 33.3));
        lst.add(new Person("b", 11, 34.1));
        lst.add(new Person("b", 11, 34.2));
        lst.add(new Person("b", 12, 34.3));
        lst.add(new Person("c", 11, 35.1));
        lst.add(new Person("c", 11, 35.0));
        lst.add(new Person("c", 2, 35.5));

        Map<String, Optional<Person>> rst2 = lst.stream()
                .sorted(Comparator.comparing(Person::getName)
                        .thenComparing(Person::getLeve, Comparator.reverseOrder())
                        .thenComparing(Person::getAge, Comparator.reverseOrder()))
                .collect(
                Collectors.groupingBy(Person::getName,
                        Collectors.maxBy(Comparator.comparing(o-> o.getLeve()))));

//        Map<String, Map<Integer, List<Person>>> rst = lst.stream().collect(
//                Collectors.groupingBy(Person::getName, Collectors.groupingBy(Person::getLeve)));
//        Map<String, Map<Integer, Optional<Person>>> rst3 = lst.stream().collect(
//                Collectors.groupingBy(Person::getName,
//                        Collectors.groupingBy(Person::getLeve,
//                                Collectors.maxBy(Comparator.comparingDouble(Person::getAge)))));
//
//        Map<Integer, Map<String, List<Person>>> rst4 = lst.stream().collect(
//                Collectors.groupingBy(Person::getLeve, Collectors.groupingBy(Person::getName)));
//
//        Map<Integer,
//                Map<String, Optional<Person>>> rst5 = lst.stream().collect(
//                Collectors.groupingBy(Person::getLeve,
//                        Collectors.groupingBy(Person::getName,
//                                Collectors.maxBy(Comparator.comparingDouble(Person::getAge)))));


        //System.out.println(rst);
        System.out.println(rst2);
        //System.out.println(rst3);


    }
}
