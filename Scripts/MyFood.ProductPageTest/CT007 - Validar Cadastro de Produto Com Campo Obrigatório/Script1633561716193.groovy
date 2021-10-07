import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://myfoodscannerbo.collabmo.com.br/Account/Login?ReturnUrl=%2F')

WebUI.setText(findTestObject('MyFood.Page.Login/Fields/input_Email_Login'), 'root')

WebUI.setEncryptedText(findTestObject('MyFood.Page.Login/Fields/input_Password_Password'), 'l+893ldgBQc6lUnZGG0ANg==')

WebUI.click(findTestObject('MyFood.Page.Login/Buttons/button_Login'))

WebUI.verifyElementText(findTestObject('MyFood.Page.Home/Texts/h1_Seja bem vindo'), 'Seja bem vindo!')

WebUI.click(findTestObject('MyFood.Page.Home/Menus/a_Produtos'))

WebUI.click(findTestObject('MyFood.Page.Home/SubMenus/a_Produtos'))

WebUI.verifyElementText(findTestObject('MyFood.Page.Products/Texts/validarTextoProdutos'), 'Produtos')

WebUI.click(findTestObject('MyFood.Page.Products/Buttons/paginacaoProximo'))

WebUI.click(findTestObject('MyFood.Page.Products/Buttons/paginacaoAnterior'))

WebUI.click(findTestObject('MyFood.Page.Products/Buttons/adicionarProdutoButtons'))

WebUI.verifyElementText(findTestObject('MyFood.Page.ProductsRegister/Text/validarTextoCadastrarProduto'), 'Cadastrar Produto')

WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirNomeProduto'), 'ProdutoAutomatizado1')

WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirCodigoEAN'), '123456')

WebUI.setText(findTestObject('MyFood.Page.ProductsRegister/Fields/inserirCodigoNCM'), '654321')

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

