// Adapter Pattern
public class demo15{
    public static void main(String[] args) {
        MediaAdapter.getInstance().play(MediaType.MP3);
    }
}

enum MediaType {
    MP3,MP4
}

interface MediaPlayer{
    public void play(MediaType mt);
}

interface AdvanceMediaPlayer{
    public void playMP3();
    public void playMP4();
}

class MP3Player implements AdvanceMediaPlayer{
    @Override
    public void playMP3() {
        System.out.println("MP3 lalala");
    }
    @Override
    public void playMP4() {
        
    }
}

class MP4Player implements AdvanceMediaPlayer{
    @Override
    public void playMP4() {
        System.out.println("MP4 balabala");
    }
    @Override
    public void playMP3() {
        
    }
}

class MediaAdapter implements MediaPlayer{
    AdvanceMediaPlayer amp;
    private static final MediaAdapter instance = new MediaAdapter();
    public static MediaAdapter getInstance(){
        return instance;
    }
    @Override
    public void play(MediaType mt) {
        if(mt == MediaType.MP3){
            amp = new MP3Player();
            amp.playMP3();
        }else if(mt == MediaType.MP4){
            amp = new MP4Player();
            amp.playMP4();
        }
    }
}

