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

WebUI.navigateToUrl('https://qa-v1-env-simpul-66d5bbcff980.herokuapp.com/sign_in')

WebUI.setText(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/Page_FastVisa US/input_Username_userlogin'), 'testersimpul85390')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/Page_FastVisa US/input_Password_userpassword'), 'onWON+SRnSSBDsTuM2JQuQ==')

WebUI.click(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/Page_FastVisa US/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/Page_FastVisa US/Page_FastVisa US Your US Immigration Solution/div_Team Members'))

WebUI.click(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/Page_FastVisa US/Page_FastVisa US Your US Immigration Solution/a_View'))

WebUI.click(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/Page_FastVisa US/Page_FastVisa US Your US Immigration Solution/div_Sponsored Employees                   0'))

WebUI.click(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/Page_FastVisa US/Page_FastVisa US Your US Immigration Solution/button_Add        Sponsored Employee'))

WebUI.setText(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/Page_FastVisa US/Page_FastVisa US Your US Immigration Solution/input_Per Department_c-input'), 
    'jonathan smith')

WebUI.sendKeys(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/Page_FastVisa US/Page_FastVisa US Your US Immigration Solution/input_Per Department_c-input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/Page_FastVisa US/Page_FastVisa US Your US Immigration Solution/i_Per Department_v-icon notranslate bg-whit_dd8a6c'))

WebUI.click(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/Page_FastVisa US/Page_FastVisa US Your US Immigration Solution/i_Per Department_v-icon notranslate bg-whit_dd8a6c'))

WebUI.click(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/Page_FastVisa US/Page_FastVisa US Your US Immigration Solution/td_Johnathan Smith - 04181987 - No Business_1f969a'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/Page_FastVisa US/Page_FastVisa US Your US Immigration Solution/button_Add'))

WebUI.verifyElementVisible(findTestObject('Page_FastVisa US Your US Immigration Solution/b_Sponsored Employee has been successfully added'))

WebUI.closeBrowser()

