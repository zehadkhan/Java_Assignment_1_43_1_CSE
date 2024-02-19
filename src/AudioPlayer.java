interface AudioPlayer {
    void play();
    void pause();
    void stop();
}

class MP3Player implements AudioPlayer {
    @Override
    public void play() {
        System.out.println("Playing MP3");
    }

    @Override
    public void pause() {
        System.out.println("Pausing MP3");
    }

    @Override
    public void stop() {
        System.out.println("Stopping MP3");
    }
}
class WAVPlayer implements AudioPlayer {
    @Override
    public void play() {
        System.out.println("Playing WAV");
    }

    @Override
    public void pause() {
        System.out.println("Pausing WAV");
    }

    @Override
    public void stop() {
        System.out.println("Stopping WAV");
    }
}

class FLACPlayer implements AudioPlayer {
    @Override
    public void play() {
        System.out.println("Playing FLAC");
    }

    @Override
    public void pause() {
        System.out.println("Pausing FLAC");
    }

    @Override
    public void stop() {
        System.out.println("Stopping FLAC");
    }
}