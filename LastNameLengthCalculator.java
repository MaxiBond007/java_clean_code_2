package q2;

public class LastNameLengthCalculator implements LengthCalculator{

    @Override
    public int calculate(String name) {
        return name.length();
    }
}
