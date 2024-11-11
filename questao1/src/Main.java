public class Main {
    public static void main(String[] args) {
        // Criando a vitrola antiga
        VinylPlayer vinylPlayer = new OldVinylPlayer();
        vinylPlayer.playVinyl();

        // Criando o leitor de CDs externo
        CDPlayer cdPlayer = new ExternalCDPlayer();

        // Usando o adaptador para tocar CDs na vitrola
        VinylPlayer adaptedCDPlayer = new CDPlayerAdapter(cdPlayer);
        adaptedCDPlayer.playVinyl();  // Aqui, tocamos um CD através do adaptador
    }
}