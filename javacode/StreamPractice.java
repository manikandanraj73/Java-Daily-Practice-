import java.text.Collator;
import java.util.Arrays;
import java.util.List;
// import java.util.Optional;
// import java.util.function.Function;
// import java.util.function.Predicate;
// import java.util.stream.Stream;

public class StreamPractice{
public static void main(String[] args) {
  List<Integer>list=Arrays.asList(1,10,30,15,2,9);
 int res=list.stream()
 .filter(n->n%2==0)

  .reduce(0,(n,a)->n+a);
  
  System.out.println(res);
}
}
