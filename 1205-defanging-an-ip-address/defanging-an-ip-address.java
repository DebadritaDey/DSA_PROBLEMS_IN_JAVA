class Solution {
    public String defangIPaddr(String address) {
        StringBuilder defranged = new StringBuilder();
        for(int i=0; i<address.length(); i++){
            char c = address.charAt(i);
            if( c == '.'){
                defranged.append("[.]");
            }else{
                defranged.append(c);
            }
        }
        return defranged.toString();
    }
}