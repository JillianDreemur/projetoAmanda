public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projetor projetor;
    private SistemaDeSom sistemaDeSom;
    private Luzes luzes;


    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projetor projetor, SistemaDeSom sistemaDeSom, Luzes luzes) {
        this.dvdPlayer = dvdPlayer;
        this.projetor = projetor;
        this.sistemaDeSom = sistemaDeSom;
        this.luzes = luzes;
    }


    public void iniciarFilme(String filme) {
        System.out.println("Preparando para assistir ao filme...");
        luzes.escurecer();
        projetor.ligar();
        projetor.modoWideScreen();
        sistemaDeSom.ligar();
        sistemaDeSom.ajustarVolume(8);
        dvdPlayer.ligar();
        dvdPlayer.reproduzirFilme(filme);
        System.out.println("Filme iniciado: " + filme);
    }


    public void finalizarFilme() {
        System.out.println("Encerrando o filme e desligando o sistema...");
        dvdPlayer.desligar();
        sistemaDeSom.desligar();
        projetor.desligar();
        luzes.ligar();
        System.out.println("Sistema de home theater desligado.");
    }
}
