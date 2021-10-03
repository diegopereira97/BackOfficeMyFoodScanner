package myFoodScannerStepDefinitions
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import cucumber.api.java.pt.Dado
import cucumber.api.java.pt.Quando
import cucumber.api.java.pt.E
import cucumber.api.java.pt.Entao


import internal.GlobalVariable

public class MyFoodHomeStep {

	@E("visualizo a tela Home do MyFoodScanner")
	def validarTelaHome() {
		WebUI.verifyElementText(findTestObject('MyFood.Page.Home/Texts/h1_Seja bem vindo'), 'Seja bem vindo!')
	}
	@E("E fecho navegador")
	def closedBrowser() {
		WebUI.closeBrowser()
	}
}
