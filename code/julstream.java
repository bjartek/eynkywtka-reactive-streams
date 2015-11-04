import java.util.stream.*

final Stream<Integer> s = Stream.of(1,2,3);

final Stream<String> s2 = s.map(i -> "a" + 1);

s2.iterator(); //pull

s2.forEach(i -> System.out.println(i));  //push