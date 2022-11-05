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



class RegisterSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given ("I set endpoint register")
	defsetEndpoint() {
		statusCode = WS.sendRequest(findTestObject('Postman (1)/Authentication/Register', [('BASE_URL') : GlobalVariable.BASE_URL]))
	}

	@When("I set body parameter fullname email and password")
	defsetParameter() {
		println("\n Set the body parameter")
	}

	@Then("response valid data register")
	def responseValidRegister() {
		statusCode = WS.sendRequest(findTestObject('Postman (1)/Authentication/Register', [('BASE_URL') : GlobalVariable.BASE_URL]))
	}
	@Given("I set endpoint register empty data")
	def setBodyRegisterEmpty() {
		statusCode = WS.sendRequest(findTestObject('Postman (1)/Authentication/Register - Empty data'))
	}
	@Given("I set endpoint register with registered email")
	def setBodyRegisteredEmail() {
		statusCode = WS.sendRequest(findTestObject('Postman (1)/Authentication/Register', [('BASE_URL') : GlobalVariable.BASE_URL]))
	}
	@Then("response invalid data register")
	def responseInvalidRegister() {
		WS.verifyResponseStatusCode(statusCode, 400)
	}
}