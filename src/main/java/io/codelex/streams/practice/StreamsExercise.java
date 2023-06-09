package io.codelex.streams.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.toList;

/**
 * TODO - search for StreamsExerciseTest and make all tests pass
 */
public class StreamsExercise {
    public static List<Integer> returnSquareRoot(List<Integer> numbers) {
        List<Integer> data = numbers.stream()
                .map(n -> (int) Math.sqrt(n))
                .toList();
        return data;
    }

    public static List<Integer> getAgeFromUsers(List<User> user) {
        List<Integer> data = user.stream()
                .map(User::getAge)
                .toList();
        return data;
    }

    public static List<Integer> getDistinctAges(List<User> users) {
        List<Integer> distinctAges = users.stream()
                .map(User::getAge)
                .distinct()
                .toList();
        return distinctAges;
    }

    public static List<User> getLimitedUserList(List<User> users, int limit) {
        List<User> data = users.stream()
                .limit(limit)
                .toList();
        return data;
    }

    public static Integer countUsersOlderThen25(List<User> users) {
        long count = users.stream()
                .filter(n -> n.getAge() > 25)
                .count();
        return (int) count;
    }

    public static List<String> mapToUpperCase(List<String> strings) {
        List<String> data = strings.stream().map(n -> n.toUpperCase()).toList();
        return data;
    }

    public static Integer sum(List<Integer> integers) {
        long sum = integers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        return (int) sum;
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
        List<Integer> data = integers.stream()
                .skip(toSkip)
                .toList();
        return data;
    }

    public static List<String> getFirstNames(List<String> names) {
        List<String> data = names.stream()
                .map(n -> n.split(" ")[0])
                .toList();
        return data;
    }

    public static List<String> getDistinctLetters(List<String> names) {
        List<String> data = names.stream()
                .flatMap(n -> n.chars().mapToObj(c -> String.valueOf((char) c)))
                .distinct()
                .toList();
        return data;
    }


    public static String separateNamesByComma(List<User> users) {
        String data = users.stream()
                .map(User::getName)
                .collect(Collectors.joining(", "));
        return data;
    }

    public static double getAverageAge(List<User> users) {
        double data = users.stream()
                .mapToDouble(n -> n.getAge())
                .sum() / users.size();
        return data;
    }

    public static Integer getMaxAge(List<User> users) {
        return users.stream()
                .map(User::getAge)
                .max(Integer::compareTo)
                .orElse(null);
    }

    public static Integer getMinAge(List<User> users) {
        return users.stream()
                .map(User::getAge)
                .min(Integer::compareTo)
                .orElse(null);
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
        return users.stream()
                .collect(Collectors.partitioningBy(User::isMale));
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users) {
        return users.stream()
                .collect(Collectors.groupingBy(User::getAge));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
        return users.stream()
                .collect(Collectors.groupingBy(User::isMale, Collectors.groupingBy(User::getAge)));
    }

    public static Map<Boolean, Long> countGender(List<User> users) {
        return users.stream()
                .collect(Collectors.partitioningBy(User::isMale, Collectors.counting()));
    }

    public static boolean anyMatch(List<User> users, int age) {
        return users.stream()
                .anyMatch(user -> user.getAge() == age);
    }

    public static boolean noneMatch(List<User> users, int age) {
        return users.stream()
                .anyMatch(user -> user.getAge() != age);
    }

    public static Optional<User> findAny(List<User> users, String name) {
        return users.stream()
                .filter(user -> user.getName().equals(name))
                .findAny();                                     // built-in findAny()
    }

    public static List<User> sortByAge(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .toList();
    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {
        return stream.boxed();
    }

    public static List<Integer> generateFirst10PrimeNumbers() {
        return IntStream.iterate(2, n -> n + 1)
                .filter(StreamsExercise::isPrime)
                .limit(10)
                .boxed()
                .toList();
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers() {
        Random rand = new Random();
        return rand.ints()
                .limit(10)
                .boxed()
                .toList();
    }

    public static User findOldest(List<User> users) {
        return users.stream()
                .max(Comparator.comparingInt(User::getAge))
                .orElse(null);
    }

    public static int sumAge(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge).sum();
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge)
                .summaryStatistics();
    }
}
