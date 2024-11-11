
public class Main {
    public static void main(String[] args) {

            DVDPlayer dvdPlayer = new DVDPlayer();
            Projetor projetor = new Projetor();
            SistemaDeSom sistemaDeSom = new SistemaDeSom();
            Luzes luzes = new Luzes();

            HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projetor, sistemaDeSom, luzes);

            homeTheater.iniciarFilme("Os Vingadores Guerra Infinita");
            System.out.println("---------------------------------------------------------------------");

            homeTheater.finalizarFilme();
        }
    }
