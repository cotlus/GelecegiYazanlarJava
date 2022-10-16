public class Main {
    public static void main(String[] args) {
        TreeController coniferControl = new Conifer();
        TreeController broadleafControl = new Broadleaf();

        // for conifer
        coniferControl.lifeCycle();

        System.out.println("---------------");

        // for broadleaf
        broadleafControl.lifeCycle();
    }
}
