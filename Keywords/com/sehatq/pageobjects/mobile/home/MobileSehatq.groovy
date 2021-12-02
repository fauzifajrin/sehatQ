package com.sehatq.pageobjects.mobile.home

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.BaseObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.sehat.pageobjects.BasePageObject

import internal.GlobalVariable

public class MobileSehatq extends BasePageObject {

	private TestObject aktifkanlokasimu
	private TestObject kliktidakaktifkan
	private TestObject clicklewati
	private TestObject klikprofiel
	private TestObject inputemail
	private TestObject inputpassword
	private TestObject buttonlogin
	private TestObject klikprofilsaya
	private TestObject klikhamburgerprofil
	private TestObject klikpengaturanaplikasi
	private TestObject buttonlogout
	private TestObject kliklogoutya
	private TestObject logodashboard
	private TestObject popupemailataupasswordsalah
	private TestObject buttonokpopupemailsalah
	private TestObject hapusemailpopupemailsalah
	private TestObject hapuspasswordpopupemailsalah
	private TestObject popupemailharusbenar
	private TestObject clickback

	public void login(String email, String password) {

		aktifkanlokasimu = createTestObjectByXpath("aktifkanlokasimu", "//*[@class = 'android.widget.TextView' and (@text = 'Aktifkan Lokasimu' or . = 'Aktifkan Lokasimu') and @resource-id = 'com.she.sehatq:id/tv_title']")
		kliktidakaktifkan = createTestObjectByXpath("kliktidakaktifkan", "//*[@class = 'android.widget.TextView' and (@text = 'Tidak' or . = 'Tidak') and @resource-id = 'com.she.sehatq:id/tv_dismiss']")
		clicklewati = createTestObjectByXpath("clicklewati", "//*[@class = 'android.widget.Button' and (@text = 'Lewati' or . = 'Lewati') and @resource-id = 'com.she.sehatq:id/tv_skip']")
		klikprofiel = createTestObjectByXpath("klikprofiel", "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.she.sehatq:id/iv_profile_nav' and (@text = '' or . = '')]")
		inputemail = createTestObjectByXpath("inputemail", "//*[@class = 'android.widget.EditText' and (@text = 'Email' or . = 'Email') and @resource-id = 'com.she.sehatq:id/et_input']")
		inputpassword = createTestObjectByXpath("inputpassword", "//*[@class = 'android.widget.EditText' and (@text = 'Password' or . = 'Password') and @resource-id = 'com.she.sehatq:id/et_input']")
		buttonlogin = createTestObjectByXpath("aktifkanlokasimu", "//*[@class = 'android.widget.Button' and (@text = 'Log in' or . = 'Log in') and @resource-id = 'com.she.sehatq:id/btn_login']")
		klikhamburgerprofil = createTestObjectByXpath("klikhamburgerprofil", "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.she.sehatq:id/ivMore' and (@text = '' or . = '')]")
		klikpengaturanaplikasi = createTestObjectByXpath("klikpengaturanaplikasi", "//*[@class = 'android.widget.TextView' and (@text = 'Pengaturan Aplikasi' or . = 'Pengaturan Aplikasi') and @resource-id = 'com.she.sehatq:id/tvTitle']")
		buttonlogout = createTestObjectByXpath("buttonlogout", "//*[@class = 'android.widget.TextView' and (@text = 'Log Out' or . = 'Log Out') and @resource-id = 'com.she.sehatq:id/tv_sign_out']")
		kliklogoutya = createTestObjectByXpath("kliklogoutya", "//*[@class = 'android.widget.TextView' and (@text = 'Ya' or . = 'Ya') and @resource-id = 'com.she.sehatq:id/btn_yes']")
		logodashboard = createTestObjectByXpath("logodashboard", "//*[@class = 'android.widget.TextView' and (@text = 'Log in' or . = 'Log in') and @resource-id = 'com.she.sehatq:id/tv_login_header']")
		popupemailataupasswordsalah = createTestObjectByXpath("popupemailataupasswordsalah", "//*[@class = 'android.widget.TextView' and (@text = 'Email atau Password yang Anda masukkan salah' or . = 'Email atau Password yang Anda masukkan salah') and @resource-id = 'com.she.sehatq:id/tv_detail']")
		buttonokpopupemailsalah = createTestObjectByXpath("buttonokpopupemailsalah", "//*[@class = 'android.widget.Button' and (@text = 'OK' or . = 'OK') and @resource-id = 'com.she.sehatq:id/btn_ok']")
		hapusemailpopupemailsalah = createTestObjectByXpath("hapusemailpopupemailsalah", "//*[@class = 'android.widget.EditText' and @resource-id = 'com.she.sehatq:id/et_input']")
		hapuspasswordpopupemailsalah = createTestObjectByXpath("hapuspasswordpopupemailsalah", "//*[@class = 'android.widget.EditText' and @index = '0' and @resource-id = 'com.she.sehatq:id/et_input' and @clickable = 'true' and @password = 'true']")
		popupemailharusbenar = createTestObjectByXpath("popupemailharusbenar", "//*[@class = 'android.widget.TextView' and (@text = 'Email harus diisi dengan benar' or . = 'Email harus diisi dengan benar') and @resource-id = 'com.she.sehatq:id/tv_detail']")
		clickback = createTestObjectByXpath("clickback", "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.she.sehatq:id/iv_back' and (@text = '' or . = '')]")
		
		if (Mobile.waitForElementPresent(aktifkanlokasimu, 20)) {
			Mobile.delay(2)
			Mobile.tap(kliktidakaktifkan, 30)
			Mobile.delay(2)
			Mobile.tap(klikprofiel, 30)
		} else {
			Mobile.tap(klikprofiel, 30)
		}
		Mobile.tap(inputemail, 30)
		Mobile.setText( inputemail, email,30)
		Mobile.tap(inputpassword, 30)
		Mobile.setText( inputpassword, password,30)
		Mobile.tap(buttonlogin, 30)

		if (Mobile.waitForElementPresent(logodashboard, 30)) {
			Mobile.comment('login berhasil')
			Mobile.tap(klikhamburgerprofil, 30)
			Mobile.tap(klikpengaturanaplikasi, 30)
			Mobile.tap(buttonlogout, 30)
			Mobile.tap(kliklogoutya, 30)
		} else if (Mobile.waitForElementPresent(popupemailataupasswordsalah, 30)) {
			Mobile.tap(buttonokpopupemailsalah, 10)
			Mobile.clearText(hapusemailpopupemailsalah, 20)
			Mobile.clearText(hapuspasswordpopupemailsalah, 20)
			Mobile.delay(2)
			Mobile.doubleTap(clickback, 20)
		} else if (Mobile.waitForElementPresent(buttonokpopupemailsalah, 30)) {
			Mobile.tap(buttonokpopupemailsalah, 20)
			Mobile.clearText(hapusemailpopupemailsalah, 20)
			Mobile.clearText(hapuspasswordpopupemailsalah, 20)
			Mobile.doubleTap(clickback, 20)
		} else {
			Mobile.comment('periksa data dengan benar')
		}
		Mobile.closeApplication()
	}

