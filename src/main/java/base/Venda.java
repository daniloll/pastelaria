package base;

public class Venda {

    private String produto;
    private Double precoDoProduto;
    private String data;
    private String hora;

    public Venda(){
        this.produto = "";
        this.precoDoProduto = 0.0;
        this.data = "nenhuma";
        this.hora = "nenhuma";
    }

    protected Double getValorTotal(){
        Double valorTotal = 0.0;

        return valorTotal;
    }
}
