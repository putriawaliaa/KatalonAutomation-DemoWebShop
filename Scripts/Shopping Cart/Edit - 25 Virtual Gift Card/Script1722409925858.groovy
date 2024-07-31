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

WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

WebUI.click(findTestObject('Dashboard/Featured products/Add to cart - 14.1-inch Laptop'))

WebUI.click(findTestObject('Dashboard/Featured products/Add to cart - 25 Virtual Gift Card'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Dashboard/Detail Product/textbox recipient name - Virtual Gift Card'), 'Bada')

WebUI.setText(findTestObject('Dashboard/Detail Product/textbox recipient email - Virtual Gift Card'), 'leebada@mailsac.com')

WebUI.setText(findTestObject('Dashboard/Detail Product/textbox sender name - Virtual Gift Card'), 'Bada')

WebUI.setText(findTestObject('Dashboard/Detail Product/textbox sender email - Virtual Gift Card'), 'leebada@mailsac.com')

WebUI.setText(findTestObject('Dashboard/Detail Product/textbox message - Virtual Gift Card'), 'no message')

WebUI.setText(findTestObject('Dashboard/Detail Product/textbox Qty'), '2')

WebUI.click(findTestObject('Dashboard/Detail Product/Tombol Add to cart'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping cart/Tombol Shopping Cart'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Shopping cart/Tombol Edit'))

'displays the product detail page'
WebUI.verifyElementPresent(findTestObject('Dashboard/Detail Product/Null Picture of 25 Virtual Gift Card'), 0)

