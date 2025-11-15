package com.saucedemo.keywords

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

import internal.GlobalVariable

public class LoginAndVerificationKeywords {
	
		@Keyword
		static def loginUser(String username, String password) {
			// 1. Setup dan Navigasi
			WebUI.openBrowser('https://www.saucedemo.com/')
			WebUI.maximizeWindow() 
			
			// 2. Verifikasi Elemen Halaman Login
			WebUI.verifyElementVisible(findTestObject('Login Page/Header Login Page'))
			WebUI.verifyElementVisible(findTestObject('Login Page/input_Password'))
			WebUI.verifyElementVisible(findTestObject('Login Page/input_User Name'))
			WebUI.verifyElementVisible(findTestObject('Login Page/login-button'))
			
			// 3. Input Kredensial (username & password)
			WebUI.setText(findTestObject('Login Page/input_User Name'), username)
			WebUI.setText(findTestObject('Login Page/input_Password'), password)
			
			// 4. Klik Login
			WebUI.click(findTestObject('Login Page/login-button'))
		}
	}
