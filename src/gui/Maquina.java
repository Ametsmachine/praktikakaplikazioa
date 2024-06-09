package gui;


public abstract class Maquina {
    private String id;
    private String izena;
    private String arriskuak;
    private String produktuKimikoak;
    private String segurtasunEkipamenduak;
    private String sortutakoHondakinak;
    private String atalak;

    public Maquina(String id, String izena, String arriskuak, String produktuKimikoak,
                   String segurtasunEkipamenduak, String sortutakoHondakinak, String atalak) {
        this.id = id;
        this.izena = izena;
        this.arriskuak = arriskuak;
        this.produktuKimikoak = produktuKimikoak;
        this.segurtasunEkipamenduak = segurtasunEkipamenduak;
        this.sortutakoHondakinak = sortutakoHondakinak;
        this.atalak = atalak;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public String getArriskuak() {
        return arriskuak;
    }

    public void setArriskuak(String arriskuak) {
        this.arriskuak = arriskuak;
    }

    public String getProduktuKimikoak() {
        return produktuKimikoak;
    }

    public void setProduktuKimikoak(String produktuKimikoak) {
        this.produktuKimikoak = produktuKimikoak;
    }

    public String getSegurtasunEkipamenduak() {
        return segurtasunEkipamenduak;
    }

    public void setSegurtasunEkipamenduak(String segurtasunEkipamenduak) {
        this.segurtasunEkipamenduak = segurtasunEkipamenduak;
    }

    public String getSortutakoHondakinak() {
        return sortutakoHondakinak;
    }

    public void setSortutakoHondakinak(String sortutakoHondakinak) {
        this.sortutakoHondakinak = sortutakoHondakinak;
    }

    public String getAtalak() {
        return atalak;
    }

    public void setAtalak(String atalak) {
        this.atalak = atalak;
    }

    public abstract void erakutsiInformazioa();
}
