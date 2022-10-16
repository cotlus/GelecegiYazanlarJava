public class Conifer implements TreeController {

    @Override
    public void plant() {
        System.out.println("The coniferous tree planted!");
    }

    @Override
    public void toWater() {
        System.out.println("The coniferous tree watered!");
    }

    @Override
    public void prune() {
        System.out.println("The coniferous tree has been pruned!");
    }

    @Override
    public void cut() {
        System.out.println("The coniferous tree has been cut down!");
    }

    @Override
    public void lifeCycle() {
        plant();
        toWater();
        prune();
        cut();
    }
}
