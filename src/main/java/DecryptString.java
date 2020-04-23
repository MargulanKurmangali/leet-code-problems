public class DecryptString {
    public String freqAlphabets(String s) {
        char[] letters = {'1', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u','v',  'w', 'x', 'y', 'z'};
        StringBuilder str = new StringBuilder();
        int i = s.length()-1;
        while(i>=0){
            if(s.charAt(i)=='#'){
                str.append(letters[Integer.parseInt(s.substring(i-2,i))]);
                i=i-3;
            }else{
                str.append(letters[Integer.parseInt(s.substring(i,i+1))]);
                i--;
            }
        }

        return str.reverse().toString();
    }

    public static void main(String[] args) {
        DecryptString decryptString = new DecryptString();
        System.out.println(decryptString.freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"));
    }
}
