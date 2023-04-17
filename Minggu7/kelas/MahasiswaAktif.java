package Minggu7;

public class MahasiswaAktif extends Mahasiswa{
    int semester;
    public MahasiswaAktif(String nim, String nama, int usia, int semester){
        super(nama, nim, usia);
        this.semester = semester;
    }
    public static void main(String[] args){

    }

    //@override
    public void cetak(){
        super.cetak();
        System.out.println("Semester : " + semester);
    }

    public void isikrs() {
        System.out.println(super.nama + "Mengisi KRS");
    }
}