	private TestObject klikdaftar
	private TestObject inputnamalengkap
	private TestObject inputemaildaftar
	private TestObject inputpassworddaftar
	private TestObject kliksayasetuju
	private TestObject buttondaftar
	private TestObject inputnotlp
	private TestObject inputtgllahir
	private TestObject pilihtgllahir
	private TestObject klikjeniskelamin
	private TestObject lakilaki
	private TestObject perempuan
	private TestObject klikjenisidentitas
	private TestObject noidentitas
	private TestObject buttonlanjut
	private TestObject buttonpilihtgllahir
	private TestObject ktp
	private TestObject kk
	private TestObject sim
	private TestObject passport
	private TestObject verifylogin
	private TestObject clicklewatiregister
	private TestObject clickya

	public void register(String namalengkap, String email, String password, String action, String nomortlp, String jeniskelamin, String jenisidentitas, String nomoridentitas) {

		aktifkanlokasimu = createTestObjectByXpath("aktifkanlokasimu", "//*[@class = 'android.widget.TextView' and (@text = 'Aktifkan Lokasimu' or . = 'Aktifkan Lokasimu') and @resource-id = 'com.she.sehatq:id/tv_title']")
		kliktidakaktifkan = createTestObjectByXpath("kliktidakaktifkan", "//*[@class = 'android.widget.TextView' and (@text = 'Tidak' or . = 'Tidak') and @resource-id = 'com.she.sehatq:id/tv_dismiss']")
		klikprofiel = createTestObjectByXpath("klikprofiel", "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.she.sehatq:id/iv_profile_nav' and (@text = '' or . = '')]")
		klikdaftar = createTestObjectByXpath("klikdaftar", "//*[@class = 'android.widget.TextView' and (@text = 'Daftar' or . = 'Daftar') and @resource-id = 'com.she.sehatq:id/tv_signup']")
		inputnamalengkap = createTestObjectByXpath("inputnamalengkap", "//*[@class = 'android.widget.EditText' and (@text = 'Nama Lengkap' or . = 'Nama Lengkap') and @resource-id = 'com.she.sehatq:id/et_input']")
		inputemaildaftar = createTestObjectByXpath("inputemaildaftar", "//*[@class = 'android.widget.EditText' and (@text = 'Email' or . = 'Email') and @resource-id = 'com.she.sehatq:id/et_input']")
		inputpassworddaftar = createTestObjectByXpath("inputpassworddaftar", "//*[@class = 'android.widget.EditText' and (@text = 'Password' or . = 'Password') and @resource-id = 'com.she.sehatq:id/et_input']")
		kliksayasetuju = createTestObjectByXpath("kliksayasetuju", "//*[@class = 'android.widget.CheckBox' and @resource-id = 'com.she.sehatq:id/cb_terms' and (@text = '' or . = '')]")
		buttondaftar = createTestObjectByXpath("buttondaftar", "//*[@class = 'android.widget.Button' and (@text = 'Daftar' or . = 'Daftar') and @resource-id = 'com.she.sehatq:id/btn_signup']")
		inputnotlp = createTestObjectByXpath("inputnotlp", "//*[@class = 'android.widget.EditText' and (@text = 'No. Telepon' or . = 'No. Telepon') and @resource-id = 'com.she.sehatq:id/et_input']")
		inputtgllahir = createTestObjectByXpath("inputtgllahir", "//*[@class = 'android.view.View' and @resource-id = 'com.she.sehatq:id/btnDOB' and (@text = '' or . = '')]")
		pilihtgllahir = createTestObjectByXpath("pilihtgllahir", "//*[@class = 'android.widget.Button' and (@text = 'Pilih' or . = 'Pilih') and @resource-id = 'com.she.sehatq:id/btnSave']")
		klikjeniskelamin = createTestObjectByXpath("jeniskelamin", "//*[@class = 'android.view.View' and @resource-id = 'com.she.sehatq:id/btnGender' and (@text = '' or . = '')]")
		lakilaki = createTestObjectByXpath("jenisidentitas", "//*[@class = 'android.widget.TextView' and (@text = 'Laki-laki' or . = 'Laki-laki') and @resource-id = 'com.she.sehatq:id/tvMale']")
		perempuan = createTestObjectByXpath("jenisidentitas", "//*[@class = 'android.widget.TextView' and (@text = 'Perempuan' or . = 'Perempuan') and @resource-id = 'com.she.sehatq:id/tvFemale']")
		klikjenisidentitas = createTestObjectByXpath("klikjenisidentitas", "//*[@class = 'android.view.View' and @resource-id = 'com.she.sehatq:id/btnIdType' and (@text = '' or . = '')]")
		ktp = createTestObjectByXpath("ktp", "//*[@class = 'android.widget.TextView' and (@text = 'KTP' or . = 'KTP') and @resource-id = 'com.she.sehatq:id/tvKTP']")
		kk = createTestObjectByXpath("kk", "//*[@class = 'android.widget.TextView' and (@text = 'KK' or . = 'KK') and @resource-id = 'com.she.sehatq:id/tvKK']")
		sim = createTestObjectByXpath("sim", "//*[@class = 'android.widget.TextView' and (@text = 'SIM' or . = 'SIM') and @resource-id = 'com.she.sehatq:id/tvSIM']")
		passport = createTestObjectByXpath("passport", "//*[@class = 'android.widget.TextView' and (@text = 'Passport' or . = 'Passport') and @resource-id = 'com.she.sehatq:id/tvPassport']")
		noidentitas = createTestObjectByXpath("noidentitas", "//*[@class = 'android.widget.EditText' and (@text = 'No. Identitas' or . = 'No. Identitas') and @resource-id = 'com.she.sehatq:id/et_input']")
		buttonlanjut = createTestObjectByXpath("buttonlanjut", "//*[@class = 'android.widget.Button' and (@text = 'Lanjut' or . = 'Lanjut') and @resource-id = 'com.she.sehatq:id/btnContinue']")
		verifylogin = createTestObjectByXpath("verifylogin", "//*[@class = 'android.widget.TextView' and (@text = 'Profil Saya' or . = 'Profil Saya') and @resource-id = 'com.she.sehatq:id/tvMyProfile']")
		klikhamburgerprofil = createTestObjectByXpath("klikhamburgerprofil", "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.she.sehatq:id/ivMore' and (@text = '' or . = '')]")
		klikpengaturanaplikasi = createTestObjectByXpath("klikpengaturanaplikasi", "//*[@class = 'android.widget.TextView' and (@text = 'Pengaturan Aplikasi' or . = 'Pengaturan Aplikasi') and @resource-id = 'com.she.sehatq:id/tvTitle']")
		buttonlogout = createTestObjectByXpath("buttonlogout", "//*[@class = 'android.widget.TextView' and (@text = 'Log Out' or . = 'Log Out') and @resource-id = 'com.she.sehatq:id/tv_sign_out']")
		kliklogoutya = createTestObjectByXpath("kliklogoutya", "//*[@class = 'android.widget.TextView' and (@text = 'Ya' or . = 'Ya') and @resource-id = 'com.she.sehatq:id/btn_yes']")
		logodashboard = createTestObjectByXpath("logodashboard", "//*[@class = 'android.widget.TextView' and (@text = 'Log in' or . = 'Log in') and @resource-id = 'com.she.sehatq:id/tv_login_header']")
		clicklewatiregister = createTestObjectByXpath("clicklewatiregister", "//*[@class = 'android.widget.TextView' and (@text = 'Lewati' or . = 'Lewati') and @resource-id = 'com.she.sehatq:id/tvSkip']")
		clickya = createTestObjectByXpath("clickya", "//*[@class = 'android.widget.TextView' and (@text = 'Ya' or . = 'Ya') and @resource-id = 'com.she.sehatq:id/btn_yes']")
		
		if (Mobile.waitForElementPresent(aktifkanlokasimu, 3)) {
			Mobile.delay(2)
			Mobile.tap(kliktidakaktifkan, 3)
			Mobile.delay(2)
			Mobile.tap(klikprofiel, 3)
		} else {
			Mobile.tap(klikprofiel, 3)
		}

		if (Mobile.waitForElementPresent(verifylogin, 0)) {
			Mobile.tap(klikhamburgerprofil, 3)
			Mobile.tap(klikpengaturanaplikasi, 3)
			Mobile.tap(buttonlogout, 3)
			Mobile.tap(kliklogoutya, 3)
			Mobile.tap(klikprofiel, 3)
		} else {
			Mobile.comment('Tidak perlu logout dulu ')
		}
		Mobile.tap(klikdaftar, 10)
		Mobile.setText(inputnamalengkap, namalengkap, 0)
		Mobile.delay(1)
		Mobile.setText(inputemaildaftar, email, 0)
		Mobile.delay(1)
		Mobile.setText(inputpassworddaftar, password, 0)
		Mobile.delay(1)
		Mobile.tap(kliksayasetuju, 10)
		Mobile.delay(1)
		Mobile.tap(buttondaftar, 10)
		Mobile.delay(1)
		Mobile.setText(inputnotlp, nomortlp, 0)
		Mobile.delay(1)
		Mobile.tap(inputtgllahir, 10)
		Mobile.delay(1)
		Mobile.tap(pilihtgllahir, 10)
		Mobile.delay(1)
		Mobile.tap(klikjeniskelamin, 10)
		if (jeniskelamin == 'laki-laki') {
			Mobile.tap(lakilaki, 10)
		} else {
			Mobile.tap(perempuan, 10)
		}
		Mobile.tap(klikjenisidentitas, 10)
		if (jenisidentitas == 'ktp') {
			Mobile.tap(ktp, 10)
		} else if (jenisidentitas == 'kk') {
			Mobile.tap(kk, 10)
		} else if (jenisidentitas == 'sim') {
			Mobile.tap(sim, 10)
		} else if (jenisidentitas == 'passport') {
			Mobile.tap(passport, 10)
		} else {
			Mobile.comment('cek data excel')
		}
		Mobile.setText(noidentitas, nomoridentitas, 10)
		Mobile.tap(clicklewatiregister, 10)
		Mobile.tap(clickya, 10)
		Mobile.tap(klikhamburgerprofil, 3)
		Mobile.tap(klikpengaturanaplikasi, 3)
		Mobile.tap(buttonlogout, 3)
		Mobile.tap(kliklogoutya, 3)
		
		Mobile.closeApplication()
		
	}

