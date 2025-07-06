class Solution {
    public String defangIPaddr(String address) {
        String nwans = address.replace(".","[.]");
        return nwans;
    }
}