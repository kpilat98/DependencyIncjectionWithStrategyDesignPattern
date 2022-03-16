public class TestCar {
    TestStrategy testCar;
    public TestCar(TestStrategy testCar){
        this.testCar=testCar;
    }

    public static void main (String[] args){
        Car fiat500 = new Car("car","gasoline",800, 24, 55,2);
        Car opelVivaro = new Car ("truck", "gasoline",2200,35,40,2);
        Car scaniaR450 = new Car ("xlTruck", "diesel", 14000,40,55,4);
        Car cyberTruck = new Car ("truck","electric",2600,40,0,2 );
        System.out.println("Fiat 500 test:");
        TestCar testFiat500 = new TestCar(new TestStrategy(new BrakesTestStrategy(new CarBrakeTest()),new EngineTestStrategy(new CarGasolineEngineTest()),new ChassisTestStrategy(new CarChassisTest())));
        testFiat500.testCar.test(fiat500);

        System.out.println("Opel Vivaro test:");
        TestCar testOpelVivaro = new TestCar(new TestStrategy(new BrakesTestStrategy(new TruckBrakeTest()),new EngineTestStrategy(new TruckGasolineEngineTest()),new ChassisTestStrategy(new TruckChassisTest())));
        testOpelVivaro.testCar.test(opelVivaro);

        System.out.println("Scania R450 test:");
        TestCar testScaniaR450 =  new TestCar(new TestStrategy(new BrakesTestStrategy(new XlTruckBrakeTest()),new EngineTestStrategy(new XlTruckDieselEngineTest()),new ChassisTestStrategy(new XlTruckChassisTest())));
        testScaniaR450.testCar.test(scaniaR450);

        System.out.println("Tesla CyberTruck test:");
        TestCar testCybertTruck = new TestCar(new TestStrategy(new BrakesTestStrategy(new TruckBrakeTest()),new EngineTestStrategy(new TruckElectricEngineTest()),new ChassisTestStrategy(new TruckElectricChassisTest())));
        testCybertTruck.testCar.test(cyberTruck);

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