	private TestObject klikback
	private TestObject selectcart
	private TestObject buttonbelanjaskrg
	private TestObject selecttoko
	private TestObject selectjenisproduct
	private TestObject pilihproduct
	private TestObject buttonkeranjang
	private TestObject tambahjumlahproduk
	private TestObject tambahkekeranjang
	private TestObject lihatkeranjang
	private TestObject buttonlanjutpembayaran
	private TestObject inputcarialamat
	private TestObject kotabekasi
	private TestObject buttonkonfirmasialamat
	private TestObject inputlabelalamat
	private TestObject inputnamapenerima
	private TestObject inputnotlpcart
	private TestObject inputcatatan
	private TestObject buttonsimpan
	private TestObject klikalamat
	private TestObject buttonpilihalamat
	private TestObject pilihpengiriman
	private TestObject klikinstan
	private TestObject klikgosendinstan
	private TestObject buttonpilihjasainstan
	private TestObject kliksameday
	private TestObject klikgosendsameday
	private TestObject klikanterajasameday
	private TestObject buttonpilihjasasameday
	private TestObject klikreguler
	private TestObject kliksicepatreguler
	private TestObject klikanterajareguler
	private TestObject buttonpilihjasareguler
	private TestObject kliknextday
	private TestObject kliksicepatbest
	private TestObject klikanterajanextday
	private TestObject buttonpilihjasanextday
	private TestObject buttonbayarpengiriman
	private TestObject klikgopay
	private TestObject klikshopeepay
	private TestObject klikovo
	private TestObject klikbniva
	private TestObject klikbcava
	private TestObject klikpermatava
	private TestObject klikmandiriva
	private TestObject klikkartukredit
	private TestObject buttonpembayaran
	private TestObject elementlokasi

