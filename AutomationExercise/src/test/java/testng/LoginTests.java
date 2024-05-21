package testng;

import org.automationexercise.LoginPage;
import org.automationexercise.DashBoard;
import org.testng.annotations.Test;
import testng.BaseTest;

import static org.testng.Assert.assertEquals;

public class LoginTests extends BaseTest
{
    @Test

    public void testSuccessfulLogin()
    {
        LoginPage loginPage = landingPage.clickLoginLinkText();
        loginPage.setEmailField("qat@mailinator.com");
        loginPage.setPasswordField("123456");
        DashBoard dashBoard = loginPage.clickLoginButton();
        assertEquals(dashBoard.getLoggedInUserName(),
                "Logged in as trtrytuyuiui",
                "Not logged in as trtrytuyuiui");

    }

}
