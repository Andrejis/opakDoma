public abstract class voda {
    public String aSladka;
    public String aSlana;

    public voda(String aSladka, String aSlana) {
        this.aSladka = aSladka;
        this.aSlana = aSlana;
    }

    public String getaSladka() {
        return aSladka;
    }

    public void setaSladka(String aSladka) {
        this.aSladka = aSladka;
    }

    public String getaSlana() {
        return aSlana;
    }

    public void setaSlana(String aSlana) {
        this.aSlana = aSlana;
    }

    public abstract void abstratknaMetoda ();

    public void vypisInfo () {
        System.out.println("Je sladka: " + this.aSladka);
        System.out.println("Je slana: " + this.aSlana);
    }








}
