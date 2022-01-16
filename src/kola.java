public class kola extends voda{
    private String aBublinky;
    public prichute aPrichute;

    public kola(String aSladka, String aSlana, String aBublinky, prichute aPrichute) {
        super(aSladka, aSlana);
        this.aBublinky = aBublinky;
        this.aPrichute = aPrichute;
    }

    public String getaBublinky() {
        return aBublinky;
    }

    public prichute getaPrichute() {
        return aPrichute;
    }

    public void setaBublinky(String aBublinky) {
        this.aBublinky = aBublinky;
    }

    public void setaPrichute(prichute aPrichute) {
        this.aPrichute = aPrichute;
    }

    @Override
    public void vypisInfo() {
        super.vypisInfo();
        System.out.println("Je bublinkava: " + this.aBublinky);
        System.out.println("A ma prichut: " + this.aPrichute);
    }

    @Override
    public void abstratknaMetoda() {

    }




}
