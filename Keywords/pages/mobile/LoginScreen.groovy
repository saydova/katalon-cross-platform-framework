package pages.mobile

import base.BaseMobilePage
import com.kms.katalon.core.testobject.TestObject

public class LoginScreen extends BaseMobilePage {

    // Locators mobile Android (SauceLabs Demo App)
    private TestObject inputUser = byXpath("//android.widget.EditText[@content-desc='username']")
    private TestObject inputPass = byXpath("//android.widget.EditText[@content-desc='password']")
    private TestObject btnSubmit = byXpath("//android.view.ViewGroup[@content-desc='login-button']")
    private TestObject titleHome = byXpath("//android.widget.TextView[@text='PRODUCTS']")

    public void login(String username, String password) {
        type(inputUser, username)
        type(inputPass, password)
        tap(btnSubmit)
    }

    public void verifySuccess() {
        verifyVisible(titleHome)
    }
}