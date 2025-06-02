public abstract class First {
    public static void main(String[] args) {
        World world = new World();
//        world.start();
        Thread t1 = new Thread(world);
        t1.start();

        for(; ;){

        System.out.println("Hello");
        }
    }

}
