public class Product {
    private String id;
    private String name;
    private String stage;

    private static final String[] STAGES = {"Concept", "Design", "Development", "Testing", "Release"};
    private int stageIndex = 0;

    public Product(String id, String name) {
        this.id = id;
        this.name = name;
        this.stage = STAGES[stageIndex];
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getStage() { return stage; }

    public boolean advanceStage() {
        if (stageIndex < STAGES.length - 1) {
            stageIndex++;
            stage = STAGES[stageIndex];
            return true;
        }
        return false;
    }
}
