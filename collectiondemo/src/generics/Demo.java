package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<Integer> alist = new ArrayList<>();
        alist.add(566);
        alist.add(5678);
        alist.add(987);
        alist.add(1788);
        alist.add(1234);
        alist.add(976);
        alist.add(1466);
        alist.add(5222);
        Function<Integer,String> function=e->Integer.toString(e);
       List<String> list= alist.stream()
                .map(function)
                .filter(e->e.length()>=4)
               .collect(Collectors.toList());


    }
}
