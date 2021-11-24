package com.october2021.Kalkulator;

public class HasilRun {

	public static void main(String[] args) throws Exception {
		Rumus rumus = new Rumus();
		rumus.Tambah();
		
		try {
			BagiAbstract tugas2Bagi = new BagiAbstract();
			tugas2Bagi.Bagi();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		rumus.Kurang();
		ImplemenKali implementer = new ImplemenKali();
		implementer.Perkalian();
		
		
	}
}