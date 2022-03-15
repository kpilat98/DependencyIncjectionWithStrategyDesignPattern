public class EngineTestStrategy {
    private EngineTestType type;

    public EngineTestStrategy(EngineTestType type) {
        this.type = type;
    }

    public void test(float emission) {
        type.test(emission);
    }
}