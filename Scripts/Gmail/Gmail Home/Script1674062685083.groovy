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

WebUI.navigateToUrl('https://accounts.google.com/v3/signin/identifier?dsh=S-1610025026%3A1674062719819780&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHcmnhkE5x2W3r5HlyO9GRHHRFpu209vP1rGF81hSjO9qxVuc2_DeZVyef7j_r35TbPg3IjWzg')

WebUI.rightClick(findTestObject('Object Repository/Page_Gmail/input_to continue to Gmail_identifier'))

WebUI.click(findTestObject('Object Repository/Page_Gmail/span_Create account'))

WebUI.click(findTestObject('Object Repository/Page_Gmail/li_For my personal use'))

WebUI.setText(findTestObject('Object Repository/Page_Create your Google Account/input_to continue to Gmail_firstName'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Page_Create your Google Account/input_to continue to Gmail_lastName'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_Create your Google Account/input_to continue to Gmail_Username'), 'test')

WebUI.click(findTestObject('Object Repository/Page_Create your Google Account/span_Next'))

WebUI.closeBrowser()

