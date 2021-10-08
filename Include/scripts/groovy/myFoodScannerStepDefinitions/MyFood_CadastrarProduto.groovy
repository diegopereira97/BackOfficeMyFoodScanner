package myFoodScannerStepDefinitions
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



class MyFood_CadastrarProduto {
	
	@E("valido o títuilo da página")
	def validarTitulodaPaginaCadastrarProduto() {
		WebUI.verifyElementText(findTestObject('MyFood.Page.ProductsRegister/Text/validarTextoCadastrarProduto'), 'Cadastrar Produto')
	}
	
	@E("informo o nome do produto")
	def informoNomeProduto() {
		WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirNomeProduto'), 'ProdutoAutomatizado1')
	}
	
	@E("informo o codigo EAN")
	def informoCodigoEAN() {
		WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirCodigoEAN'), '123456')
	}
	
	@E("informo o codigo NCM")
	def informoCodigoNCM() {
		WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirCodigoNCM'), '654321')
	}
	
	
	
	
	
	
	
	
	
	
	WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirObservação'), 'ProdutoAutomatizado1')
	
	WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirCuriosidades'), 'Teste automatizado')
	
	WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirEmbalagem'), 'EmbalagemAutomatizada')
	
	WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirInformacoesExtras'), 'Teste Automatizados')
	
	WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirLitragem'), '2')
	
	WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirPais'), 'Brasil')
	
	WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirReferencias'), 'Referencia em trabalho')
	
	WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirSinonimo'), 'Sinonimo automatocao')
	
	WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirTipoEmbalagem'), '250g')
	
	WebUI.submit(findTestObject('MyFood.Page.ProductsRegister/Buttons/buttonSalvarProduto'))
	
	WebUI.verifyElementText(findTestObject('MyFood.Page.Products/Alerts/alertsSuccessoProduto'), 'Successo!')
	
	
	
	
}