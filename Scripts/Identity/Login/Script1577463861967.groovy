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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://app-framework-staging.expressfinanzierung.bawagpsk.com/')

WebUI.click(findTestObject('Object Repository/login/Page_BAWAG PSK  ExpressFinanzierung/a_BAWAG PSK Login'))

WebUI.setText(findTestObject('Object Repository/login/Page_BAWAG PSK  ExpressFinanzierung/input_Verfgernummer_disposerNumber'), 
    '')

WebUI.click(findTestObject('Object Repository/login/Page_BAWAG PSK  ExpressFinanzierung/input_Verfgernummer_disposerNumber'))

WebUI.setText(findTestObject('Object Repository/login/Page_BAWAG PSK  ExpressFinanzierung/input_Verfgernummer_disposerNumber'), 
    '836953700')

WebUI.setEncryptedText(findTestObject('Object Repository/login/Page_BAWAG PSK  ExpressFinanzierung/input_PIN_disposerPassword'), 
    'Oq7SjQtjY0w8zO5rCDv92w==')

WebUI.click(findTestObject('Object Repository/login/Page_BAWAG PSK  ExpressFinanzierung/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/login/Page_BAWAG PSK  ExpressFinanzierung/strong_BAWAG PSK ExpressFinanzierung'))

WebUI.getText(findTestObject('login/Page_BAWAG PSK  ExpressFinanzierung/strong_BAWAG PSK ExpressFinanzierung'))

WebUI.verifyElementText(findTestObject('login/Page_BAWAG PSK  ExpressFinanzierung/strong_BAWAG PSK ExpressFinanzierung'), 
    'BAWAG P.S.K. ExpressFinanzierung')


WebUI.closeBrowser()

