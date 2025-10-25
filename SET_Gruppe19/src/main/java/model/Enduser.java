package model;

public class Enduser extends Role{

    public Enduser(String userName, String password, String role) {
        super(userName, password, role);
    }

    @Override
    public void logIn() {
        super.logIn();
    }

    @Override
    public void logOut() {
        super.logOut();
    }
}
