public interface ChassisTestType {
    String test (int axleNumber, int mass);
}
class CarGasolineChassisTest implements ChassisTestType {
    String testResult;
    public String test(int axleNumber, int mass) {
        if (mass / axleNumber < 500) {
            testResult = "Car Chassis test ok ";
        } else {
            testResult = "Car Chassis test failed";
        }
        System.out.println(testResult);
        return testResult;
    }
}
    class TruckGasolineChassisTest implements ChassisTestType {
        String testResult;
        public String test(int axleNumber, int mass) {
            if (mass/axleNumber < 1200) {
                testResult = "Truck Chassis test ok ";
            } else {
                testResult = "Truck Chassis test failed";
            }
            System.out.println(testResult);
            return testResult;
        }
    }
class XlTruckDieselChassisTest implements ChassisTestType{
    String testResult;
    public String test(int axleNumber, int mass) {
        if (mass/axleNumber < 2000) {
            testResult = "Truck Chassis test ok ";
        } else {
            testResult = "Truck Chassis test failed";
        }
        System.out.println(testResult);
        return testResult;
    }
}

