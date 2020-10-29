/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan19.saldotabungan;

/**
 * @author 
 * NAMA: Zain Achamd Rizqullah
 * KELAS: PBO2
 * NIM: 10116380
 * Deskripsi: Program Saldo Tabungan
 */
public class PBO210116380Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int bulan = 6;
        int i = 1;
        int  saldoTab = 2500000;
        double bunga = 0.15;
        double saldoBul;
      
        while (i <= bulan) {
           
            saldoBul = saldoTab * bunga;
            
            saldoTab = (int)(saldoTab + saldoBul);

            System.out.println("Saldo dibulan ke-" + i + " Rp."
            + (int) saldoTab);
            i++;
        }
    }
    
}
