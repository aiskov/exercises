package exercises;


import java.util.Map.Entry;

import static java.util.Arrays.stream;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FindOddSample implements FindOdd {

    @Override
    public int findIt(int... input) {
        if (input == null) throw new IllegalArgumentException("input cannot be null");

        return stream(input)
                .boxed()
                .collect(groupingBy(identity(), counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() % 2 != 0)
                .mapToInt(Entry::getKey)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Not found"));
    }
}
