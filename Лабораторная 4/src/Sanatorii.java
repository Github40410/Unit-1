public class Sanatorii extends Pytevki{
    private int MedPolis;
    private String Diaznos;
    private String Napravlenie;
    public Sanatorii(int Kod, String Famili, String Nazvan,int Nomer, String VidZilia,int DataZaezda, int DataViezda,
                     int Kol, float Cena, int MedPolis, String Diaznos, String Napravlenie) {
        this.Kod = Kod;
        this.Famili = Famili;
        this.Nazvan = Nazvan;
        this.Nomer = Nomer;
        this.VidZilia = VidZilia;
        this.DataZaezda = DataZaezda;
        this.DataViezda = DataViezda;
        this.Kol = Kol;
        this.Cena = Cena;
        this.MedPolis = MedPolis;
        this.Diaznos = Diaznos;
        this.Napravlenie = Napravlenie;
    }
    public void getPrint() {
        System.out.print("Код: ");
        System.out.println(Kod);
        System.out.print("Фамилия: ");
        System.out.println(Famili);
        System.out.print("Название: ");
        System.out.println(Nazvan);
        System.out.print("Номер: ");
        System.out.println(Nomer);
        System.out.print("Вид жилья: ");
        System.out.println(VidZilia);
        System.out.print("Дата заезда: ");
        System.out.println(DataZaezda);
        System.out.print("Дата выезда: ");
        System.out.println(DataViezda);
        System.out.print("Количество: ");
        System.out.println(Kol);
        System.out.print("Цена: ");
        System.out.println(Cena);
        System.out.print("Медицинский полис: ");
        System.out.println(MedPolis);
        System.out.print("Диагноз: ");
        System.out.println(Diaznos);
        System.out.print("Направление: ");
        System.out.println(Napravlenie);
    }
}
