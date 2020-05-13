import java.util.HashSet;
import java.util.Set;

public class UniqueEmail {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for (String email : emails) {
            String[] splitted = email.split("@");
            String a = splitted[0].replace(".", "");
            int indx = a.indexOf("+");
            if (indx != -1) {
                a = a.substring(0, indx);
            }
            uniqueEmails.add(a + "@" +splitted[1]);
        }

        return uniqueEmails.size();
    }

    public static void main(String[] args) {
        UniqueEmail email = new UniqueEmail();
        String p[] = {"test.email+alex@leetcode.com","test.email.leet+alex@code.com"};
        System.out.println(email.numUniqueEmails(p));
    }
}
