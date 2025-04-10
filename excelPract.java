package Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class excelPract {
    
    // Corrected the return type of getData() method to Object[][]
    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[3][2]; // 3 rows, 2 columns
        data[0][0] = "valid username";
        data[0][1] = "valid pass";
        data[1][0] = "valid username";
        data[1][1] = "invalid pass";
        data[2][0] = "invalid username";
        data[2][1] = "valid pass";
        return data;
    }

    // Correctly applying the @Test annotation with the dataProvider attribute
    @Test(dataProvider = "getData")
    public void testFetch(String username, String pass) {
        System.out.println("Username: " + username);
        System.out.println("Password: " + pass);
        System.out.println("2nd person clone the files and changed the code");
        System.out.println("2nd person clone the files and changed the code");
        System.out.println("2nd person clone the files and changed the code");
        System.out.println("2nd person clone the files and changed the code");
        System.out.println("2nd person clone the files and changed the code");
    }
}
