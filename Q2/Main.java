package q2;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        LastNameLengthCalculator LastNameLengthCalculator = new LastNameLengthCalculator();
        System.out.println(LastNameLengthCalculator.calculate( "Tintin"));

        LengthCalculator firstNameCalculator = new LengthCalculator() {
            @Override
            public int calculate(String firstName) {
                return firstName.length();
            }
        };
        System.out.println(firstNameCalculator.calculate( "Maximilien"));

        LengthCalculator cityNameCalculator = (String cityName) -> {
            return cityName.length();
        };
        System.out.println(cityNameCalculator.calculate("Toronto"));

        LengthCalculator cityNameCalculator2 = (String cityName) ->cityName.length();
        LengthCalculator cityNameCalculator3 = cityName ->cityName.length();
        LengthCalculator cityNameCalculator4 = String :: length;

        List<String> student = new ArrayList<>(Arrays.asList("David","Felix"));
        student.stream().filter(name -> name.startsWith("F")).findFirst();
        Optional <String> optionalName = student
                /* parallelStream() */
                .stream()
                .filter(name -> name.startsWith("F"))
                .findFirst();
        System.out.println(optionalName);
    }
}
