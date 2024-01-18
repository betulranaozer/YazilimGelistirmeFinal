package com.example.OrganikSepetWebServiceProject;

public class Urun {
	private int urunId;
	private String urunAdi;
	private String urunKodu;

	public Urun(int urunId, String urunAdi, String urunKodu) {
		this.urunId = urunId;
		this.urunAdi = urunAdi;
		this.urunKodu = urunKodu;
	}

	public int getUrunId() {
		return urunId;
	}

	public void setUrunId(int urunId) {
		this.urunId = urunId;
	}

	public String getUrunAdi() {
		return urunAdi;
	}

	public void setUrunAdi(String urunAdi) {
		this.urunAdi = urunAdi;
	}

	public String getUrunKodu() {
		return urunKodu;
	}

	public void setUrunKodu(String urunKodu) {
		this.urunKodu = urunKodu;
	}

}
