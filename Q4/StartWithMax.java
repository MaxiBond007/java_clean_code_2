package Q4;

public class StartWithMax implements NameStartWith{
    @Override
    public boolean checkName(String name){
        return name.startsWith("Max");
    }
}
