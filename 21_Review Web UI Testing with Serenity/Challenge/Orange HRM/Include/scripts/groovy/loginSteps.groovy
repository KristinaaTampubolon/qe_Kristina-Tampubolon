import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class loginSteps {

	@Given ("User navigates to login page")
	def navigateToLoginPage() {
		println("\n I am inside navigate to login page")
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

		WebUI.maximizeWindow()

		WebUI.verifyElementPresent(findTestObject('login/img'), 0)
	}

	@When ("User enters (.*) and (.*)")
	def enterCredentials(String username, String password) {
		println("\n I am inside enterCredentials")
		println("UserName : "+username)
		println("Password : "+password)
		WebUI.setText(findTestObject('Object Repository/login/input_Username_username'), username)

		WebUI.setEncryptedText(findTestObject('Object Repository/login/input_Password_password'), password)
	}
	@And ("Click on login button")
	def clickLogin() {
		println("\n I am inside clickLogin")
		WebUI.click(findTestObject('Object Repository/login/button_Login'))
	}


	@Then ("User is navigated to homepage")
	def verifyHomePage() {
		println("\n I am inside home page")
		WebUI.verifyElementPresent(findTestObject('login/span_PIM'), 0)

		WebUI.closeBrowser()
	}
}