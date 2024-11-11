class CDPlayerAdapter implements VinylPlayer {
    private CDPlayer cdPlayer;

    public CDPlayerAdapter(CDPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    @Override
    public void playVinyl() {
        // O adaptador redireciona a ação de tocar vinil para tocar CD
        cdPlayer.playCD();
    }
}