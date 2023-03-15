public class Carro {

    private String modelo;
    private String cor;
    private int ano;
    private String marca;
    private String chassi;
    private int velocidadeMaxima;
    private int velocidadeAtual;
    private int numeroPortas;
    private boolean temTetoSolar;
    private int numeroMarchas;
    private boolean cambioAutomatico;
    private Propietario proprietario;

    public Carro(String modelo, String cor, int ano, String marca, String chassi, int velocidadeMaxima, int numeroPortas,
                 boolean temTetoSolar, int numeroMarchas, boolean cambioAutomatico, Propietario proprietario) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.marca = marca;
        this.chassi = chassi;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
        this.numeroPortas = numeroPortas;
        this.temTetoSolar = temTetoSolar;
        this.numeroMarchas = numeroMarchas;
        this.cambioAutomatico = cambioAutomatico;
        this.proprietario = proprietario;
    }
    // getters e setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public boolean isTemTetoSolar() {
        return temTetoSolar;
    }

    public void setTemTetoSolar(boolean temTetoSolar) {
        this.temTetoSolar = temTetoSolar;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public boolean isCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    public Proprietario getProprietario() {
            return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public void acelerar(int quantidade) {
        if (this.velocidadeAtual + quantidade > this.velocidadeMaxima) {
            this.velocidadeAtual = this.velocidadeMaxima;
        } else {
            this.velocidadeAtual += quantidade;
        }
    }

    public void frear(int quantidade) {
        if (this.velocidadeAtual - quantidade < 0) {
            this.velocidadeAtual = 0;
        } else {
            this.velocidadeAtual -= quantidade;
        }
    }

    public void trocarMarcha(int marcha) {
        if (this.numeroMarchas < marcha) {
            System.out.println("Marcha inexistente");
        } else {
            System.out.println("Trocou para a marcha " + marcha);
        }
    }

    public void exibirInfo() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Cor: " + this.cor);
        System.out.println("Chassi: " + this.ch




}

