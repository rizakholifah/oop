public class App{
    public static void main(String[] args){
        //Membuat objek (Instansiasi/Instance)
        //NamaClass namaObject = new Constructor() //Constructor biasanya adalah nama class
        boolean mesinOn = true;

        mobil MobilBMW = new mobil(); //We had an objcet named "MobilBMW"
        MobilBMW.merk = "BMW"; //Isi Attribute
        MobilBMW.warna = "Biru";
        MobilBMW.platnomor = "B 3418 NHZ";
        MobilBMW.jumlahRoda = 4;
        MobilBMW.jumlahPintu = 5;

        mobil MobilNissan = new mobil();
        MobilNissan.merk = "Nissan";
        MobilNissan.warna = "Silver";
        MobilNissan.platnomor = "B 26 RD";
        MobilNissan.jumlahRoda = 4;
        MobilNissan.jumlahPintu = 5;
        
        if(mesinOn == true){
            System.out.println(MobilNissan.merk);
            MobilNissan.maju();
        }
        else{
            System.out.println(MobilNissan.merk);
            System.out.println("Mesin Belum Menyala");
        }
    }
}

class mobil{
    //Atribute
    String merk;
    String warna;
    String platnomor;
    int jumlahRoda;
    int jumlahPintu;


    //method
    void nyalakanMesin(){
        //code mesin menyala
        System.out.println("Mobil Menyala");
    }
    void maju(){
        //code mobil maju
        System.out.println("Mobil Maju");
    }
    void mundur(){
        //code mobil mundur
       System.out.println("Mobil Mundur");
    }
}