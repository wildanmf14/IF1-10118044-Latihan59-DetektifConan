
public class Main {

	public static void main(String[] args) {
        Tokoh kar = new Tokoh("", "", "");

        //Tokoh Utama
        TokohUtama Conan = new TokohUtama("Conan Edogawa/Shinici Kudo", "Laki-Laki", "Detektif, Pelajar SD/SMA", "Kekasih dari RAN, Teman Heiji,Sonoko,Kazuha,dan detektif cilik");
        TokohUtama Ran = new TokohUtama("Ran Mouri", "Perempuan", "Pelajar SMA", "Kekasih dari Shinichi dan Teman Heiji,Sonoko,Kazuha serta anak dari Kogoro dan Eri");
        TokohUtama Kogoro = new TokohUtama("Kogoro Mouri", "Laki-Laki", "Detektif", "Suami dari Eri dan Ayah dari Ran");

        //Tokoh Pendukung Detektif Cilik
        TokohPendukung Ayumi = new TokohPendukung("Ayumi Yoshida", "Perempuan", "Pelajar SD", "Detektif Cilik", "Teman Conan,Genta,Ai,Mitsuhiko,Genta");
        TokohPendukung Mitsuhiko = new TokohPendukung("Mitsuhiko Tsuburaya", "Laki-Laki", "Pelajar SD", "Detektif Cilik", "Teman Conan,Genta,Ai,Ayumi,Genta");
        TokohPendukung Genta = new TokohPendukung("Genta Kojima", "Laki-Laki", "Pelajar SD", "Detektif Cilik", "Teman Conan,Genta,Ai,Mitsuhiko,Ayumi");
        TokohPendukung Ai = new TokohPendukung("Ai Haibara/Shiho Miyano", "Perempuan", "Pelajar SD, mantan anggota Organisasi Hitam", "Detektif Cilik", "Teman Conan,Genta,Ayumi,Mitsuhiko,Genta");

        //Tokoh Pendukung SMA
        TokohPendukung Sonoko = new TokohPendukung("Sonoko Suzuki", "Perempuan", "Pelajar SMA", "Sonoko Tidur", "teman Shinichi,Ran,Kazuha,Heiji");
        TokohPendukung Heiji = new TokohPendukung("Heiji Hatori", "Laki-Laki", "Pelajar SMA, Detektif", "-", "teman Shinichi,Ran,Sonoko, dan kekasih dari Kazuha");
        TokohPendukung Kazuha = new TokohPendukung("Kazuha Toyama", "Perempuan", "Pelajar SMA", "-", "teman Shinichi,Ran,Sonoko, dan kekasih dari Heiji");

        //Tokoh Pendukung keluarga Mouri
        TokohPendukung Eri = new TokohPendukung("Eri Kisaki", "Perempuan", "Pengacara", "Ratu Pengacara", "Istri dari Kogoro dan Ibu dari Ran");

        //Tokoh pendukung yang membantu Conan
        TokohPendukung Agasa = new TokohPendukung("Agasa Hiroshi", "Laki-Laki", "Professor", "-", "Pendukung Conan dan Ai");

        //Tokoh Utama
        System.out.println("Tokoh dalam serial Detective Conan\n");
        System.out.println("@Tokoh Utama");
        Conan.tampilTokoh();
        Ran.tampilTokoh();
        Kogoro.tampilTokoh();
        System.out.println();

        //Detektif Cilik
        System.out.println("@Detektif Cilik");
        Conan.tampilTokoh();
        Ayumi.tampilTokoh();
        Mitsuhiko.tampilTokoh();
        Genta.tampilTokoh();
        Ai.tampilTokoh();

        //Detektif SMA dan kawan kawan
        System.out.println("@Detektif SMA dan Kawan-Kawan");
        Conan.tampilTokoh();
        Ran.tampilTokoh();
        Sonoko.tampilTokoh();
        Heiji.tampilTokoh();
        Kazuha.tampilTokoh();

        //Keluarga Mouri
        Kogoro.tampilTokoh();
        Eri.tampilTokoh();
        Ran.tampilTokoh();

        //Yang Mengetahui Conan adalah Shinichi
        System.out.println("@The Truth of Conan");
        Agasa.tampilTokoh();
        Heiji.tampilTokoh();
        Ai.tampilTokoh();

    }


}
