import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayProcessor {

    public List<Character> getElementDuplicated(List<Character> chars) {

        return chars.stream()
                .sorted()
                .filter(i -> Collections.frequency(chars, i) > 1)
                .distinct()
                .collect(Collectors.toList());
    }
}
