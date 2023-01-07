package by.belhard;

public class IncorrectInfoException extends Exception {
    private String name;
    private int age;

    public IncorrectInfoException(String message, String name, int age) {
        super(message);
        this.name = name;
        this.age = age;
    }
     public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
