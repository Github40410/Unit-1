import java.util.Scanner;

public class Basa {
    public static Sanatorii[] san = new Sanatorii[230];
    public static int i1 = 0;
    public static ZarybPytevki[] zar = new ZarybPytevki[230];
    public static int i2 = 0;
    public static DetskieOzdaraviteli[] lag = new DetskieOzdaraviteli[230];
    public static int i3 = 0;
    public static void DobavBas() {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Если хотите добавить данные о санатории введите 1, о зарубежных путевках 2, а о детских оздоровительных лагерях 3");
        int vvod1 = vvod.nextInt();
        System.out.println("Введите код:");
        int Kod = vvod.nextInt();
        System.out.println("Введите фамилию:");
        String Famili = vvod.nextLine();
        Famili = vvod.nextLine();
        System.out.println("Введите название:");
        String Nazvan = vvod.nextLine();
        System.out.println("Введите номер:");
        int Nomer = vvod.nextInt();
        System.out.println("Введите вид жилья:");
        String VidZilia = vvod.nextLine();
        VidZilia = vvod.nextLine();
        System.out.println("Введите дату заезда:");
        int DataZaezda = vvod.nextInt();
        System.out.println("Введите дату выезда:");
        int DataViezda = vvod.nextInt();
        System.out.println("Введите количество:");
        int Kol = vvod.nextInt();
        System.out.println("Введите цену:");
        float Cena = vvod.nextFloat();
        if(vvod1==1) {
            System.out.println("Введите медицинский полис:");
            int MedPolis = vvod.nextInt();
            System.out.println("Введите диагноз:");
            String Diaznos = vvod.nextLine();
            Diaznos = vvod.nextLine();
            System.out.println("Введите направление:");
            String Napravlenie = vvod.nextLine();
            Sanatorii sanat = new Sanatorii(Kod, Famili, Nazvan, Nomer, VidZilia, DataZaezda, DataViezda, Kol, Cena, MedPolis, Diaznos, Napravlenie);
            san[i1] = sanat;
            i1++;
        }
        else if(vvod1==2){
            System.out.println("Введите заграничный паспорт:");
            String ZagranPasport = vvod.nextLine();
            ZagranPasport = vvod.nextLine();
            System.out.println("Введите страховку:");
            String Straxovka = vvod.nextLine();
            ZarybPytevki zagar = new ZarybPytevki(Kod, Famili, Nazvan, Nomer, VidZilia, DataZaezda, DataViezda, Kol, Cena, ZagranPasport, Straxovka);
            zar[i2] = zagar;
            i2++;
        }
        else if(vvod1==3){
            System.out.println("Введите возраст ребенка: ");
            int vozr = vvod.nextInt();
            System.out.println("Введите заграничный паспорт:");
            String SvidRozd = vvod.nextLine();
            SvidRozd = vvod.nextLine();
            System.out.println("Введите страховку:");
            String Pol = vvod.nextLine();
            DetskieOzdaraviteli zagar = new DetskieOzdaraviteli(Kod, Famili, Nazvan, Nomer, VidZilia, DataZaezda, DataViezda, Kol, Cena, vozr, SvidRozd, Pol);
            lag[i3] = zagar;
            i3++;
        }
        else{
            System.out.println("Данные введены неправильно!");
        }
    }
    public void Print(){
        System.out.println("Введите 1 если хотите вывести санатории, 2 зарубежные путевки и 3 оздоровительные детские лагеря!");
        Scanner vvod = new Scanner(System.in);
        int vvod1 = vvod.nextInt();
        if(vvod1==1) {
            for (int i = 0; i < i1; i++) {
                san[i].getPrint();
            }
        }
        else if(vvod1==2){
            for (int i = 0; i < i2; i++) {
                zar[i].getPrint2();
            }
        }
        else if(vvod1==3){
            for (int i = 0; i < i3; i++) {
                lag[i].getPrint();
            }
        }
        else{
            System.out.println("Данные введены неправильно!");
        }
    }
}
