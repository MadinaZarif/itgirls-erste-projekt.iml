public class Programmer {
        String name;
        int age;
        static int count = 0;
        //
    public Programmer (String name, int age) {
        this.name = name;
        this.age = age;

    }
    public String write(String writeType){
        return "пишет: " + writeType;
    }
    public String drink(String drinkType) {
        return "пьет: " + drinkType;
    }
    }