	public void cart(String email, String password, String carilokasi, String labelalamat, String namapenerima, String notlpnpenerima, String catatan, String pengiriman, String jenispengiriman, String pembayaran) {

		aktifkanlokasimu = createTestObjectByXpath("aktifkanlokasimu", "//*[@class = 'android.widget.TextView' and (@text = 'Aktifkan Lokasimu' or . = 'Aktifkan Lokasimu') and @resource-id = 'com.she.sehatq:id/tv_title']")
		kliktidakaktifkan = createTestObjectByXpath("kliktidakaktifkan", "//*[@class = 'android.widget.TextView' and (@text = 'Tidak' or . = 'Tidak') and @resource-id = 'com.she.sehatq:id/tv_dismiss']")
		klikprofiel = createTestObjectByXpath("klikprofiel", "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.she.sehatq:id/iv_profile_nav' and (@text = '' or . = '')]")
		inputemail = createTestObjectByXpath("inputemail", "//*[@class = 'android.widget.EditText' and (@text = 'Email' or . = 'Email') and @resource-id = 'com.she.sehatq:id/et_input']")
		inputpassword = createTestObjectByXpath("inputpassword", "//*[@class = 'android.widget.EditText' and (@text = 'Password' or . = 'Password') and @resource-id = 'com.she.sehatq:id/et_input']")
		buttonlogin = createTestObjectByXpath("buttonlogin", "//*[@class = 'android.widget.Button' and (@text = 'Log in' or . = 'Log in') and @resource-id = 'com.she.sehatq:id/btn_login']")
		klikback = createTestObjectByXpath("klikback", "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.she.sehatq:id/ivBack' and (@text = '' or . = '')]")
		selectcart = createTestObjectByXpath("selectcart", "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.she.sehatq:id/iv_cart_top_nav' and (@text = '' or . = '')]")
		buttonbelanjaskrg = createTestObjectByXpath("buttonbelanjaskrg", "//*[@class = 'android.widget.TextView' and (@text = 'Belanja Sekarang' or . = 'Belanja Sekarang') and @resource-id = 'com.she.sehatq:id/btn_shopping']")
		selecttoko = createTestObjectByXpath("selecttoko", "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.she.sehatq:id/navFeaure2' and (@text = '' or . = '')]")
		selectjenisproduct = createTestObjectByXpath("selectjenisproduct", "//*[@class = 'android.widget.TextView' and (@text = 'Vitamin, Herbal & Suplemen' or . = 'Vitamin, Herbal & Suplemen') and @resource-id = 'com.she.sehatq:id/tvCategoryName']")
		pilihproduct = createTestObjectByXpath("pilihproduct", "//*[@class = 'android.widget.TextView' and (@text = 'Jamieson Vitamin C Plus 500 mg Chewable Orange (Botol @ 120 Tablet) - 2 Botol' or . = 'Jamieson Vitamin C Plus 500 mg Chewable Orange (Botol @ 120 Tablet) - 2 Botol') and @resource-id = 'com.she.sehatq:id/tvProductName']")
		buttonkeranjang = createTestObjectByXpath("buttonkeranjang", "//*[@class = 'android.widget.Button' and (@text = '+ Keranjang' or . = '+ Keranjang') and @resource-id = 'com.she.sehatq:id/btn_add_to_cart']")
		tambahjumlahproduk = createTestObjectByXpath("tambahjumlahproduk", "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.she.sehatq:id/iv_plus' and (@text = '' or . = '')]")
		tambahkekeranjang = createTestObjectByXpath("tambahkekeranjang", "//*[@class = 'android.widget.Button' and (@text = 'Tambah ke Keranjang' or . = 'Tambah ke Keranjang') and @resource-id = 'com.she.sehatq:id/btn_add_cart']")
		lihatkeranjang = createTestObjectByXpath("lihatkeranjang", "//*[@class = 'android.widget.Button' and (@text = 'Lihat Keranjang' or . = 'Lihat Keranjang') and @resource-id = 'com.she.sehatq:id/btn_to_cart']")
		buttonlanjutpembayaran = createTestObjectByXpath("buttonlanjutpembayaran", "//*[@class = 'android.widget.Button' and (@text = 'Lanjut Pembayaran' or . = 'Lanjut Pembayaran') and @resource-id = 'com.she.sehatq:id/btn_buy']")
		elementlokasi = createTestObjectByXpath("elementlokasi", "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.TextView[1]")
		inputcarialamat = createTestObjectByXpath("inputcarialamat", "//*[@class = 'android.widget.EditText' and (@text = '' or . = '')]")
		kotabekasi = createTestObjectByXpath("kotabekasi", "//*[@class = 'android.widget.TextView' and (@text = 'Kota BekasiBekasi City, West Java, Indonesia' or . = 'Kota BekasiBekasi City, West Java, Indonesia')]")
		buttonkonfirmasialamat = createTestObjectByXpath("buttonkonfirmasialamat", "//*[@class = 'android.widget.Button' and (@text = 'Konfirmasi Alamat' or . = 'Konfirmasi Alamat')]")
		inputlabelalamat = createTestObjectByXpath("inputlabelalamat", "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.EditText[1]")
		inputnamapenerima = createTestObjectByXpath("inputnamapenerima", "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.widget.EditText[1]")
		inputnotlpcart = createTestObjectByXpath("inputnotlp", "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View[3]/android.view.View[1]/android.view.View[1]/android.widget.EditText[1]")
		inputcatatan = createTestObjectByXpath("inputcatatan", "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View[7]/android.view.View[1]/android.view.View[1]/android.widget.EditText[1]")
		buttonsimpan = createTestObjectByXpath("buttonsimpan", "//*[@class = 'android.widget.Button' and (@text = 'Simpan' or . = 'Simpan')]")
		klikalamat = createTestObjectByXpath("klikalamat", "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View[3]")
		buttonpilihalamat = createTestObjectByXpath("buttonpilihalamat", "//*[@class = 'android.widget.Button' and (@text = 'Pilih Alamat' or . = 'Pilih Alamat')]")
		pilihpengiriman = createTestObjectByXpath("pilihpengiriman", "//*[@class = 'android.widget.TextView' and (@text = 'Pilih Pengiriman' or . = 'Pilih Pengiriman')]")
		klikinstan = createTestObjectByXpath("klikinstan", "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]")
		klikgosendinstan = createTestObjectByXpath("klikgosendinstan", "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]")
		buttonpilihjasainstan = createTestObjectByXpath("buttonpilihjasainstan", "//*[@class = 'android.widget.Button' and (@text = 'Pilih Jasa Pengiriman' or . = 'Pilih Jasa Pengiriman')]")
		kliksameday = createTestObjectByXpath("kliksameday", "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[2]")
		klikgosendsameday = createTestObjectByXpath("klikgosendsameday", "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]")
		klikanterajasameday = createTestObjectByXpath("klikanterajasameday", "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[2]")
		buttonpilihjasasameday = createTestObjectByXpath("buttonpilihjasasameday", "//*[@class = 'android.widget.Button' and (@text = 'Pilih Jasa Pengiriman' or . = 'Pilih Jasa Pengiriman')]")
		klikreguler = createTestObjectByXpath("klikreguler", "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View[2]")
		kliksicepatreguler = createTestObjectByXpath("kliksicepatreguler", "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]")
		klikanterajareguler = createTestObjectByXpath("klikanterajareguler", "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[2]")
		buttonpilihjasareguler = createTestObjectByXpath("buttonpilihjasareguler", "//*[@class = 'android.widget.Button' and (@text = 'Pilih Jasa Pengiriman' or . = 'Pilih Jasa Pengiriman')]")
		kliknextday = createTestObjectByXpath("kliknextday", "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[4]/android.view.View[2]")
		kliksicepatbest = createTestObjectByXpath("kliksicepatbest", "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]")
		klikanterajanextday = createTestObjectByXpath("klikanterajanextday", "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]")
		buttonpilihjasanextday = createTestObjectByXpath("buttonpilihjasanextday", "//*[@class = 'android.widget.Button' and (@text = 'Pilih Jasa Pengiriman' or . = 'Pilih Jasa Pengiriman')]")
		buttonbayarpengiriman = createTestObjectByXpath("buttonbayarpengiriman", "//*[@class = 'android.widget.Button' and (@text = 'Bayar' or . = 'Bayar')]")
		klikgopay = createTestObjectByXpath("klikgopay", "//*[@class = 'android.widget.RadioButton' and (@text = 'Gopay' or . = 'Gopay')]")
		klikshopeepay = createTestObjectByXpath("kliksjopeepay", "//*[@class = 'android.widget.RadioButton' and (@text = 'Shopee Pay' or . = 'Shopee Pay')]")
		klikovo = createTestObjectByXpath("klikovo", "//*[@class = 'android.widget.RadioButton' and (@text = 'OVO' or . = 'OVO')]")
		klikbniva = createTestObjectByXpath("klikbniva", "//*[@class = 'android.widget.RadioButton' and (@text = 'BNI Virtual Account' or . = 'BNI Virtual Account')]")
		klikbcava = createTestObjectByXpath("klikbcava", "//*[@class = 'android.widget.RadioButton' and (@text = 'BCA Virtual Account' or . = 'BCA Virtual Account')]")
		klikpermatava = createTestObjectByXpath("klikpermatava", "//*[@class = 'android.widget.RadioButton' and (@text = 'Permata Virtual Account' or . = 'Permata Virtual Account')]")
		klikmandiriva = createTestObjectByXpath("klikmandiriva", "//*[@class = 'android.widget.RadioButton' and (@text = 'Mandiri Virtual Account' or . = 'Mandiri Virtual Account')]")
		klikkartukredit = createTestObjectByXpath("klikkartukredit", "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.RadioButton[1]")
		buttonpembayaran = createTestObjectByXpath("buttonpembayaran", "//*[@class = 'android.widget.Button' and (@text = 'Bayar' or . = 'Bayar')]")


		if (Mobile.waitForElementPresent(aktifkanlokasimu, 3)) {
			Mobile.delay(2)
			Mobile.tap(kliktidakaktifkan, 3)
			Mobile.delay(2)
			Mobile.tap(klikprofiel, 3)
		} else {
			Mobile.tap(klikprofiel, 30)
			Mobile.delay(2)
		}
		Mobile.tap(inputemail, 10)
		Mobile.setText( inputemail, email,10)
		Mobile.tap(inputpassword, 10)
		Mobile.setText( inputpassword, password,10)
		Mobile.tap(buttonlogin, 10)
		Mobile.tap(klikback, 10)
		Mobile.tap(selectcart, 30)
		Mobile.delay(2)
		Mobile.tap(buttonbelanjaskrg, 30)
		Mobile.delay(2)
		Mobile.tap(selecttoko, 30)
		Mobile.delay(2)
		Mobile.tap(selectjenisproduct, 30)
		Mobile.delay(2)
		Mobile.tap(pilihproduct, 30)
		Mobile.tap(buttonkeranjang, 30)
		Mobile.tap(tambahjumlahproduk, 40)
		Mobile.tap(tambahkekeranjang, 40)
		Mobile.tap(lihatkeranjang, 40)
		Mobile.delay(2)
		Mobile.doubleTap(buttonlanjutpembayaran, 60, FailureHandling.STOP_ON_FAILURE)
		Mobile.delay(5)

		if (Mobile.waitForElementPresent(elementlokasi, 30)) {
			Mobile.setText(inputcarialamat, carilokasi, 10)
			Mobile.tap(kotabekasi, 10)
			Mobile.tap(buttonkonfirmasialamat, 10)
			Mobile.setText(inputlabelalamat, labelalamat, 10)
			Mobile.setText(inputnamapenerima, namapenerima, 10)
			Mobile.setText(inputnotlpcart, notlpnpenerima, 10)
			Mobile.setText(inputcatatan, catatan, 10)
			Mobile.tap(buttonsimpan, 10)
			Mobile.tap(klikalamat, 10)
			Mobile.tap(buttonpilihalamat, 10)
			Mobile.tap(pilihpengiriman, 10)
			Mobile.tap(klikinstan, 10)
			Mobile.tap(klikgosendinstan, 10)
			Mobile.tap(buttonpilihjasainstan, 10)
			Mobile.tap(klikgopay, 10)
			Mobile.doubleTap(buttonpembayaran, 10)
		} else {
			Mobile.tap(pilihpengiriman, 30)
			Mobile.delay(2)
			if (pengiriman == 'instan(3jam)') {
				Mobile.doubleTap(klikinstan, 30)
				Mobile.delay(2)
				Mobile.tap(klikgosendinstan, 30)
				Mobile.delay(2)
				Mobile.tap(buttonpilihjasainstan, 30)
			} else if (pengiriman == 'same day(6-8 jam)') {
				Mobile.doubleTap(kliksameday, 30)
				Mobile.delay(2)
				if (jenispengiriman == 'gosend') {
					Mobile.tap(klikgosendsameday, 30)
					Mobile.delay(2)
					Mobile.tap(buttonpilihjasasameday, 30)
					Mobile.delay(2)
				} else (jenispengiriman == 'anteraja') {
						Mobile.tap(klikanterajasameday, 30)
						Mobile.delay(2)
						Mobile.tap(buttonpilihjasasameday, 30)
						Mobile.delay(2)
					}
			} else if (pengiriman == 'reguler(2-4 hari)') {
				Mobile.doubleTap(klikreguler, 30)
				Mobile.delay(3)
				if (jenispengiriman == 'sicepatreg') {
					Mobile.tap(kliksicepatreguler, 30)
					Mobile.tap(buttonpilihjasareguler, 30)
				} else (jenispengiriman == 'anterajareg'){
						Mobile.tap(klikanterajareguler, 30)
						Mobile.delay(3)
						Mobile.doubleTap(buttonpilihjasareguler, 30)
					}
			} else (pengiriman == 'nextday(1 hari)') {
					Mobile.doubleTap(kliknextday, 30)
					if (jenispengiriman == 'sicepatnext') {
						Mobile.tap(kliksicepatbest, 30)
						Mobile.tap(buttonpilihjasanextday, 30)
					} else (jenispengiriman == 'anterajanext') {
							Mobile.tap(klikanterajanextday, 30)
							Mobile.tap(buttonpilihjasanextday, 30)
						}
				}
			Mobile.tap(buttonbayarpengiriman, 30)
			if (pembayaran == 'gopay') {
				Mobile.tap(klikgopay, 30)
			} else if (pembayaran == 'shopeepay') {
				Mobile.tap(klikshopeepay, 30)
			} else if (pembayaran == 'ovo') {
				Mobile.tap(klikovo, 30)
			} else if (pembayaran == 'bni VA') {
				Mobile.tap(klikbniva, 30)
			} else if (pembayaran == 'bca VA') {
				Mobile.tap(klikbcava, 30)
			} else if (pembayaran == 'permatan VA') {
				Mobile.tap(klikpermatava, 30)
			} else if (pembayaran == 'mandiri VA') {
				Mobile.tap(klikmandiriva, 30)
			} else {
				Mobile.tap(klikkartukredit, 30)
			}
			Mobile.tap(buttonpembayaran, 30)
		}
	}
}