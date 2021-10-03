package myFoodScannerStepDefinitions
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
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

public class MyFoodLoginStep {

	@Dado("que valido o título da página de Login")
	def validarTitulodaPaginadeLogin() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)
		WebUI.navigateToUrl('http://myfoodscannerbo.collabmo.com.br/Account/Login?ReturnUrl=%2F')
		WebUI.verifyLinksAccessible([
			'http://myfoodscannerbo.collabmo.com.br/Account/Login',
			'http://myfoodscannerbo.collabmo.com.br/Account/Login'
		])
		WebUI.verifyElementText(findTestObject('MyFood.Page.Login/Texts/h1_Login'), 'Login')
	}

	@E("valido nome do campo email (.*)")
	def validarTextoCampoEmail(String validarTextoEmailDoLogin) {
		WebUI.verifyElementText(findTestObject('MyFood.Page.Login/Texts/label_Email'), validarTextoEmailDoLogin)
	}

	@E("valido nome do campo senha (.*)")
	def validarTextoCampoSenha(String validarTextoSenhaDoLogin) {
		WebUI.verifyElementText(findTestObject('MyFood.Page.Login/Texts/label_Password'), validarTextoSenhaDoLogin)
	}

	@E("valido nome do botão login (.*)")
	def validarTextoDoBotaoLogin(String validarTextoDoBotaoDoLogin) {
		WebUI.verifyElementText(findTestObject('MyFood.Page.Login/Buttons/button_Login'), validarTextoDoBotaoDoLogin)
	}

	@E("valido nome do checkBox Lembre me (.*)")
	def validarTextoDoCheckBoxDoLogin(String validarTextoLembremeDoLogin) {
		WebUI.verifyElementText(findTestObject('MyFood.Page.Login/Texts/label_Lembre me'), validarTextoLembremeDoLogin)
	}

	@E("valido o link esqueceu sua senha (.*)")
	def validarTextoLinkEsqueceuSuaSenha(String validarTextoEsqueceuSuaSenhaDoLogin) {
		WebUI.verifyElementText(findTestObject('MyFood.Page.Login/Links/u_Esqueceu sua senha'), validarTextoEsqueceuSuaSenhaDoLogin)
	}

	@Quando("preencho os dados de cadastro com email (.*)")
	def informarLogin(String email) {
		WebUI.setText(findTestObject('MyFood.Page.Login/Fields/input_Email_Login'), email)
	}

	@E("preencho os dados de cadastro com senha (.*)")
	def informarSenha(String senha) {
		WebUI.setEncryptedText(findTestObject('MyFood.Page.Login/Fields/input_Password_Password'), senha)
	}

	@Entao("devo clicar no botão login")
	def clicoNotaoLogin() {
		WebUI.click(findTestObject('MyFood.Page.Login/Buttons/button_Login'))
	}

	@E("devo visualizar o alerta do campo email (.*)")
	def validarAlertacampoEmail(String alertaEmail) {
		WebUI.verifyElementText(findTestObject('MyFood.Page.Login/Alerts/span_The Login field is required'), alertaEmail)
		WebUI.closeBrowser()
	}
	@E("devo visualizar o alerta do campo senha (.*)")
	def validarAlertaCampoSenha(String alertaSenha) {
		WebUI.verifyElementText(findTestObject('MyFood.Page.Login/Alerts/span_The Password field is required'), alertaSenha)
		WebUI.closeBrowser()
	}
}