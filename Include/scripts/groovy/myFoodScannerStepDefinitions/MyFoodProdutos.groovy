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

import internal.GlobalVariable

public class MyFoodProdutos {

	@E("valido titulo da pagina")
	def validarTextoProduto() {
		WebUI.verifyElementText(findTestObject('MyFood.Page.Products/Texts/validarTextoProdutos'), 'Produtos')
	}

	@E("clico no botão Próximo")
	def clicarEmProximo() {
		WebUI.click(findTestObject('MyFood.Page.Products/Buttons/paginacaoProximo'))
	}

	@E("clico no botão Anterior")
	def clicarEmAnterior() {
		WebUI.click(findTestObject('MyFood.Page.Products/Buttons/paginacaoAnterior'))
	}

	@E("clico no botão adicionar produto")
	def clicoAdicionarProduto() {
		WebUI.click(findTestObject('MyFood.Page.Products/Buttons/adicionarProdutoButtons'))
	}
}
