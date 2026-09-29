public class App {
    public static void main(String[] args) {


        Bentuk bentuk = new Bentuk("Merah");
        BujurSangkar bujurSangkar = new BujurSangkar(5, "Kuning");
        Lingkaran lingkaran = new Lingkaran(7, "Hijau");
        Silinder silinder = new Silinder(10, 7, "Biru");
        

        bentuk.printInfo();
        bujurSangkar.printInfo();
        lingkaran.printInfo();
        silinder.printInfo();
        
    }
}