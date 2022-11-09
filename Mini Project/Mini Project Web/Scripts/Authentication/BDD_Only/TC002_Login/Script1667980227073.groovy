import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')

//WebUI.callTestCase(findTestCase('Precondition/Altashop'), [:], FailureHandling.CONTINUE_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Auth/Login Alta/Page_frontend-web/input_Email'))

valueEmail = WebUI.getText(findTestObject('Auth/Login Alta/Page_frontend-web/input_Email'))

valuePassword = WebUI.getText(findTestObject('Auth/Login Alta/Page_frontend-web/input_Password'))

WebUI.click(findTestObject('Object Repository/Auth/Login Alta/Page_frontend-web/span_Login'))

if ((valueEmail == '') && (valuePassword == '')) {
    WebUI.verifyElementText(findTestObject('Object Repository/Auth/Login Alta/Page_frontend-web/div_email is required'), 
        'email is required')

    WebUI.setText(findTestObject('Auth/Login Alta/Page_frontend-web/input_Email'), 'tina@gmail.com')
} else if ((valueEmail != '  ') && (valuePassword == '')) {
    WebUI.verifyElementText(findTestObject('Object Repository/Auth/Login Alta/Page_frontend-web/div_password is required'), 
        'password is required')
}

WebUI.click(findTestObject('Object Repository/Auth/Login Alta/Page_frontend-web/div_Password'))

WebUI.setText(findTestObject('Auth/Login Alta/Page_frontend-web/input_Password'), 'abcdwe')

if (valuePassword != 'password') {
    WebUI.click(findTestObject('Object Repository/Auth/Login Alta/Page_frontend-web/button_Login'))

    WebUI.verifyElementText(findTestObject('Object Repository/Auth/Login Alta/Page_frontend-web/div_email or password is invalid'), 
        'email or password is invalid')
}

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Precondition/Altashop'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Auth/Login Alta/Page_frontend-web/input_Email'), 'desia@gmail.com')

WebUI.setText(findTestObject('null'), 'passwords')

WebUI.click(findTestObject('Auth/Login Alta/Page_frontend-web/button_Login'))

if ((valueEmail != 'desianna@gmail.com') && (valuePassword != 'password')) {
    WebUI.verifyElementText(findTestObject('Object Repository/Auth/Login Alta/Page_frontend-web/div_email or password is invalid'), 
        'record not found')
}

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Precondition/Altashop'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Auth/Login Alta/Page_frontend-web/input_Email'), 'desianna@gmail.com')

WebUI.setText(findTestObject('null'), 'password')

WebUI.click(findTestObject('Auth/Login Alta/Page_frontend-web/button_Login'))

WebUI.verifyElementVisible(findTestObject('Auth/Login Alta/Page_frontend-web/pofil'))

