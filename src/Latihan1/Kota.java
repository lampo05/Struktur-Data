package Latihan1;

public class Kota <E> {
    private E elemen;

    public Kota(E kota) {
        elemen = kota;
    }

    public E getElemen(){
        return elemen;
    }
    public static void main(String[] args) {
        Kota<Integer> jumlahKota = new Kota<Integer>(9);
        Kota<String> namaKota = new Kota<String>("Malang");
        System.out.println("Jumlah kota di Jawa Timur : "+ jumlahKota.getElemen() + "kota");
        System.out.println("Salah satu Kota di Jawa Timur : Kota "+ namaKota.getElemen());
    }
}
