public class Lion {
    private String name;
    private LionType type;

    public Lion(String name, LionType type) {
        this.name = name;
        this.type = type;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public String getDetails() {
        return "Lion name: " + name + ", type: " + type;
    }
}