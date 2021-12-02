package com.sehatq.web

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import javax.media.ExtendedCachingControl

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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import com.sehat.pageobjects.BasePageObject

public class WEB extends BasePageObject{

	private TestObject klikprofile
	private TestObject inputemaillogin
	private TestObject inputpasswordlogin
	private TestObject buttonlogin
	private TestObject klikprofilelogout
	private TestObject buttonlogout
	private TestObject selectcart
	private TestObject selectedcart
	private TestObject buttonbelanjasekarang
	private TestObject selectjenisproduct
	private TestObject pilihproduct
	private TestObject buttonkeranjang
	private TestObject notifproductberhasilditambahkan
	private TestObject checkcart
	private TestObject notifwaitingsuccess
	private TestObject clickdaftar
	private TestObject inputnama
	private TestObject inputemail
	private TestObject inputpassword
	private TestObject viewpassword
	private TestObject buttondaftar
	private TestObject buttonlewati
	private TestObject inputnomortlp
	private TestObject buttontgllahir
	private TestObject pilihtgllahir
	private TestObject buttonpilihgender
	private TestObject lakilaki
	private TestObject perempuan
	private TestObject pilihjenisidentitas
	private TestObject ktp
	private TestObject passport
	private TestObject kk
	private TestObject sim
	private TestObject buttonlanjut
	private TestObject inputnomoridentitas
	private TestObject inputketentuan
	private TestObject tambahkeranjang
	private TestObject buttonbeli
	private TestObject inputcarilokasi
	private TestObject klikkotabekasi
	private TestObject buttonalamat
	private TestObject inputlabelalamat
	private TestObject inputnamapenerima
	private TestObject inputnotlpnpenerima
	private TestObject inputcatatan
	private TestObject buttonsimpan
	private TestObject inputaturalamat
	private TestObject buttonpilihalamat
	private TestObject inputpilihpengiriman
	private TestObject samedaypengiriman
	private TestObject gosendsameday
	private TestObject anterajasameday
	private TestObject buttonpilihjasainstan
	private TestObject buttonpilihjasasamday
	private TestObject buttonpilihjasareguler
	private TestObject buttonpilihjasanextday
	private TestObject buttonbayar
	private TestObject inputgopay
	private TestObject buttonbayar1
	private TestObject elementlokasi
	private TestObject instanpengiriman
	private TestObject gosendinstant
	private TestObject regulerpengiriman
	private TestObject sicepatreguler
	private TestObject anterajareguler
	private TestObject nextdaypengiriman
	private TestObject sicepatnextday
	private TestObject anterajanextday
	private TestObject inputshopeepay
	private TestObject inputovo
	private TestObject inputbni
	private TestObject inputbca
	private TestObject inputpermata
	private TestObject inputmandiri
	private TestObject inputkartukredit
	private TestObject buttonkonfirmasibayar
	private TestObject buttonpesanansaya
	private TestObject buttonbayarskrg
	private TestObject verifypasswordemailsalah
	private TestObject emailtidakbenar
	private TestObject loginberhasil

	public void loginsehatq(String email, String password, String Action) {

		klikprofile = createTestObjectByXpath("klikprofile", "//div[@id='__next']/header/div/div/div[3]/div/a[2]/img")
		inputemaillogin = createTestObjectByXpath("inputemaillogin", "//div[@id='__next']/div/div/div/div/div[2]/div/form/div/div/label/input")
		inputpasswordlogin = createTestObjectByXpath("inputpasswordlogin", "//div[@id='__next']/div/div/div/div/div[2]/div/form/div[2]/div/label/input")
		buttonlogin = createTestObjectByXpath("buttonlogin", "//div[@id='__next']/div/div/div/div/div[2]/div/form/button")
		klikprofilelogout = createTestObjectByXpath("klikprofilelogout", "//div[@id='popover-profile']/div/img")
		buttonlogout = createTestObjectByXpath("buttonlogout", "//div[@id='popover-profile']/div[2]/div/a[3]")
		verifypasswordemailsalah = createTestObjectByXpath("verifypasswordemailsalah", "//*[@type = 'danger' and (text() = 'Email atau Password yang Anda masukkan salah' or . = 'Email atau Password yang Anda masukkan salah')]")
		emailtidakbenar = createTestObjectByXpath("emailtidakbenar", "//*[@type = 'danger' and (text() = 'Email harus diisi dengan benar' or . = 'Email harus diisi dengan benar')]")
		loginberhasil = createTestObjectByXpath("loginberhasil", "//div[@id='__next']/header/div/div/div/div/a/img")

		WebUI.click(klikprofile)
		WebUI.delay(1)
		WebUI.setText(inputemaillogin, email)
		WebUI.delay(1)
		WebUI.setText(inputpasswordlogin, password)
		WebUI.delay(1)
		WebUI.click(buttonlogin)
		WebUI.delay(1)

		if (Action == 'email dan password salah') {
			WebUI.comment('email atau password salah ')
		} else if (Action == 'email salah') {
			WebUI.comment('email tidak benar')
		} else {
				WebUI.click(klikprofilelogout)
				WebUI.click(buttonlogout)
			}
		WebUI.closeBrowser()
	}

