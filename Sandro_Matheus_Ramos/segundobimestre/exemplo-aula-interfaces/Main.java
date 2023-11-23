public class Main {

    public static void main(String[] args) {
        PixCelcoinRepo celRepo = new PixCelcoinRepo();
        PixSantanderRepo sanRepo = new PixSantanderRepo();

        testeGeracao(celRepo);
        testeGeracao(sanRepo);
    }
    
    public static void testeGeracao(IPixRepository repo) {
        repo.gerarQrCode();
    }

}
