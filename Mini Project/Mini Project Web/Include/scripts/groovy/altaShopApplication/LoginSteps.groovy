package altaShopApplication
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



class LoginSteps {
	@Given("user navigated to login page")
	def nagivateToLoginPage() {
		println("I am inside nagivateToLoginPage ")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
	}

	@When("user fill (.*) and (.*)")
	def enterCredentials(String email, String password) {
		println ("\n I am inside enterCredentials")
		println("Username : "+email)
		println("Password : "+password)
		WebUI.setText(findTestObject('Auth/Login Alta/Page_frontend-web/input_Email'), email)
		WebUI.setText(findTestObject('Object Repository/Auth/Login Alta/Page_frontend-web/input_Password'), password)
	}

	@And("user click login button")
	def clickLogin() {
		println("\n I am inside clickLogin")
		WebUI.click(findTestObject('Auth/Login Alta/Page_frontend-web/button_Login'))
	}

	@Then("system verifying condition (.*) and (.*)")
	def verifyHomePage(String email, String password) {
		println("\n system verifying validation message")
		if ((email != 'tina@gmail.com') && (password != 'password')) {
			WebUI.verifyElementText(findTestObject('Object Repository/Auth/Login Alta/Page_frontend-web/div_email is required'), 'record not found')
		} else if ((email == 'tina@gmail.com') && (password != 'password')){
			WebUI.verifyElementText(findTestObject('Object Repository/Auth/Login Alta/Page_frontend-web/div_password is required'), 'email or password is invalid')
		}else if ((email == 'tina@gmail.com') && (password == 'password')) {
			WebUI.verifyElementVisible(findTestObject('Auth/Login Alta/Page_frontend-web/profil'))
		}
	}
}