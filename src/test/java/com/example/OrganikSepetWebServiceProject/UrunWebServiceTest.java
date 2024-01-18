package com.example.OrganikSepetWebServiceProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UrunWebServiceTest {

	@Test
	void testListele() {
		UrunWebService urunWebService = new UrunWebService();
		assertEquals(1, urunWebService.listele().size());
	}

	@Test
	void testBul() {
		UrunWebService urunWebService = new UrunWebService();
		Urun bulunanUrun = urunWebService.bul(1);
		assertNotNull(bulunanUrun);
	}

	@Test
	void testEkle() {
		UrunWebService urunWebService = new UrunWebService();
		Urun yeniUrun = new Urun(2, "Bal", "2bw");
		assertEquals(yeniUrun, urunWebService.ekle(yeniUrun));
	}

	@Test
	void testSil() {
		UrunWebService urunWebService = new UrunWebService();
		assertTrue(urunWebService.sil(1));
		assertFalse(urunWebService.sil(8));
	}

}
