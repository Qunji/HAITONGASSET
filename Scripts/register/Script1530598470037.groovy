import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://183.194.58.22:28190/htmw/login/loginAction_loginIndex.do')

WebUI.click(findTestObject('Page_ (1)/span_'))

WebUI.click(findTestObject('Page_ (1)/a__1'))

WebUI.click(findTestObject('Page_/a_'))

WebUI.setText(findTestObject('Page_/input_accntReqVO.mobileTelNo'), '15142370650')

WebUI.setText(findTestObject('Page_/input_vercode'), '35BB')

WebUI.setText(findTestObject('Page_/input_accntReqVO.verifyCode'), '1111')

//WebUI.click(findTestObject('Page_/label_'))
WebUI.clickOffset(findTestObject('Page_/label_'), -10, 1)


WebUI.click(findTestObject('Page_/a_ (1)'))


WebUI.setText(findTestObject('Page_/input_accntReqVO.custName'), '蒋怡')

WebUI.setText(findTestObject('Page_/input_accntReqVO.certificateNo'), '210203198412171021')

WebUI.setText(findTestObject('Page_/input_accntReqVO.password'), '111111')

WebUI.setText(findTestObject('Page_/input_secondPassword'), '111111')

WebUI.click(findTestObject('Page_/a_ (1)'))

//WebUI.closeBrowser()


