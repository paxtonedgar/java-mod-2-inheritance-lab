public class Main {
    public static void main(String[] args) {
        System.out.println("Running my pet examples");
        pet basepet = new pet();
        basepet.needFood(); 
        dog pooch = new dog();
        pooch.chewSomething();
        pooch.play();
        fish nemo = new fish(); 
        nemo.exist();
    }
}
