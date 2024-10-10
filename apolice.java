package Apolice;

public class apolice {
    private int numero;
    private String nome;
    private int idade;
    private Sexo sexo; 
    private double valorAutomovel;

    public apolice() {}

    public apolice(int numero, String nome, int idade, Sexo sexo, double valorAutomovel) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public double getValorAutomovel() {
        return valorAutomovel;
    }

    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }

    public double calcularValor() {
        if (sexo == Sexo.MASCULINO && idade <= 25) {
            return valorAutomovel * 0.10;
        } else if (sexo == Sexo.MASCULINO && idade > 25) {
            return valorAutomovel * 0.05;
        } else if (sexo == Sexo.FEMININO) {
            return valorAutomovel * 0.02;
        }
        return 0.0;
    }

    public String imprimir() {
        return "Número: " + numero +
                "\nNome: " + nome +
                "\nIdade: " + idade +
                "\nSexo: " + sexo +
                "\nValor Automóvel: " + valorAutomovel +
                "\nValor Apólice: " + calcularValor();
    }
}
