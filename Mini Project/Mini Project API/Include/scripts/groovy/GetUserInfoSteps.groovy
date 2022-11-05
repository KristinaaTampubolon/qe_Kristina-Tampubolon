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



class GetUserInfoSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	//	Get User info valid
	@Given("Get call to url user info")
	def getUserInfo() {
		println ("\n I inside Get call user info")
		statusCode = WS.sendRequest(findTestObject('Postman (1)/Authentication/Get user information', [('BASE_URL') : GlobalVariable.BASE_URL]))

	}

	@Then("response url user info is 200")
	def responseUserInfo() {
		println("\n I inside response code 200")
		WS.verifyResponseStatusCode(statusCode, 200)
	}

	//	Get user info dengan method post
	@Given("Post call to url get user info")
	def postUserinfo() {
		println ("\n I inside post call user info")
		statusCode = WS.sendRequest(findTestObject('Postman (1)/Authentication/Post_Get user information'))

	}

	@Then("response url post userinfo is 405")
	def responsePostUserInfo() {
		println("\n I inside response code 405")
		WS.verifyResponseStatusCode(statusCode, 405)
	}

	//	Get user info dengan method put
	@Given ("Put call to url get user info")
	def putUserInfo() {
		println("\n I inside put call user info")
		statusCode = WS.sendRequest(findTestObject('Postman (1)/Authentication/Put_Get user information'))
	}

	@Then ("response url put info is 405")
	def responsePutUserInfo() {
		println ("\n I inside put call user info")
		WS.verifyResponseStatusCode(statusCode, 405)
	}

	//	Get user info dengan method Delete
	@Given ("Delete call to url get user info")
	def deleteUserInfo() {
		println("\n I inside put call user info")
		statusCode = WS.sendRequest(findTestObject('Postman (1)/Authentication/Delete_Get user information'))

	}

	@Then ("response url Delete user info is 405")
	def responseDeleteUserInfo() {
		println("\n I inside response code 405")
		WS.verifyResponseStatusCode(statusCode, 405)
	}

}