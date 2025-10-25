package model;

public class Admin extends Role{

    public Admin(String userName, String password, String role) {
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
