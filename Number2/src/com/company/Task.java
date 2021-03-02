package com.company;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Task {
    private String[] firstNames = {"Samuel", "Jack", "Joseph", "Amanda", "Anna", "Vladimir", "Oleg", "Andrew", "Jerry", "James", "John", "Thomas", "Charlie", "Oscar", "George", "Joshua", "Noah", "Connor", "Justin"};
    private String[] lastNames = {"Adamson", "Smith", "Allford", "Albertson", "Damnson", "Backer", "Baldwin", "Barnes", "Becker", "Bush", "Brown", "Brooks", "Fraser", "Fulton", "Francis", "Foster", "Gate", "Hodges", "Gustman"};

    private List<Human> setList(int size) {
        List<Human> result = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < size; i++) {
            LocalDate date = LocalDate.of(random.nextInt(30) + 1970, random.nextInt(12) + 1, random.nextInt(27) + 1);
            result.add(new Human(random.nextInt(99), firstNames[random.nextInt(firstNames.length)], lastNames[random.nextInt(lastNames.length)], date, random.nextInt(100) + 20));
        }
        return result;
    }

    public void getList(int size) {
        List<Human> array = setList(size);
        Stream<Human> stream1 = array.stream();
        Stream<Human> stream2 = array.stream();
        Stream<Human> stream3 = array.stream();
        Stream<Human> stream4 = array.stream();

        System.out.println("Список до применения методов stream: ");
        array.forEach(System.out::println);

        System.out.println("\nСписок после применения методов stream:");

        //Task 1
        System.out.println("Вывод первых пяти элементов: ");
        stream1.map(o -> o.toString()).limit(5).forEach(System.out::println);

        //Task 2
        System.out.println("\nСортировка по дате рождения ASC: ");
        stream2.map(o -> o.getBirthDate()).sorted().forEach(System.out::println);

        //Task 3
        System.out.println("\nФильтрация по весу < 60: ");
        stream3.filter(o -> o.getWeight() < 60).forEach(System.out::println);

        //Task 4
        System.out.println("\nВывод всех имен и фамилий: ");
        stream4.map(o -> o.getFirstName() + ' ' + o.getLastName()).forEach(System.out::println);
    }
}
