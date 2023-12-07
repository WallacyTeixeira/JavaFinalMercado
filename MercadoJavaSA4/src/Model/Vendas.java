package Model;

public class Vendas {
    private String idVenda;
    private String data;
    private boolean valor;
    private int cpf;

    public Vendas(String idVenda, String data, boolean valor, int cpf) {
        this.idVenda = idVenda;
        this.data = data;
        this.valor = valor;
        this.cpf = cpf;
    }

    public String getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(String idVenda) {
        this.idVenda = idVenda;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isValor() {
        return valor;
    }

    public void setValor(boolean valor) {
        this.valor = valor;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

}
