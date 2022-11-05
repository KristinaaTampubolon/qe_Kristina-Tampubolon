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



class login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User click login link")
	def UserNavigatesToLoginPage() {
		Mobile.startApplication('C:\\Users\\User\\Downloads\\app-release.apk', true)

		Mobile.tap(findTestObject('Login/android.widget.Button'), 0)
	}

	@When("User input with valid (.*) email")
	def UserEnterEmail(String email) {
		Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Email'), 0)

		Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Email (1)'), email, 0)
	}

	@And("User input with valid (.*) password")
	def UserEnterPassword(String password) {
		Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Password'), 0)

		Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Password (1)'), password, 0)
	}

	@And("User click Login button")
	def ClickOnLoginButton() {
		Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button (1)'), 0)
	}

	@Then("User is Navigate to home page")
	def UserIsNavigateToHomePage() {
		Mobile.waitForElementPresent(findTestObject('Login/android.widget.Button (2)'), 0)

		Mobile.verifyElementVisible(findTestObject('Login/android.widget.Button (2)'), 0)

		Mobile.closeApplication()
	}


	@When("User input with invalid (.*) email")
	def UserInputWithInvalid(String emailinvalid) {
		Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Email'), 0)

		Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Email (1)'), emailinvalid, 0)
	}

	@And("User input with invalid (.*) password")
	def UserInputWithInvalidPassword(String invalidpassword) {
		Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Password'), 0)

		Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Password (1)'), invalidpassword, 0)
	}

	@And("User click Login buttom")
	def UserClickLoginButtom() {
		Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button (1)'), 0)
	}

	@Then("User is Navigate to dasboard page")
	def UserIsNavigateToDasboardPage() {
		Mobile.verifyElementVisible(findTestObject('invalidLogin/android.widget.Button (1)'), 0)

		Mobile.closeApplication()
	}
}