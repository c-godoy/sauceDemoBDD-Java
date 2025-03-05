package pages;

public class LoginPage extends BasePage {

    // Elements
    private String usernameField = "//input[@id='user-name']";
    private String passwordField = "//input[@id='password']";
    private String loginButton = "//input[@id='login-button']";
    private String websiteTitle = "//*[@id=\"inventory_filter_container\"]/div";
    private String errorMessage = "//h3[@data-test='error']";

    public LoginPage() {
        super(driver);
    }
 
    public void EnterUsername(String usernameValue){
        write(usernameField, usernameValue);
    }
    
    public void EnterPassword(String passwordValue){
        write(passwordField, passwordValue);
    }

    public void PressOnLoginButton(){
        clickElement(loginButton);
    }

    public String getWebsiteTitle(){
        return getValueText(websiteTitle);
    }

    public String getErrorMessage(){
        return getValueText(errorMessage);
    }
}
