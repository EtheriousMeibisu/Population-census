import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> firstName = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> lastName = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        Collection<Person> person = new ArrayList<>();
        for (int i = 0; i < 10_000; i++) {
            person.add(new Person(firstName.get(new Random().nextInt(firstName.size())),
                    lastName.get(new Random().nextInt(lastName.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)])
            );
        }
        long count = person.stream()
                .filter(x -> x.getAge() < 18)
                .count();

        List<String> list = person.stream()
                .filter(x -> x.getAge() > 18 && x.getAge() < 27)
                .map(x -> x.getLastName())
                .collect(Collectors.toList());

        List<Person> list1 = person.stream()
                .filter(x -> x.getEducation() == Education.HIGHER)
                .filter(x -> x.getSex() == Sex.MAN && x.getAge() >= 18 && x.getAge() < 65
                        || x.getSex() == Sex.WOMAN && x.getAge() >= 18 && x.getAge() < 60 )
                .sorted(Comparator.comparing(Person::getLastName))
               .collect(Collectors.toList());
    }
}