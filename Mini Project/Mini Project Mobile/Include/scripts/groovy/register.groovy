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



class register {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigates to register page")
	def userClickRegister() {
		Mobile.startApplication('C:\\Users\\User\\Downloads\\app-release.apk', true)

		Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button'), 0)

		Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button (1)'), 0)
	}

	@When("User input valid (.*) fullname")
	def UserInputValidFullname(String fullname) {
		Mobile.tap(findTestObject('Object Repository/Register/android.widget.EditText - Alex Under, Fullname'), 0)

		Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Alex Under, Fullname (1)'), fullname, 0)
	}

	@And("User input email (.*)")
	def UserInputValidEmail(String email) {
		Mobile.tap(findTestObject('Object Repository/Register/android.widget.EditText - alexemail.com, Email'), 0)

		Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - alexemail.com, Email (1)'), email, 0)
	}

	@And("User enter password (.*)")
	def UserInputValidPassword(String password) {
		Mobile.tap(findTestObject('Object Repository/Register/android.widget.EditText - 123123123, Password'), 0)

		Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - 123123123, Password (1)'), password, 0)
	}

	@Then("Click on Login button and navigate to dasb page")
	def userClickRegisterButton() {
		Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button (2)'), 0)

		Mobile.verifyElementVisible(findTestObject('Register/android.widget.Button (2)'), 0)

		Mobile.closeApplication()
	}


	@When("User enter valid (.*) fullname")
	def UserEnterValidFullname(String fullname) {
		Mobile.tap(findTestObject('Object Repository/Register/android.widget.EditText - Alex Under, Fullname'), 0)

		Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Alex Under, Fullname (1)'), fullname, 0)
	}

	@And("User enter invalid email (.*)")
	def UserNotEnterEmail(String email) {
		Mobile.tap(findTestObject('Object Repository/Register/android.widget.EditText - alexemail.com, Email'), 0)

		Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - alexemail.com, Email (1)'), '()', 0)
	}

	@And("User input password (.*)")
	def UserInputPassword(String password) {
		Mobile.tap(findTestObject('Object Repository/Register/android.widget.EditText - 123123123, Password'), 0)

		Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - 123123123, Password (1)'), password, 0)
	}

	@Then("Click Login button and navigate to dasb page")
	def ClickLoginButtonAndNavigate() {
		Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button (2)'), 0)

		Mobile.verifyElementVisible(findTestObject('Register/android.widget.Button (2)'), 0)

		Mobile.closeApplication()
	}
}