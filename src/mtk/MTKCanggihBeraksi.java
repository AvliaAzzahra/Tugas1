
package mtk;

public class MTKCanggihBeraksi {
    public static void main(String[] args) {
    
        MTKCanggih call = new MTKCanggih();

      
        call.setA(100);
        call.setB(20);

        int tambah = call.tambah();
        System.out.println("Hasil Tambah : " + tambah);

        int kali = call.kali();
        System.out.println("Hasil kali : " + kali);
       
        int modulus = call.modulus();
        System.out.println("Hasil modulus : " + modulus);
    }
} 
   
