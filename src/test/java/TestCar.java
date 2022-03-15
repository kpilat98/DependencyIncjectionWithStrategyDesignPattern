public class TestCar {
    TestStrategy testCar;
    public TestCar(TestStrategy testCar){
        this.testCar=testCar;
    }

    public static void main (String[] args){
        Car fiat500 = new Car("car","gasoline",800, 24, 55,2);
        Car opelVivaro = new Car ("truck", "gasoline",2200,35,40,2);
        Car scaniaR450 = new Car ("xlTruck", "diesel", 14000,40,55,4);
        TestCar testFiat500 = new TestCar(new TestStrategy(new BrakesTestStrategy(new CarGasolineBrakeTest()),new EngineTestStrategy(new CarGasolineEngineTest()),new ChassisTestStrategy(new CarGasolineChassisTest())));
        testFiat500.testCar.test(fiat500);

        TestCar testOpelVivaro = new TestCar(new TestStrategy(new BrakesTestStrategy(new TruckGasolineBrakeTest()),new EngineTestStrategy(new TruckGasolineEngineTest()),new ChassisTestStrategy(new TruckGasolineChassisTest())));
        testOpelVivaro.testCar.test(opelVivaro);

        TestCar testScaniaR450 =  new TestCar(new TestStrategy(new BrakesTestStrategy(new XlTruckDiselBrakeTest()),new EngineTestStrategy(new XlTruckDieselEngineTest()),new ChassisTestStrategy(new XlTruckDieselChassisTest())));
        testScaniaR450.testCar.test(scaniaR450);



    }

}
//    BrakesTestStrategy testBrakes;
//    EngineTestStrategy tesEngine;
//    public TestCar(BrakesTestStrategy testBrakes, EngineTestStrategy testEngine) {
//        this.testBrakes=testBrakes;
//        this.tesEngine=testEngine;
//    }

//        TestCar testFiat = new TestCar(new BrakesTestStrategy(new CarGasolineBrakeTest()),new EngineTestStrategy(new CarGasolineEngineTest()));
//        testFiat.tesEngine.test(fiat500.emission);
//        testFiat.testBrakes.test(fiat500.brakes);
//        BrakesTestStrategy opelBrakesTestStrategy = new BrakesTestStrategy(new TruckGasolineBrakeTest());
//        opelBrakesTestStrategy.test(opelVivaro.brakes);