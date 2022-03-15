public class BrakesTestStrategy {
    private BrakeTestType type;
    public BrakesTestStrategy(BrakeTestType type){
        this.type=type;
    }
    public void test (int brakes){
        type.test(brakes);

    }
}
