package Model;

public class Estoque {

    private int idp;
    private String nome;
    private int quantia;
    private boolean valor;

    public Estoque(int idp, String nome, int quantia, boolean valor) {
        this.idp = idp;
        this.nome = nome;
        this.quantia = quantia;
        this.valor = valor;
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantia() {
        return quantia;
    }

    public void setQuantia(int quantia) {
        this.quantia = quantia;
    }

    public boolean isValor() {
        return valor;
    }

    public void setValor(boolean valor) {
        this.valor = valor;
    }

}
