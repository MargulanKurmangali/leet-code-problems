import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubDomainVisit {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[] full = cpdomain.split(" ");
            String[] domains = full[1].split("\\.");
            String target = "";
            Integer count = Integer.valueOf(full[0]);
            for (int i = domains.length - 1; i >= 0; --i) {
                target = domains[i] + (i < domains.length - 1 ? "." : "") + target;
                map.put(target, map.getOrDefault(target, 0) + count);
            }
        }
        List<String> res = new ArrayList<>();
        for (String s : map.keySet()) {
            res.add(map.get(s) + " " + s);
        }

        return res;
    }

    public static void main(String[] args) {
        SubDomainVisit subDomainVisit = new SubDomainVisit();
        String[] p = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        subDomainVisit.subdomainVisits(p);
    }
}
