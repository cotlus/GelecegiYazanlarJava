public class Broadleaf implements TreeController {

    @Override
    public void plant() {
        System.out.println("The broadleaf tree planted!");
    }

    @Override
    public void toWater() {
        System.out.println("The broadleaf tree watered!");
    }

    @Override
    public void prune() {
        System.out.println("The broadleaf tree has been pruned!");
    }

    @Override
    public void cut() {
        System.out.println("The broadleaf tree has been cut down!");
    }

    @Override
    public void lifeCycle() {
        plant();
        toWater();
        prune();
        cut();
    }
}
