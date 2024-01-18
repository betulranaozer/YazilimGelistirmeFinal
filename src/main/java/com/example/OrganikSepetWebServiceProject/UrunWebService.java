package com.example.OrganikSepetWebServiceProject;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/urun")
public class UrunWebService {

	private static final List<Urun> URUN_LISTESI = new ArrayList<>();

	static {
		URUN_LISTESI.add(new Urun(1, "Çikolata", "59rr"));
	}
	
	@GetMapping("/")
	public List<Urun> listele() {
		return URUN_LISTESI;
	}

	@GetMapping("/{id}")
	public Urun bul(@PathVariable int id) {
		for (Urun urun : URUN_LISTESI) {
			if (urun.getUrunId() == id) {
				return urun;
			}
		}
		return null;
	}

	@PostMapping("/")
	public Urun ekle(@RequestBody Urun urun) {
		URUN_LISTESI.add(urun);
		return urun;
	}

	@DeleteMapping("/{id}")
	public boolean sil(@PathVariable int id) {
		Urun urun = bul(id);
		if (urun != null) {
			URUN_LISTESI.remove(urun);
			return true;
		}
		return false;
	}

}
