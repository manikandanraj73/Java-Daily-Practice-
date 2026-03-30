import java.util.List;
import java.util.Map;
// import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
// import java.util.stream.Stream;
// import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
public class StreamPractice{
public static void main(String[] args) {
List<Integer>list=Arrays.asList(2,3,4,4,56,1,7,22);
StreamPractice.findminMaxValues(list);
}
// find the minimum and maximum value of that given list
public static void findminMaxValues(List<Integer> list){
int max=list.stream().mapToInt(n->n).max().orElse(0);
int min=list.stream().mapToInt(n->n).min().orElse(0);
System.out.println("Max value is this List : "+max );
System.out.println("Min value is this List : "+min );
}
// find the Odd or Even numbers in the List
public static void showEvenNumbers(List<Integer> list){
    System.out.println("Even Numbers");
    
    list.stream().filter(n->n%2==0).forEach(n->System.out.print(n+", "));
    System.out.println("\nOdd Numbers");
    list.stream().filter(n->n%2==1).forEach(n->System.out.print(n+", "));
}

// find the Frequency of chars
public static void findFrequencyofCharacter(){
    String str="aabbbc";
Map<Character,Long>frequency=str.chars()
    .mapToObj(c->(char)c)
    .collect(Collectors.groupingBy(c->c,
    Collectors.counting()));

    System.out.println(frequency);
}
// find the freq of nums
public static void findFrequencyofNums(List<Integer> list){
    Map<Integer,Long> freq=list.stream()
    .collect(Collectors.groupingBy(n->n,
    Collectors.counting()));
    System.out.println(freq);
}
// find the factorial program using Streams not a good but only for practice
public static void findFactorial()
{
    int a=3;
    int factorial=IntStream.rangeClosed(1, a)
    .reduce(1, (x,y)-> x*y);
    System.out.println(a+"'s "+factorial);
}
// find the second largest element in an Array
public static void findSecondLargestElement(List<Integer> list){
    int secondLarge=list.stream()
                    .distinct()
                    .sorted(Comparator.reverseOrder())
                    .skip(1)
                    .findFirst()
                    .orElse(0);
System.out.println("Second largest Element :"+secondLarge);
}
}
