import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('https://www.katalon.com/')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.katalon.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.open('http://183.194.58.22:28190/htmw/login/loginAction_loginIndex.do')

selenium.click('id=openIndividual')

selenium.selectFrame('index=1')

selenium.click('id=mobileTelNo')

selenium.type('id=mobileTelNo', '15142370650')

selenium.click('id=vercode')

selenium.type('id=vercode', 'fh48')

selenium.click('id=verifyCode')

selenium.type('id=verifyCode', '1111')

WebUI.waitForElementClickable(findTestObject('Page_/label_'), 3)

selenium.click('//form[@id=\'reg_form\']/table/tbody/tr[4]/td/div/label')

WebUI.waitForElementClickable(findTestObject('Page_/a_ (1)'), 3)

selenium.click('id=next')

selenium.click('id=custName')

selenium.type('id=custName', 'owen')

selenium.click('id=certificateNo')

selenium.type('id=certificateNo', '210203198412171021')

selenium.click('//form[@id=\'openAccnt_form\']/table/tbody/tr[5]/td[3]')

selenium.click('id=firstPassWord')

selenium.type('id=firstPassWord', '123456')

selenium.click('id=secondPassword')

selenium.type('id=secondPassword', '123456')

selenium.click('id=next')

