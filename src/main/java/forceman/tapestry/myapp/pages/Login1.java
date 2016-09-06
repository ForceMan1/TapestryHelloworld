package forceman.tapestry.myapp.pages;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.PasswordField;
import org.apache.tapestry5.corelib.components.TextField;

/**
 * Created by Igor on 06.09.2016.
 */
public class Login1 {
    @Persist
    @Property
    private String login;

    @Property
    private String password;

    @InjectComponent("login")
    private TextField loginField;

    @InjectComponent("password")
    private PasswordField passwordField;

    @InjectComponent("loginForm")
    private Form loginForm;

    void onValidateFromLoginForm(){
        if( login == null )
            loginForm.recordError( loginField, "Поле login должно быть заполнено");
        if ( password == null )
            loginForm.recordError( passwordField, "Поле password должно быть заполнено");

        if( login != null && password != null && !login.equals("igor") && !password.equals("12345") ) {
           loginForm.recordError(passwordField, "Invalid user name or password.");
        }
    }

    Object onSuccess(){
        return Login1.class;
    }

}
