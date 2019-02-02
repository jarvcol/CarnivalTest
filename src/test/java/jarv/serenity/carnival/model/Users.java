package jarv.serenity.carnival.model;

public class Users {

    private String userName;
    private int userCode;

    public Users(String userName, int userCode)
    {
        this.userName = userName;
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }
}