	public void register(String nama, String email, String password, String Action, String nomortlp, String gender, String jenisidentitas, String nomoridentitas) {

		klikprofile = createTestObjectByXpath("klikprofile", "//div[@id='__next']/header/div/div/div[3]/div/a[2]/img")
		clickdaftar = createTestObjectByXpath("clickdaftar", "//div[@id='__next']/div/div/div/div/div[2]/div/div[4]/span/a/span")
		inputnama = createTestObjectByXpath("inputnama", "//div[@id='__next']/div/div/div/div/div[2]/div/form/div/div/label/input")
		inputemail = createTestObjectByXpath("inputemail", "//div[@id='__next']/div/div/div/div/div[2]/div/form/div[2]/div/label/input")
		inputpassword = createTestObjectByXpath("inputpassword", "//div[@id='__next']/div/div/div/div/div[2]/div/form/div[3]/div/label/input")
		viewpassword = createTestObjectByXpath("viewpassword", "//div[@id='__next']/div/div/div/div/div[2]/div/form/div[3]/div/label/div/button/i")
		inputketentuan = createTestObjectByXpath("inputketentuan", "//div[@id='__next']/div/div/div/div/div[2]/div/form/div[4]/div/div/label/span/span")
		buttondaftar = createTestObjectByXpath("buttondaftar", "//div[@id='__next']/div/div/div/div/div[2]/div/form/button")
		buttonlewati = createTestObjectByXpath("buttonlewati", "//div[@id='popover-profile']/div[2]/div/a[3]")
		klikprofilelogout = createTestObjectByXpath("klikprofilelogout", "//div[@id='popover-profile']/div/img")
		buttonlogout = createTestObjectByXpath("buttonlogout", "//div[@id='popover-profile']/div[2]/div/a[3]")
		inputnomortlp = createTestObjectByXpath("inputnomortlp", "//div[@id='__next']/div/div/div/div/div[2]/div/div/div/div/div/label/input")
		buttontgllahir = createTestObjectByXpath("buttontgllahir", "//div[@id='__next']/div/div/div/div/div[2]/div/div[2]/div/div/div/div/label/div/button/i")
		pilihtgllahir = createTestObjectByXpath("pilihtgllahir", "//div[@id='__next']/div/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div/div[3]/div/div[3]")
		buttonpilihgender = createTestObjectByXpath("buttonpilihgender", "//div[@id='gender']/div/button")
		lakilaki = createTestObjectByXpath("lakilaki", "//div[@id='gender']/div[2]/div/div/a[2]")
		perempuan = createTestObjectByXpath("perempuan", "//div[@id='gender']/div[2]/div/div/a")
		pilihjenisidentitas = createTestObjectByXpath("pilihjenisidentitas", "//div[@id='idType']/div/button")
		ktp = createTestObjectByXpath("ktp", "//div[@id='idType']/div[2]/div/div/a[2]")
		passport = createTestObjectByXpath("passport", "//div[@id='idType']/div[2]/div/div/a[3]")
		kk = createTestObjectByXpath("kk", "//div[@id='idType']/div[2]/div/div/a[4]")
		sim = createTestObjectByXpath("sim", "//div[@id='idType']/div[2]/div/div/a[5]")
		inputnomoridentitas = createTestObjectByXpath("inputnomoridentitas", "//div[@id='__next']/div/div/div/div/div[2]/div/div[5]/div/div/div/label/input")
		buttonlanjut = createTestObjectByXpath("buttonlanjut", "//div[@id='__next']/div/div/div/div/div[2]/div/div[6]/div/button")
		inputemaillogin = createTestObjectByXpath("inputemaillogin", "//div[@id='__next']/div/div/div/div/div[2]/div/form/div/div/label/input")
		inputpasswordlogin = createTestObjectByXpath("inputpasswordlogin", "//div[@id='__next']/div/div/div/div/div[2]/div/form/div[2]/div/label/input")
		buttonlogin = createTestObjectByXpath("buttonlogin", "//div[@id='__next']/div/div/div/div/div[2]/div/form/button")
		klikprofilelogout = createTestObjectByXpath("klikprofilelogout", "//div[@id='popover-profile']/div/img")
		buttonlogout = createTestObjectByXpath("buttonlogout", "//div[@id='popover-profile']/div[2]/div/a[3]")

		WebUI.click(klikprofile)
		WebUI.delay(1)
		WebUI.click(clickdaftar)
		WebUI.delay(1)
		WebUI.setText(inputnama, nama)
		WebUI.delay(2)
		WebUI.setText(inputemail, email)
		WebUI.delay(2)
		WebUI.setText(inputpassword, password)
		WebUI.delay(2)
		WebUI.click(inputketentuan)
		WebUI.delay(2)
		WebUI.click(buttondaftar)
		WebUI.delay(2)


		if (WebUI.waitForElementPresent(inputnomortlp, 0)) {
			WebUI.setText(inputnomortlp, nomortlp)
			WebUI.delay(1)
			WebUI.click(buttontgllahir)
			WebUI.delay(1)
			WebUI.click(pilihtgllahir)
			WebUI.delay(1)
			WebUI.click(buttonpilihgender)
			WebUI.delay(1)
			if (gender == 'laki-laki') {
				WebUI.click(lakilaki)
			} else {
				WebUI.click(perempuan)
			}
			WebUI.click(pilihjenisidentitas)
			WebUI.delay(1)
			if (jenisidentitas == 'ktp') {
				WebUI.click(ktp)
			} else if (jenisidentitas == 'passport') {
				WebUI.click(passport)
			} else {
				WebUI.click(sim)
			}
			WebUI.setText(inputnomoridentitas, nomoridentitas)
			WebUI.delay(1)
			WebUI.click(buttonlanjut)
			WebUI.delay(1)
			WebUI.closeBrowser()
		} else {
			WebUI.click(klikprofile)
		}
	}


