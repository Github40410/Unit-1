public class Pytevki {
    public int Kod;
    public String Famili;
    public String Nazvan;
    public int Nomer;
    public String VidZilia;
    public int DataZaezda;
    public int DataViezda;
    public int Kol;
    public float Cena;
    public Pytevki() {}
        public Pytevki( int Kod, String Famili, String Nazvan,int Nomer, String VidZilia,int DataZaezda, int DataViezda,
                        int Kol, float Cena){
            this.Kod = Kod;
            this.Famili = Famili;
            this.Nazvan = Nazvan;
            this.Nomer = Nomer;
            this.VidZilia = VidZilia;
            this.DataZaezda = DataZaezda;
            this.DataViezda = DataViezda;
            this.Kol = Kol;
            this.Cena = Cena;
    }
}
