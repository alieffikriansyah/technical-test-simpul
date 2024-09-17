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

WebUI.setText(findTestObject('Object Repository/Page_FastVisa US/input_Username_userlogin'), 'testersimpul85390')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FastVisa US/input_Password_userpassword'), 'onWON+SRnSSBDsTuM2JQuQ==')

WebUI.click(findTestObject('Object Repository/Page_FastVisa US/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/div_Team Members'))

WebUI.click(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/svg_BigBang Inc_svg dashboard-icon min'))

WebUI.click(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/h6_Task'))

WebUI.setText(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/input_Title_tasktitle'), 'job')

WebUI.setText(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/textarea_Description_taskdescription'), 
    'job already come')

WebUI.click(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/div_Set as If applicable                   _786f92'))

WebUI.click(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/span_Description_toggle-slider round'))

WebUI.click(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/span_Description_toggle-slider round'))

WebUI.click(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/div_Search Help Here_v-skeleton-loader__tex_6c88c5'))

WebUI.setText(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/input_11 Abdi, Temporary Protected Status (TPS) Request_case-autocomplete-tokenfield'), 
    'tes')

WebUI.click(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/p_11 Abdi, Temporary Protected Status (TPS)_0f4ff2'))

WebUI.click(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/input_Assign to case_commit'))

WebUI.click(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/a_View'))

WebUI.click(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/p_members'))

WebUI.click(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/a_View_1'))

WebUI.click(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/i_No active cases have been assigned yet'))

'there is no addition of data, in active cases'
WebUI.click(findTestObject('Object Repository/Page_FastVisa US Your US Immigration Solution/div_No active cases have been assigned yet._55739f'))

WebUI.closeBrowser()

