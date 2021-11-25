import org.testng.annotations.DataProvider;

public class DataProviderTask3 {
    @DataProvider(name = "task3")
    public static Object[][] dpRegister() {
        return new Object[][]{
                {Long.toHexString(Double.doubleToLongBits(Math.random()))},
        };
    }
}
