package Q4;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args)
    {
        NameStartWith startWithMax = new StartWithMax();
        System.out.println( startWithMax.checkName("Max"));
        System.out.println( startWithMax.checkName("Filou"));

        NameStartWith startWithLou =  name -> name.startsWith("Lou");
        System.out.println(startWithLou.checkName(("Louise")));

        Predicate<String> startWithMat = name -> name.startsWith("Mat");
        System.out.println(startWithMat.test("Mathieu"));

        Supplier <Integer> randomNumberGenerator = () -> new Random().nextInt(101);
        System.out.println(randomNumberGenerator.get());

        System.out.println(initializeRandomList(5,randomNumberGenerator));

    }
    public static List<Integer> initializeRandomList(int length, Supplier<Integer> valueGenerator){
        List<Integer> newList = new ArrayList<>();
        for(int i=0; i <length; i++){
            newList.add(valueGenerator.get());
        }
        return newList;
    }


}

