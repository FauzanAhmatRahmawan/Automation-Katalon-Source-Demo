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

public class ProductPageVerificationKeywords {

    @Keyword
    static def verifyAllProductPageElements() {
        // Verifikasi semua elemen di Halaman Produk
        WebUI.verifyElementVisible(findTestObject('Produk Page/Gambar produk'))
        WebUI.verifyElementVisible(findTestObject('Produk Page/Product Card'))
        WebUI.verifyElementVisible(findTestObject('Produk Page/Tittle Produk'))
        WebUI.verifyElementVisible(findTestObject('Produk Page/Deskripsi produk'))
        WebUI.verifyElementVisible(findTestObject('Produk Page/Header Page_Products'))
        WebUI.verifyElementVisible(findTestObject('Produk Page/Filter Produk'))
        WebUI.verifyElementVisible(findTestObject('Produk Page/button_Add to cart'))
    }
}
