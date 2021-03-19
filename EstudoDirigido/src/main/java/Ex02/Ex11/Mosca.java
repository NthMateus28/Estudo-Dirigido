package Ex02.Ex11;


public class Mosca {
    int qtdPatas;
    String especie;

    public Mosca(int qtdPatas, String especie) {
        this.qtdPatas = qtdPatas;
        this.especie = especie;
    }

    public Mosca() {
        }
    
    public int getQtdPatas() {
        return qtdPatas;
    }

    public void setQtdPatas(int qtdPatas) {
        this.qtdPatas = qtdPatas;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    
}
