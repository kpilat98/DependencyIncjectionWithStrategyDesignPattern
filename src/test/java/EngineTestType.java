public interface EngineTestType {
    String test (float emission);
}

class CarGasolineEngineTest implements EngineTestType{
    String testResult;
    public String test(float emission){
        if (emission < 26){
            testResult ="Car emission test ok";
        }else {
            testResult="Car emission test failed";
        }
        System.out.println(testResult);
        return testResult;
    }
}
class TruckGasolineEngineTest implements EngineTestType{
    String testResult;
    public  String test (float emission){
        if (emission<38){
            testResult="Truck emission test ok";
        }else{
            testResult="Truck emission test failed";
        }
        System.out.println(testResult);
        return testResult;
    }
}
class XlTruckDieselEngineTest implements EngineTestType{
    String testResult;
    public  String test (float emission) {
        if (emission < 50) {
            testResult = "XL Truck emission test ok";
        } else {
            testResult = "XL Truck emission test failed";
        }
        System.out.println(testResult);
        return testResult;
    }
}
class TruckElectricEngineTest implements EngineTestType{
    String testResult;
    public String test (float emission){
        if (emission == 0){
            testResult = "Electric Truck emission test ok";
        }else{
            testResult ="Electric Truck emission test failed";
        }
        System.out.println(testResult);
        return testResult;
    }
}
