package base;

public class Pastelaria {

    private String nome;

    public Pastelaria(String nome) {
        this.nome = nome;
    }

    protected String getNome(){
        return this.nome;
    }
}
