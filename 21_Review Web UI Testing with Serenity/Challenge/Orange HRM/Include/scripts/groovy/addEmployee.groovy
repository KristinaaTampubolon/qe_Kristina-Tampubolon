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



class addEmployee {
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
	}

	@When ("User click on  add button")
	def clickAdd() {
		println("\n I am inside clickAdd")
		WebUI.click(findTestObject('Object Repository/Employee/Page_OrangeHRM/button_Add'))
	}

	@Then ("User can view add employee page")
	def verifyEmployeePage() {
		println("\n I am inside employee page")
		WebUI.verifyElementPresent(findTestObject('Employee/Page_OrangeHRM/div_Add EmployeeAccepts jpg, .png, .gif up _928ffb'),
				0)
	}

	@When ("User enters (.*) and (.*)")
	def enterData(String firstname, String lastname) {
		println("\n I am inside enterData")
		println("firstname : "+firstname)
		println("lastname  : "+lastname)
		WebUI.setText(findTestObject('Object Repository/Employee/Page_OrangeHRM/input_Employee Full Name_firstName'), firstname)

		WebUI.setText(findTestObject('Object Repository/Employee/Page_OrangeHRM/input_Employee Full Name_lastName'), lastname)
	}

	@And ("Click save button")
	def clickSave() {
		println("\n I am inside clickSave")
		WebUI.click(findTestObject('Object Repository/Employee/Page_OrangeHRM/button_Save'))
	}

	@Then ("verify add sucessfully")
	def verifyAdd() {
		println("\n I am inside verify add sucessfully")
		WebUI.verifyElementPresent(findTestObject('Employee/Page_OrangeHRM/p_Success'), 0)

		WebUI.closeBrowser()
	}
}
