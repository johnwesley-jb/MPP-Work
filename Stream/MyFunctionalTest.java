package A;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MyFunctionalTest {



    public static void main(String[] args) {

        String tab[]={"Job", "Jean","Dave","Bendy", "Regine","Sammuel","Georges"};

        Optional<String> first= Arrays.stream(tab).findFirst();
        first.ifPresent(System.out::println);

        Optional<String> any= Arrays.stream(tab)
                .filter(el->el.contains("e")&& el.startsWith("G"))
                .findAny();
                any.ifPresent(System.out::println);

        Optional<String> orElse= Arrays.stream(tab)
                .filter(el->el.contains("e")&& el.startsWith("X"))
                .findAny();
        System.out.println(orElse.orElse("Xavier"));
    }
}
