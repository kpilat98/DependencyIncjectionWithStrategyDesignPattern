public interface ChassisTestType {
    String test (int axleNumber, int mass);
}
class CarChassisTest implements ChassisTestType {
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
    class TruckChassisTest implements ChassisTestType {
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
    class TruckElectricChassisTest implements ChassisTestType{
        String testResult;
        public String test(int axleNumber, int mass) {
            if (mass/axleNumber < 1400) {
                testResult = "Electric truck Chassis test ok ";
            } else {
                testResult = "Electric truck Chassis test failed";
            }
            System.out.println(testResult);
            return testResult;
        }
    }

class XlTruckChassisTest implements ChassisTestType{
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

