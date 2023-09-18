public class ProgramSederhana {
    public static void main(String[] args) {
        var nama = "Bima arya sena";
        long nim = 2311016210004L;
        double mtk = 55, ipa = 66, bahsa = 77;
        var total = mtk + ipa + bahsa;
        double rata = total / 3;

        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("");
        System.out.println("Nilai");
        System.out.println("-----------------------------------");
        System.out.println("Matematika : " + mtk);
        System.out.println("IPA        : " + ipa);
        System.out.println("Bahasa     : " + bahsa);
        System.out.println("-----------------------------------");
        System.out.println("Nilai total = " + total + " (Nilai rata-rata : " + rata + ")");

        System.out.println("");

       

        if (rata >= 60) {
            System.out.println("Selamat anda lulus");
        } else {
            System.out.println("bodoh");
        }
    }
}
