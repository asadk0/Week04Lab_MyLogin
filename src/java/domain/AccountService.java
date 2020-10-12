
package domain;

/**
 *
 * @author Asad - 759175
 */
public class AccountService {
   
    public User login(String username, String password)
    {
        if((username.equals("adam") || username.equals("betty")) && (password.equals("password")))
        {
            return new User(username, null);
        }
        return null;
    }
}
