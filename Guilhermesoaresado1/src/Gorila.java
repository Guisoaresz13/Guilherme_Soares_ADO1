public class Gorila {
    
    // atributos!
    private String nome;
    private String cor;
    private int idade;
    int passo; 
    int comer;
    
    
    // ações e construtores!

    public int andar (){
        this.passo += 1;
        return passo;
    }

    public int andar (int novoPasso){
        this.passo += novoPasso;
        return passo;
    }

    public int alimento (){
        this.comer += 1;
        return comer;
    }

    public int alimento (int comer1){
        this.comer += comer1;
        return comer;
    }

    public int getPasso() {
        return passo;
    }
    public void setPasso(int passo) {
        this.passo = passo;
    }
    public int getComer() {
        return comer;
    }
    public void setComer(int comer) {
        this.comer = comer;
    }

    // métodos acessores!

    public String getnome() {
        return nome;
    }
    public void setnome(String nome) {
        this.nome = nome;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // construtores 

    public Gorila (){
        nome = "Jean Willys";
    }

    public Gorila (String nome, String cor, int idade){
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }    

   


}
