public class TestStrategy {
    private BrakesTestStrategy brakesTestStrategy;
    private EngineTestStrategy engineTestStrategy;
    private ChassisTestStrategy chassisTestStrategy;
public TestStrategy (BrakesTestStrategy brakesTestStrategy, EngineTestStrategy engineTestStrategy, ChassisTestStrategy chassisTestStrategy){
    this.brakesTestStrategy=brakesTestStrategy;
    this.engineTestStrategy=engineTestStrategy;
    this.chassisTestStrategy=chassisTestStrategy;
}
public void test(Car car){
    brakesTestStrategy.test(car.brakes);
    engineTestStrategy.test(car.emission);
    chassisTestStrategy.test(car.axleNumber,car.mass);
}
}
