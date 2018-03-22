package masterung.androidthai.in.th.ungreadcode.utility;

/**
 * Created by muc on 22/3/2561.
 */

public class MyConstant {

    //    About url
    private String urlGetAlluserString = "http://androidthai.in.th/mar/getAllUser.php";
    private String urlPostUserString = "http://androidthai.in.th/mar/postUser.php";

    //    About Array
    private String[] LoginString = new String[]{"id", "Name", "User", "Password"};


    public String[] getLoginString() {
        return LoginString;
    }

    public String getUrlPostUserString() {
        return urlPostUserString;
    }

    public String getUrlGetAlluserString() {
        return urlGetAlluserString;
    }
}   //Main Class
