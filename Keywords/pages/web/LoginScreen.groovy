package pages.web

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import base.BaseWebPage
import internal.GlobalVariable

public class LoginScreen extends BaseWebPage {

    private TestObject headerLogin = byXpath("//h5[text()='Login']")
    private TestObject inputUser   = byXpath("//input[@name='username']")
    private TestObject inputPass   = byXpath("//input[@name='password']")
    private TestObject btnSubmit   = byXpath("//button[@type='submit']")
    private TestObject titleHome   = byXpath("//h6[text()='Dashboard']")

    public void verifyOnPage() {
        verifyVisible(headerLogin)
    }

    public void login(String username, String password) {
        type(inputUser, username)
        type(inputPass, password)
        click(btnSubmit)
    }

    public void verifySuccess() {
        verifyVisible(titleHome)
    }
}
