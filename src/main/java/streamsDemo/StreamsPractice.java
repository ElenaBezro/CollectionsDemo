package streamsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamsPractice {
    public static List<String> generateBingoLabels() {
        List<String> bingo = Arrays.asList("B", "I", "N", "G", "O");
        Stream<String> firstPart = bingo.stream()
                .filter(e -> e.equals("B"))
                .flatMap(e -> {
                    List<String> bingo1 = new ArrayList<>();
                    for (int i = 1; i <= 15; i++) {
                        bingo1.add("B-" + i);
                    }
                    return bingo1.stream();
                });

        Stream<String> secondPart = Stream.of("B", "I", "N", "G", "O")
                .filter(e -> e.equals("I"))
                .flatMap(e -> {
                    List<String> bingo2 = new ArrayList<>();
                    for (int i = 16; i <= 30; i++) {
                        bingo2.add("I-" + i);
                    }
                    return bingo2.stream();
                });

        Stream<String> thirdPart = Arrays.stream(new String[]{"N"})
                .filter(e -> e.equals("N"))
                .flatMap(e -> {
                    List<String> bingo2 = new ArrayList<>();
                    for (int i = 31; i <= 45; i++) {
                        bingo2.add("N-" + i);
                    }
                    return bingo2.stream();
                });

        Stream<String> forthPart = bingo.stream()
                .filter(e -> e.equals("G"))
                .flatMap(e -> {
                    List<String> bingo1 = new ArrayList<>();
                    for (int i = 46; i <= 60; i++) {
                        bingo1.add("G-" + i);
                    }
                    return bingo1.stream();
                });

        Stream<String> fifthPart = bingo.stream()
                .filter(e -> e.equals("O"))
                .flatMap(e -> {
                    List<String> bingo1 = new ArrayList<>();
                    for (int i = 61; i <= 75; i++) {
                        bingo1.add("O-" + i);
                    }
                    return bingo1.stream();
                });
        Stream<String> result = Stream.concat
                (Stream.concat
                        (Stream.concat
                                (Stream.concat(firstPart, secondPart), thirdPart), forthPart), fifthPart);
        List<String> resultList = result.toList();
        resultList.stream().forEach(s -> System.out.println(s));
        return resultList;
    }


    public static void main(String[] args) {
        UnaryOperator<String> everySecondChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 0) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        generateBingoLabels();
    }
}


