public class VideoPlayer {
    private PlayCodec codec;

    public VideoPlayer(PlayCodec codec) {
        this.codec = codec;
    }

    public void setCodec(PlayCodec codec) {
        this.codec = codec;
    }

    public void start() {
        codec.play();
    }

    public static void main(String[] args) {

        VideoPlayer player = new VideoPlayer(new MP4());
        player.start(); 

        player.setCodec(new WMV());
        player.start();

        player.setCodec(new AVI());
        player.start();

        player.setCodec(new MP21());
        player.start();
    }
}