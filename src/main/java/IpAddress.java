public class IpAddress {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
