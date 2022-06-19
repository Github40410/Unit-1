public class ZarybPytevki extends Pytevki {
    private String ZagranPasport;
    private String Straxovka;

    public ZarybPytevki(int Kod, String Famili, String Nazvan, int Nomer, String VidZilia, int DataZaezda, int DataViezda,
                        int Kol, float Cena, String ZagranPasport, String Straxovka) {
        this.Kod = Kod;
        this.Famili = Famili;
        this.Nazvan = Nazvan;
        this.Nomer = Nomer;
        this.VidZilia = VidZilia;
        this.DataZaezda = DataZaezda;
        this.DataViezda = DataViezda;
        this.Kol = Kol;
        this.Cena = Cena;
        this.ZagranPasport = ZagranPasport;
        this.Straxovka = Straxovka;
    }

    public void getPrint2() {
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
        System.out.print("Заграничный паспорт: ");
        System.out.println(ZagranPasport);
        System.out.print("Свидетельство страховка: ");
        System.out.println(Straxovka);
    }
}
