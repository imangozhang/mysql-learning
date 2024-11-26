package zbh.combat.mysql;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JDBCTest {
    @Test
    public void TestMatcher() {
        String url = "jdbc:mysql:///teachingdb?useSSL=false";
        Pattern SCHEME_PTRN = Pattern.compile("(?<scheme>[\\w\\+:%]+).*");
        Matcher matcher = SCHEME_PTRN.matcher(url);
        System.out.println(matcher.matches());
        System.out.println(matcher.group(0));
        System.out.println(matcher.group(1));
        System.out.println(matcher.group("scheme"));
    }
}
