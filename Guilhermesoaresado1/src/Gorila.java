public class Gorila {

    // atributos!
    private static String nome;
    private String cor;
    private int idade;
    

    // construtores

    public Gorila (){

    }

    public Gorila(String nome, String cor, int idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }


    // métodos acessores!

    public static String getnome() {
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

    // ações!

    public static void comer() {

        System.out.printf("O %s está comendo!\n", getnome());

    }

    public static void andar() {

        System.out.printf("\n%s está andando!" , getnome());

        
    }

}
