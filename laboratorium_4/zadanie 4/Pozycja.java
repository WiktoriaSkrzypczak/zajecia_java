import java.util.Date;

public class Pozycja
{
    //Dane dotyczace kazdej pozycji w systemie
    String tytul;
    String autor;
    public Date datawydania;
    int numerpozycji;
    int cena;
    boolean statusdostepny;

    //Normalne dla każdego rzeczy
    public void setTytul(String tytul)
    {
        this.tytul = tytul;
    };

    public String getTytul()
    {
        return tytul;
    };

    public void setAutor(String autor) { this.autor = autor; };

    public String getAutor()
    {
        return autor;
    };

    public void setNumerPozycji(int numerpozycji)
    {
        this.numerpozycji = numerpozycji;
    };

    public int getNumerPozycji()
    {
        return numerpozycji;
    };

    public void setCena(int cena)
    {
        this.cena = cena;
    };

    public int getCena ()
    {
        return cena;
    };

    public void setDataWydania(Date datawydania)
    {
        this.datawydania = datawydania;
    };

    public void setStatusDostepny(boolean statusdostepny)
    {
        this.statusdostepny = statusdostepny;
    };

    public boolean getStatusDostepny()
    {
        return statusdostepny;
    }

}
