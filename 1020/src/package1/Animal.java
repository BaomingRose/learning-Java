package package1;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void eat(String food) {
        System.out.println(name + "正在吃" + food);
    }
}
