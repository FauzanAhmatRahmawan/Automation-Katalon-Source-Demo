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

public class CheckoutKeywords {
	// 1. Keyword: Menambahkan ke Keranjang dan Navigasi ke Checkout Step 1
	@Keyword
	static def addToCartAndNavigateToCheckout() {
		WebUI.click(findTestObject('Produk Page/button_Add to cart'))
		WebUI.verifyElementVisible(findTestObject('Produk Page/Button_Remove add to cart'))
		WebUI.click(findTestObject('Page Your Cart/cart terisi'))
		WebUI.click(findTestObject('Page Your Cart/button_Checkout'))

		// Verifikasi Checkout Step 1 (Awal)
		WebUI.verifyElementVisible(findTestObject('Page_Checkout Step 1/button_Cancel'))
		WebUI.verifyElementVisible(findTestObject('Page_Checkout Step 1/button_continue'))
		WebUI.verifyElementVisible(findTestObject('Page_Checkout Step 1/input_Checkout Your Information_firstName'))
		WebUI.verifyElementVisible(findTestObject('Page_Checkout Step 1/input_Checkout Your Information_lastName'))
		WebUI.verifyElementVisible(findTestObject('Page_Checkout Step 1/input_Checkout Your Information_postalCode'))
		WebUI.verifyElementVisible(findTestObject('Page_Checkout Step 1/Title Checkout Your Information'))
	}

	// 2. Keyword: Mengisi Informasi Checkout
	@Keyword
	static def fillCheckoutInformation(String firstname, String lastname, String postalcode) {
		// Mengisi data Checkout
		WebUI.setText(findTestObject('Page_Checkout Step 1/input_Checkout Your Information_firstName'), firstname)
		WebUI.setText(findTestObject('Page_Checkout Step 1/input_Checkout Your Information_lastName'), lastname)
		WebUI.setText(findTestObject('Page_Checkout Step 1/input_Checkout Your Information_postalCode'), postalcode)
		
		// Melanjutkan
		WebUI.click(findTestObject('Page_Checkout Step 1/button_continue'))
	}

	// 3. Keyword: Verifikasi Overview dan Menyelesaikan Pesanan
	@Keyword
	static def finishCheckoutAndVerifyCompletion() {
		// Verifikasi Checkout Overview
		WebUI.verifyElementVisible(findTestObject('Page Checkout Overview/button_Cancel'))
		WebUI.verifyElementVisible(findTestObject('Page Checkout Overview/button_Finish'))
		WebUI.verifyElementVisible(findTestObject('Page Checkout Overview/Card Number'))
		WebUI.verifyElementVisible(findTestObject('Page Checkout Overview/Card Product'))
		WebUI.verifyElementVisible(findTestObject('Page Checkout Overview/Deskripsi Product'))
		WebUI.verifyElementVisible(findTestObject('Page Checkout Overview/Detail Item total'))
		WebUI.verifyElementVisible(findTestObject('Page Checkout Overview/Detail Payment Information'))
		WebUI.verifyElementVisible(findTestObject('Page Checkout Overview/Detail Shipping Information'))
		WebUI.verifyElementVisible(findTestObject('Page Checkout Overview/Detail Tax'))
		WebUI.verifyElementVisible(findTestObject('Page Checkout Overview/Detail Total Harga'))

		// Klik Finish
		WebUI.click(findTestObject('Page Checkout Overview/button_Finish'))
		
		// Verifikasi Halaman Konfirmasi (Checkout Completed)
		WebUI.verifyElementVisible(findTestObject('Page Checkout Completed/button_Back Home'))
		WebUI.verifyElementVisible(findTestObject('Page Checkout Completed/Gambar Icon Checkout Complete'))
		WebUI.verifyElementVisible(findTestObject('Page Checkout Completed/Text Detail'))
		WebUI.verifyElementVisible(findTestObject('Page Checkout Completed/Text Thank you for your order'))
		WebUI.verifyElementVisible(findTestObject('Page Checkout Completed/Title Page Checkout Complete'))
	
	}
}