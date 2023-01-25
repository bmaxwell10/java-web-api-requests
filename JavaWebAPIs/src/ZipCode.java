public class ZipCode extends ServiceCommunicator{

    public ZipCode(String zipCode) {
        super("http://api.zippopotam.us/us/" + zipCode);
    }
}