	public void cart(String email, String password, String carilokasi, String labelalamat, String namapenerima, String notlpnpenerima, String catatan, String pengiriman, String jenispengiriman, String pembayaran) {

		klikprofile = createTestObjectByXpath("klikprofile", "//div[@id='__next']/header/div/div/div[3]/div/a[2]/img")
		inputemaillogin = createTestObjectByXpath("inputemaillogin", "//div[@id='__next']/div/div/div/div/div[2]/div/form/div/div/label/input")
		inputpasswordlogin = createTestObjectByXpath("inputpasswordlogin", "//div[@id='__next']/div/div/div/div/div[2]/div/form/div[2]/div/label/input")
		buttonlogin = createTestObjectByXpath("buttonlogin", "//div[@id='__next']/div/div/div/div/div[2]/div/form/button")
		selectcart = createTestObjectByXpath("selectcart", "//div[@id='popover-cart']/div/div/img")
		selectedcart = createTestObjectByXpath("selectedcart", "//div[@id='popover-cart']/div/div/img")
		buttonbelanjasekarang = createTestObjectByXpath("buttonbelanjasekarang", "//div[@id='__next']/div/div/div/div/div/div/a/button")
		selectjenisproduct = createTestObjectByXpath("selectjenisproduct", "//div[@id='__next']/div/div/div[2]/div/div/div/div/nav/ul/li/a/div/img")
		pilihproduct = createTestObjectByXpath("pilihproduct", "//div[@id='__next']/div/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div/div/div/div/a/h2")
		tambahkeranjang = createTestObjectByXpath("tambahkeranjang", "//div[@id='__next']/div/div/div/div[2]/div[2]/div[3]/button")
		buttonkeranjang = createTestObjectByXpath("buttonkeranjang", "//div[@id='__next']/div/div/div[11]/div/div/div[2]/div/div[3]/button")
		checkcart = createTestObjectByXpath("checkcart", "//div[@id='popover-cart']")
		buttonbeli = createTestObjectByXpath("buttonbeli", "//div[@id='__next']/div/div/div/div/div[2]/div/div/div/div[4]/button")
		inputcarilokasi = createTestObjectByXpath("inputcarilokasi", "//input[@name='search-location']")
		klikkotabekasi = createTestObjectByXpath("klikkotabekasi", "//*[(text() = 'Kota BekasiBekasi City, West Java, Indonesia' or . = 'Kota BekasiBekasi City, West Java, Indonesia')]")
		buttonalamat = createTestObjectByXpath("buttonalamat", "(.//*[normalize-space(text()) and normalize-space(.)='Bekasi, Kota Bks, Jawa Barat, Indonesia'])[1]/following::button[1]")
		inputlabelalamat = createTestObjectByXpath("inputlabelalamat", "//input[@name='label']")
		inputnamapenerima = createTestObjectByXpath("inputnamapenerima", "//input[@name='name']")
		inputnotlpnpenerima = createTestObjectByXpath("inputnotlpnpenerima", "//input[@name='phoneNumber']")
		inputcatatan = createTestObjectByXpath("inputcatatan", "//input[@name='notes']")
		buttonsimpan = createTestObjectByXpath("buttonsimpan", "(.//*[normalize-space(text()) and normalize-space(.)='Jadikan sebagai alamat utama.'])[1]/following::button[1]")
		inputaturalamat = createTestObjectByXpath("inputaturalamat", "(.//*[normalize-space(text()) and normalize-space(.)='Alamat Utama'])[1]/following::div[2]")
		buttonpilihalamat = createTestObjectByXpath("buttonpilihalamat", "(.//*[normalize-space(text()) and normalize-space(.)='Sudah Pinpoint'])[1]/following::button[1]")
		inputpilihpengiriman = createTestObjectByXpath("inputpilihpengiriman", "//div[@id='__next']/div/div/div/div/div/div[2]/div/div[2]/div")
		samedaypengiriman = createTestObjectByXpath("samedaypengiriman", "(.//*[normalize-space(text()) and normalize-space(.)='Rp 20.000'])[1]/following::div[4]")
		gosendsameday = createTestObjectByXpath("gosendsameday", "(.//*[normalize-space(text()) and normalize-space(.)='Same Day (6-8 Jam)'])[1]/following::div[8]")
		anterajasameday = createTestObjectByXpath("anterajasameday", "(.//*[normalize-space(text()) and normalize-space(.)='Order diatas pukul 16.00 berpotensi dikirim dihari berikutnya'])[1]/following::div[4]")
		buttonpilihjasainstan = createTestObjectByXpath("buttonpilihjasa", "(.//*[normalize-space(text()) and normalize-space(.)='Estimasi paket tiba 3 Jam sejak penjual menyerahkan paket ke kurir.'])[1]/following::button[1]")
		buttonpilihjasasamday = createTestObjectByXpath("buttonpilihjasasamday", "(.//*[normalize-space(text()) and normalize-space(.)='Order diatas pukul 13.00 berpotensi dikirim dihari berikutnya'])[1]/following::button[1]")
		buttonpilihjasareguler = createTestObjectByXpath("buttonpilihjasareguler", "(.//*[normalize-space(text()) and normalize-space(.)='*Diterima 1-2 Hari setelah paket diserahkan ke kurir'])[1]/following::button[1]")
		buttonpilihjasanextday = createTestObjectByXpath("buttonpilihjasanextday", "(.//*[normalize-space(text()) and normalize-space(.)='*Diterima 1 Hari setelah paket diserahkan ke kurir'])[1]/following::button[1]")
		buttonbayar = createTestObjectByXpath("buttonbayar", "//div[@id='__next']/div/div/div/div/div[2]/div/div[2]/div/div[6]/button")
		inputgopay = createTestObjectByXpath("inputgopay", "//div[@id='__next']/div/div/div/div/div/div/div[2]/div/div/div/label/span")
		buttonbayar1 = createTestObjectByXpath("buttonbayar1", "//div[@id='__next']/div/div/div/div/div[2]/div/div[2]/div/div[5]/button")
		elementlokasi = createTestObjectByXpath("elementlokasi", "(.//*[normalize-space(text()) and normalize-space(.)='`'])[2]/following::h2[1]")
		instanpengiriman = createTestObjectByXpath("instanpengiriman", "(.//*[normalize-space(text()) and normalize-space(.)='Pilih Pengiriman'])[2]/following::div[5]")
		gosendinstant = createTestObjectByXpath("gosendinstant", "(.//*[normalize-space(text()) and normalize-space(.)='Instan (3 Jam)'])[1]/following::div[6]")
		regulerpengiriman = createTestObjectByXpath("regulerpengiriman", "(.//*[normalize-space(text()) and normalize-space(.)='Rp 18.000 - Rp 20.000'])[1]/following::div[4]")
		sicepatreguler = createTestObjectByXpath("sicepatreguler", "(.//*[normalize-space(text()) and normalize-space(.)='Reguler (2-4 hari)'])[1]/following::div[9]")
		anterajareguler = createTestObjectByXpath("anterajareguler", "(.//*[normalize-space(text()) and normalize-space(.)='*Diterima 1 - 2 hari setelah paket diserahkan ke kurir'])[1]/following::div[4]")
		nextdaypengiriman = createTestObjectByXpath("nextdaypengiriman", "(.//*[normalize-space(text()) and normalize-space(.)='Rp 10.000'])[1]/following::div[4]")
		sicepatnextday = createTestObjectByXpath("sicepatnextday", "(.//*[normalize-space(text()) and normalize-space(.)='Next Day (1 hari)'])[1]/following::div[10]")
		anterajanextday = createTestObjectByXpath("anterajanextday", "(.//*[normalize-space(text()) and normalize-space(.)='*Diterima 1 hari setelah paket diserahkan ke kurir'])[1]/following::div[4]")
		inputshopeepay = createTestObjectByXpath("inputshopeepay", "//div[@id='__next']/div/div/div/div/div/div/div[2]/div/div/div[2]/label/span")
		inputovo = createTestObjectByXpath("inputovo", "//div[@id='__next']/div/div/div/div/div/div/div[2]/div/div/div[3]/label/span")
		inputbni = createTestObjectByXpath("inputbni", "//div[@id='__next']/div/div/div/div/div/div/div[3]/div/div/div/label/span")
		inputbca = createTestObjectByXpath("inputbca", "//div[@id='__next']/div/div/div/div/div/div/div[3]/div/div/div[2]/label/span")
		inputpermata = createTestObjectByXpath("inputpermata", "//div[@id='__next']/div/div/div/div/div/div/div[3]/div/div/div[3]/label/span")
		inputmandiri = createTestObjectByXpath("inputmandiri", "//div[@id='__next']/div/div/div/div/div/div/div[3]/div/div/div[4]/label/span")
		inputkartukredit = createTestObjectByXpath("inputkartukredit", "//div[@id='__next']/div/div/div/div/div/div/div[4]/div/div/div/label/span")
		buttonkonfirmasibayar = createTestObjectByXpath("buttonkonfirmasibayar", "//div[@id='__next']/div/div/div/div[4]/button")
		buttonpesanansaya = createTestObjectByXpath("buttonpesanansaya", "//div[@id='__next']/div/div/div/div[4]/a")
		buttonbayarskrg = createTestObjectByXpath("buttonbayarskrg", "//div[@id='__next']/div/div/div/div/div[3]/div[6]/a/button")


		WebUI.click(klikprofile)
		WebUI.delay(1)
		WebUI.setText(inputemaillogin, email)
		WebUI.delay(1)
		WebUI.setText(inputpasswordlogin, password)
		WebUI.delay(1)
		WebUI.click(buttonlogin)
		WebUI.delay(1)
		WebUI.waitForElementPresent(selectcart, 10)
		WebUI.delay(1)
		WebUI.click(selectedcart)
		WebUI.delay(2)
		WebUI.click(buttonbelanjasekarang)
		WebUI.delay(2)
		WebUI.click(selectjenisproduct)
		WebUI.delay(2)
		WebUI.click(pilihproduct)
		WebUI.delay(2)
		WebUI.click(tambahkeranjang)
		WebUI.delay(2)
		WebUI.click(buttonkeranjang)
		WebUI.delay(3)
		WebUI.doubleClick(checkcart, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(buttonbeli)
		WebUI.delay(2)
		if (WebUI.waitForElementPresent(elementlokasi, 10)) {
			WebUI.click(inputcarilokasi)
			WebUI.delay(1)
			WebUI.setText(inputcarilokasi, carilokasi)
			WebUI.delay(1)
			WebUI.click(klikkotabekasi)
			WebUI.delay(1)
			WebUI.click(buttonalamat)
			WebUI.delay(2)
			WebUI.doubleClick(inputlabelalamat, FailureHandling.STOP_ON_FAILURE)
			WebUI.delay(2)
			WebUI.setText(inputlabelalamat, labelalamat)
			WebUI.delay(2)
			WebUI.doubleClick(inputnamapenerima, FailureHandling.STOP_ON_FAILURE)
			WebUI.delay(2)
			WebUI.setText(inputnamapenerima, namapenerima)
			WebUI.delay(2)
			WebUI.doubleClick(inputnotlpnpenerima, FailureHandling.STOP_ON_FAILURE)
			WebUI.delay(2)
			WebUI.setText(inputnotlpnpenerima, notlpnpenerima)
			WebUI.delay(2)
			WebUI.doubleClick(inputcatatan, FailureHandling.STOP_ON_FAILURE)
			WebUI.delay(2)
			WebUI.setText(inputcatatan, catatan)
			WebUI.delay(2)
			WebUI.click(buttonsimpan)
			WebUI.delay(2)
			WebUI.click(inputaturalamat)
			WebUI.delay(2)
			WebUI.click(buttonpilihalamat)
			WebUI.delay(2)
			WebUI.click(inputpilihpengiriman)
			WebUI.delay(2)
			WebUI.click(samedaypengiriman)
			WebUI.delay(2)
			WebUI.click(gosendsameday)
			WebUI.delay(2)
			WebUI.click(buttonpilihjasainstan)
			WebUI.delay(2)
			WebUI.click(buttonbayar)
			WebUI.delay(2)
			WebUI.click(inputshopeepay)
			WebUI.delay(2)
			WebUI.click(buttonbayar1)
			WebUI.delay(2)
		} else {
			WebUI.click(inputpilihpengiriman)
			WebUI.delay(2)
			if (pengiriman == 'instan(3jam)') {
				WebUI.click(instanpengiriman)
				WebUI.delay(2)
				WebUI.click(gosendinstant)
				WebUI.delay(2)
				WebUI.click(buttonpilihjasainstan)
			} else if (pengiriman == 'same day(6-8 jam)') {
				WebUI.click(samedaypengiriman)
				WebUI.delay(2)
				if (jenispengiriman == 'gosend') {
					WebUI.click(gosendsameday)
					WebUI.delay(2)
					WebUI.click(buttonpilihjasasamday)
					WebUI.delay(2)
				} else (jenispengiriman == 'anteraja') {
						WebUI.click(anterajasameday)
						WebUI.click(buttonpilihjasasamday)
					}
			} else if (pengiriman == 'reguler(2-4 hari)') {
				WebUI.click(regulerpengiriman)
				WebUI.delay(2)
				if (jenispengiriman == 'sicepatreg') {
					WebUI.click(sicepatreguler)
					WebUI.click(buttonpilihjasareguler)
				} else (jenispengiriman == 'anterajareg'){
						WebUI.click(anterajareguler)
						WebUI.click(buttonpilihjasareguler)
					}
			} else (pengiriman == 'nextday(1 hari)') {
					WebUI.click(nextdaypengiriman)
					WebUI.delay(2)
					if (jenispengiriman == 'sicepat') {
						WebUI.click(sicepatnextday)
						WebUI.click(buttonpilihjasanextday)
					} else (jenispengiriman == 'anteraja') {
							WebUI.click(anterajanextday)
							WebUI.click(buttonpilihjasanextday)
						}
				}
			WebUI.delay(2)
			WebUI.click(buttonbayar)
			WebUI.delay(2)

			if (pembayaran == 'gopay') {
				WebUI.click(inputgopay)
			} else if (pembayaran == 'shopeepay') {
				WebUI.click(inputshopeepay)
			} else if (pembayaran == 'ovo') {
				WebUI.click(inputovo)
			} else if (pembayaran == 'bni VA') {
				WebUI.click(inputbni)
			} else if (pembayaran == 'bca VA') {
				WebUI.click(inputbca)
			} else if (pembayaran == 'permatan VA') {
				WebUI.click(inputpermata)
			} else if (pembayaran == 'mandiri VA') {
				WebUI.click(inputmandiri)
			} else {
				WebUI.click(inputkartukredit)
			}
			WebUI.delay(2)
			WebUI.click(buttonbayar1)
			WebUI.delay(2)
		}
		WebUI.closeBrowser()
	}
}
