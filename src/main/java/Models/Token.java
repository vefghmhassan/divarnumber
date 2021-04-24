package Models;

public class Token {
    public  String  token;
    public  boolean isExpire=false;

    public Token(String token) {
        this.token = token;

    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isExpire() {
        return isExpire;
    }

    public void setExpire(boolean expire) {
        isExpire = expire;
    }
}
