package model;

public abstract class Role {

    protected String userName;
    protected String password;
    protected String role;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Role(String userName, String password, String role) {
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public void logIn(){
        //log inn
    }

    public void logOut(){
        //log ut
    }
}
