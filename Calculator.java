/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugassettergettermodifider;
import java.util.Scanner;
/**
 *
 * @author John
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char Operasi;
        System.out.print("Masukan Bilangan Pertama: ");
        Double Bil1 = scan.nextDouble();
        
         System.out.print("Masukan Operasi Matematika(Gunakan +,-,*,/): ");
         Operasi = scan.next().charAt(0);
        
        System.out.print("Masukan Bilangan Kedua: ");
        Double Bil2 = scan.nextDouble();
        
        CalculatorRe calRe = new CalculatorRe();
        calRe.setbil1(Bil1);
        calRe.setbil2(Bil2);
        
        CalculatorOp cal = new CalculatorOp();
        
    switch  (Operasi){
        case '+':
         Double HasilPertambahan = cal.Pertambahan(calRe.getbil1(), calRe.getbil2());
            System.out.println("Hasilnya adalah"+HasilPertambahan);
            break;
            case '-':
         Double HasilPengurangan = cal.Pengurangan(calRe.getbil1(), calRe.getbil2());
            System.out.println("Hasilnya adalah"+HasilPengurangan);
            break;     
                  case '*':
         Double HasilPerkalian = cal.Perkalian(calRe.getbil1(), calRe.getbil2());
            System.out.println("Hasilnya adalah"+HasilPerkalian);
            break;
                        case '/':
        Double HasilPembagian = cal.Pembagian(calRe.getbil1(), calRe.getbil2());
            System.out.println("Hasilnya adalah  "+HasilPembagian);
            break;  
         default:
             System.out.println("Maaf Operasi matematika anda tidak dapat dimengerti :)");
    }
    }
    
}
