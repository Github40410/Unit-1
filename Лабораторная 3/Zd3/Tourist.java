package Zd3;

public class Tourist {
    private int kod;
    private String fam;
    private String naz;
    private int nom;
    private String vid;
    private int dataZaezd;
    private int dataViezd;
    private int kol;
    private float cena;
    public Tourist (int kod, String fam, String naz, int nom, String vid ) {
        this.kod = kod;
        this.fam = fam;
        this.naz = naz;
        this.nom = nom;
        this.vid = vid;
    }
    public int getKod() {return kod;}
    public String getFam() { return fam;}
    public String getNaz() {return naz;}
    public void setNom() {this.nom=nom+1;}
    public String getVid() {return vid;}
    public int getZaezd() {return dataZaezd;}
    public void setDataViezd() {dataViezd=dataViezd+14;}
    public int getKol() {return kol;}
    public float getCena() {return cena;}
    public String toString() {
        return "Мистер " + fam + "," + " ваш код путевки " + kod +
                " верный" + " вас заселят в гостинницу вида " + vid + ". "
                + "Ваша изначальная комнота занята. Вас заселят в соседнюю комноту под номером "
                + nom + ". Гостинница " + naz + " желает вам хорошего отдыха.";
    }
}


