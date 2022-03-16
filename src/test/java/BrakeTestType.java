public interface BrakeTestType {
    String test (int brakes);
}
 class CarBrakeTest implements BrakeTestType{
    String testResult;
    public String test(int brakes){
        if (brakes > 25){
            testResult ="Car brakes test ok";
        }else {
            testResult="Car brakes test failed";
        }
        System.out.println(testResult);
        return testResult;
    }
}
class TruckBrakeTest implements BrakeTestType{
    String testResult;
    public  String test (int brakes){
        if (brakes>30){
            testResult="Truck brakes test ok";
        }else{
            testResult="Truck brakes test failed";
        }
        System.out.println(testResult);
        return testResult;
    }
}
class XlTruckBrakeTest implements BrakeTestType{
    String testResult;
    public  String test (int brakes){
        if (brakes>35){
            testResult="XL Truck brakes test ok";
        }else{
            testResult="XL Truck brakes test failed";
        }
        System.out.println(testResult);
        return testResult;
    }
}
