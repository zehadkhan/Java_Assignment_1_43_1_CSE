public class Main {
    public static void main(String[] args) {
        AudioPlayer mp3Player = new MP3Player();
        mp3Player.play();
        mp3Player.pause();
        mp3Player.stop();

        AudioPlayer wavPlayer = new WAVPlayer();
        wavPlayer.play();
        wavPlayer.pause();
        wavPlayer.stop();

        AudioPlayer flacPlayer = new FLACPlayer();
        flacPlayer.play();
        flacPlayer.pause();
        flacPlayer.stop();
    }
}