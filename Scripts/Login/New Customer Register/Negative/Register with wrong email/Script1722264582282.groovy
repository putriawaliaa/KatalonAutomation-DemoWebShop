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

WebUI.navigateToUrl('https://demowebshop.tricentis.com')

WebUI.click(findTestObject('Login/Menu Log In'))

WebUI.click(findTestObject('Login/Tombol Register - Login'))

WebUI.click(findTestObject('Register/Gender Female'))

WebUI.setText(findTestObject('Register/textbox First Name'), 'Lee')

WebUI.setText(findTestObject('Register/textbox Last Name'), 'Bada')

WebUI.setText(findTestObject('Register/textbox Email'), 'leebada@mailsac')

WebUI.setText(findTestObject('Register/textbox Password'), 'ibumuu')

WebUI.setText(findTestObject('Register/textbox Confirm password'), 'ibumuu')

WebUI.click(findTestObject('Register/Tombol Register'))

WebUI.verifyElementPresent(findTestObject('Register/Null Wrong Email'), 0)

WebUI.closeBrowser()

