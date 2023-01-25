public class Music extends ServiceCommunicator {

    public Music(String music) {
        super("https://itunes.apple.com/search?term="
        + music + "&limit=1");
    }
}

