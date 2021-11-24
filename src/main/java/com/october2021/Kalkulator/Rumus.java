package com.october2021.Kalkulator;

public class Rumus extends Nilai {
	protected int hT, hL, hB, hk;
	
	public int getNilaiA() {
		setNilaiA(7);
		return nilaiA;
	}
	
	public int getNilaiB() {
		setNilaiB(3);
		return nilaiB;
	}
	
	public void Tambah() {
		hT = getNilaiA() + getNilaiB();
		System.out.println("Penjumlahan : " + hT);
	}
	
	public void Kurang() {
		hk = getNilaiA() - getNilaiB();
		System.out.println("Pengurangan : " + hk);
	}
}
