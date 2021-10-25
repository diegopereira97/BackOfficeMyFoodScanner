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
import cucumber.api.java.pt.Dado
import cucumber.api.java.pt.Quando
import cucumber.api.java.pt.E
import cucumber.api.java.pt.Entao




class MyFoodCadastrarProdutoStep {
	
	@E("valido o título da página")
	def validarTitulodaPaginaCadastrarProduto() {
		WebUI.verifyElementText(findTestObject('MyFood.Page.ProductsRegister/Text/validarTextoCadastrarProduto'), 'Cadastrar Produto')
	}
	
	@E("informo o nome do produto")
	def informoNomeProduto() {
		WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirNomeProduto'), 'ProdutoAutomatizado1')
	}
	
	@E("informo o codigo EAN do produto")
	def informoCodigoEAN() {
		WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirCodigoEAN'), '123456')
	}
	
	@E("informo o codigo NCM do produto")
	def informoCodigoNCM() {
		WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirCodigoNCM'), '654321')
	}
	
	@E("informo a observação do produto")
	def informarObservacaoProduto() {
		WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirObservação'), 'ProdutoAutomatizado1')
	}
	
	@E("informo a curiosidade do produto")
	def informarCuriosidadeProduto() {
		WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirCuriosidades'), 'Teste automatizado')
	}
	
	@E("informo a embalagem do produto")
	def informarEmbalagemProduto() {
		WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirEmbalagem'), 'EmbalagemAutomatizada')
	}
	
	@E("informo as informações extras do produto")
	def informarInformacoesExtrasProduto() {
		WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirInformacoesExtras'), 'Teste Automatizados')
	}
	
	@E("informo a litragem do produto")
	def informarLitragemProduto() {
		WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirLitragem'), '2')
	}
	
	@E("informo o país do produto")
	def informarPaisProduto() {
		WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirPais'), 'Brasil')
	}
	
	@E("informo a referencia do produto")
	def informarReferenciaProduto() {
		WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirReferencias'), 'Referencia em trabalho')
	}
	
	@E("informo o sinônimo do produto")
	def informarSinonimoProduto() {
		WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirSinonimo'), 'Sinonimo automatocao')
	}
	
	@E("informo o tipo embalagem do produto")
	def informarTipoEmbalagemProduto() {
		WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirTipoEmbalagem'), '250g')
	}
	
	@E("clico no botão salvar do produto")
	def clicarSalvarProduto() {
		WebUI.submit(findTestObject('MyFood.Page.ProductsRegister/Buttons/buttonSalvarProduto'))
	}
	
	@E("valido alerta do produto criado com sucesso")
	def validarAlertaProdutoCriadoSucesso() {
		WebUI.verifyElementText(findTestObject('MyFood.Page.Products/Alerts/alertsSuccessoProduto'), 'Successo!')
	}
	
	
}