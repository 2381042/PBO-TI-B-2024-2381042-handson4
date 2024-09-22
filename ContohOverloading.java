public class ContohOverloading {
    public static double hitungLuas(double sisi) {
        return sisi * sisi;

    }
    public static double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }
    public static double hitungLuas(double jariJari, boolean isLingkaran) {
        if (isLingkaran) {
            return Math.PI * jariJari * jariJari;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        double luasPersegi = hitungLuas(5);
        System.out.println("Luas persegi: " + luasPersegi);

        double luasPersegiPanjang = hitungLuas(4,6);
        System.out.println("Luas persegi panjang : " + luasPersegiPanjang);

        double luasLingkaran = hitungLuas(3,true);
        System.out.println("Luasm lingkran : " + luasLingkaran );
        }
    }

