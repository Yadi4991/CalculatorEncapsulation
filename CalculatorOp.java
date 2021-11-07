/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugassettergettermodifider;
/**
 *
 * @author John
 */
public class CalculatorOp {
   Double Hasil;
   //Fungsi Pertambahan
   public Double Pertambahan(Double Bilangan1, Double Bilangan2){
       Hasil = Bilangan1 + Bilangan2;
       return Hasil;
}
   //Fungsi Pengurangan
   public Double Pengurangan(Double Bilangan1, Double Bilangan2){
       Hasil = Bilangan1 - Bilangan2;
       return Hasil;
   }
   public Double Perkalian(Double Bilangan1, Double Bilangan2){
       Hasil = Bilangan1 * Bilangan2;
       return Hasil;
   }
   public Double Pembagian(Double Bilangan1, Double Bilangan2){
       Hasil = Bilangan1 / Bilangan2;
       return Hasil;
   }
}
