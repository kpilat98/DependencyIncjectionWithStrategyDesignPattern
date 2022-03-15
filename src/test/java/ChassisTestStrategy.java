public class ChassisTestStrategy {
    private ChassisTestType type;

    public ChassisTestStrategy(ChassisTestType type) {
        this.type = type;
    }

    public void test(int axleNumber, int mass) {
        type.test(axleNumber,mass);
    }
}