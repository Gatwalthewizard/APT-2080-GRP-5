package AppUser;

public class UserReg extends User implements Notification,UserAuth{
    //This class handles user registration only;


    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public void setUserPassword(String userPassword) {
        super.setUserPassword(userPassword);
    }

    @Override
    public void setUserId(String userId) {
        super.setUserId(userId);
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }
}
