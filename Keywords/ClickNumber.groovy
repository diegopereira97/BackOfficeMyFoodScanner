import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class ClickNumber {

	@Keyword
	def clickNumber(String number) {
		def digits = getDigits(number)
		for (def digit : digits) {
			digit = Integer.parseInt(String.valueOf(digit))
			switch (digit) {
				case 0:
					WebUI.click(findTestObject('MyFood.Page.Login/button_digit_0'))
					break
				case 1:
					WebUI.click(findTestObject('MyFood.Page.Login/button_digit_1'))
					break
				case 2:
					WebUI.click(findTestObject('MyFood.Page.Login/button_digit_2'))
					break
				case 3:
					WebUI.click(findTestObject('MyFood.Page.Login/button_digit_3'))
					break
				case 4:
					WebUI.click(findTestObject('MyFood.Page.Login/button_digit_4'))
					break
				case 5:
					WebUI.click(findTestObject('MyFood.Page.Login/button_digit_5'))
					break
				case 6:
					WebUI.click(findTestObject('MyFood.Page.Login/button_digit_6'))
					break
				case 7:
					WebUI.click(findTestObject('MyFood.Page.Login/button_digit_7'))
					break
				case 8:
					WebUI.click(findTestObject('MyFood.Page.Login/button_digit_8'))
					break
				case 9:
					WebUI.click(findTestObject('MyFood.Page.Login/button_digit_9'))
					break
			}
		}
	}

	def getDigits(String number) {
		return number.toCharArray()
	}
}
