public class App {

    public static void main(String[] args){

        Gorila animal1 = new Gorila("Jean Willys" , "Azul" , 8);
        System.out.printf("Nome do primeiro gorila: %s \n\n" , animal1.getnome());
        
        Gorila animal2 = new Gorila("Angel Romero", 
                                     "Rosão",
                                     18);
                                  
        System.out.printf("Nome do  Segundo Gorila: %s \n\n" , animal2.getnome());


            
            animal2.comer();
            
            animal2.andar();

    }
}
