package com.october2021.Kalkulator;

public class BagiAbstract extends Nilai {
	protected int hasil;
	
	public int getNilaiA() {
		setNilaiA(7);
		return nilaiA;
	}
	
	public int getNilaiB() {
		setNilaiB(0);
		return nilaiB;
	}
	
	protected void Bagi() {
		hasil = getNilaiA() / getNilaiB();
		System.out.println("Pembagian : " + hasil);
	}

}
