import com.codoid.products.exception.FilloException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Hashtable;

public class ExcelToDataProvider {
    @Test(dataProvider = "dp")
    public void consoleCheck(Hashtable<String, String> data) throws FilloException {
        System.out.println("-------------------------------------------------");
        System.out.println("Name: " + data.get("NAME"));
        System.out.println("Email: " + data.get("EMAIL"));
        System.out.println("Pass: " + data.get("PASS"));
        System.out.println("-------------------------------------------------");

    }
    @DataProvider
    public Object[][] dp() throws FilloException {
        ReadExcel reader = new ReadExcel(1);
        return reader.getExcelData();
    }
}
