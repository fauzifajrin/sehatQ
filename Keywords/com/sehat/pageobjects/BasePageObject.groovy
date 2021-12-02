package com.sehat.pageobjects

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
import com.kms.katalon.core.testobject.ConditionType

import internal.GlobalVariable

public class BasePageObject {

	//String userLanguage = ""
	private static BasePageObject thisObj



	public static String package_name = GlobalVariable.ANDROID_PACKAGE_NAME
	public static String env = package_name + ":id"




	/**
	 static void main(String[] args){
	 //test code here
	 public BasePageObject(String lang) {
	 if(lang) {
	 userLanguage = lang.toLowerCase()
	 }
	 }
	 */
	public static BasePageObject getObject(String lang = "ID") {
		return new BasePageObject(lang)
	}

	public String getXpath(TestObject obj) {
		String xpath = obj.getSelectorCollection()[obj.selectorMethod] //get xpath from Katalon's test object
		if(!xpath) { xpath = obj.findPropertyValue("xpath") } //get xpath from Custom test object

		return xpath
	}

	public TestObject createTestObjectByXpath(String objName, String xpath) {
		TestObject testObj = new TestObject(objName)
		testObj.addProperty("xpath",  ConditionType.EQUALS, xpath)
		return testObj
	}


	public TestObject createTestObjectByID(String objName, String ID) {
		TestObject testObj = new TestObject(objName)
		testObj.addProperty("id",  ConditionType.EQUALS, ID)
		return testObj
	}


	public TestObject createTestObjectByPointV1(String objName, int x, int y, String textIdent="") {
		//	textIdent = composeTextIdentifier(textIdent)

		TestObject testObj = new TestObject(objName)
		testObj.addProperty("x", ConditionType.EQUALS, x)
		testObj.addProperty("y", ConditionType.EQUALS, y)
		testObj.addProperty("textIdentifier", ConditionType.EQUALS, textIdent)
		return testObj
	}



	public TestObject createTestObjectV2(String objName, String type, String key, String textIdent="", String additionalXpath="", int index=1) {
		//copy of findTestObjectByText
		String xpath = ""
		String text = MobileHelpers.getTextObjectRepositoryValue(userLanguage, key)
		println "$objName from text repo: " + text
		text = text ? (text.contains(key) ? key : text) : ""

		textIdent = composeTextIdentifier(textIdent)

		TestObject testObj = new TestObject(objName)
		if(MobileHelpers.isIos()) {
			xpath = "(*//$type[contains(@$textIdent, '$text')])[$index]" + additionalXpath
		}else {
			xpath = "//*[@class = '$type' and contains(@$textIdent, '$text')]" + additionalXpath
		}
		testObj.addProperty("xpath", ConditionType.EQUALS, xpath)
		testObj.addProperty("textIdentifier", ConditionType.EQUALS, textIdent)

		return testObj
	}
}
