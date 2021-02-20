package com.ecodation.innerclass;

public class Ulke {

	private String ulkeAdi = "Türkiye";

	public class Sehirler {
		private String sehirAdi = "İstanbul";

		public class Mahalle {

			private String mahalleAdi = "Başakşehir";

			public String getMahalleAdi() {
				return mahalleAdi;
			}

			public void setMahalleAdi(String mahalleAdi) {
				this.mahalleAdi = mahalleAdi;
			}

		}

		public String getSehirAdi() {
			return sehirAdi;
		}

		public void setSehirAdi(String sehirAdi) {
			this.sehirAdi = sehirAdi;
		}

	}

	public String getUlkeAdi() {
		return ulkeAdi;
	}

	public void setUlkeAdi(String ulkeAdi) {
		this.ulkeAdi = ulkeAdi;
	}
}
