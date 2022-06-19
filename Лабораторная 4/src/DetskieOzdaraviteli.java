public class DetskieOzdaraviteli extends Pytevki{
    private int VozrastRebenka;
    private String SvidRozdenia;
    private String Pol;
    public DetskieOzdaraviteli(int Kod, String Famili, String Nazvan,int Nomer, String VidZilia,int DataZaezda, int DataViezda,
                               int Kol, float Cena, int VozrastRebenka, String SvidRozdenia, String Pol) {
        this.Kod = Kod;
        this.Famili = Famili;
        this.Nazvan = Nazvan;
        this.Nomer = Nomer;
        this.VidZilia = VidZilia;
        this.DataZaezda = DataZaezda;
        this.DataViezda = DataViezda;
        this.Kol = Kol;
        this.Cena = Cena;
        this.VozrastRebenka = VozrastRebenka;
        this.SvidRozdenia = SvidRozdenia;
        this.Pol = Pol;
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
        System.out.print("Возраст ребенка: ");
        System.out.println(VozrastRebenka);
        System.out.print("Свидетельство рождения: ");
        System.out.println(SvidRozdenia);
        System.out.print("Пол ребенка: ");
        System.out.println(Pol);
    }
}
