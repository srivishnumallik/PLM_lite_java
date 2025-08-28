public class LifecycleManager {
    public static void advanceStage(Product product) {
        if (product.advanceStage()) {
            System.out.println("Product " + product.getId() + " advanced to stage: " + product.getStage());
        } else {
            System.out.println("Product " + product.getId() + " is already at final stage: " + product.getStage());
        }
    }
}