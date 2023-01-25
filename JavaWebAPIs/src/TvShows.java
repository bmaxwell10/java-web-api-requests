public class TvShows extends ServiceCommunicator {

    public TvShows(String tvShowName) {
        super("http://api.tvmaze.com/singlesearch/shows?q=" + tvShowName);
    }

}
