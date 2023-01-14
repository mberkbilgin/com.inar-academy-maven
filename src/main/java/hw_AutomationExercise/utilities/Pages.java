package hw_AutomationExercise.utilities;


import hw_AutomationExercise.pages.*;

public class Pages {
    private HomePage homePage;
    private SignupPage signupPage;
    private LoginPage loginPage;
    private AccountCreatedPage accountCreatedPage;
    private DeleteAccountPage deleteAccountPage;
    private ContactUsPage contactUsPage;
    private TestCasePage testCasePage;
    private ProductPage productPage;
    private ProductDetailsPage productDetailsPage;
    private ViewCartPage viewCartPage;

    public Pages() {
        this.homePage = new HomePage();
        this.signupPage = new SignupPage();
        this.loginPage = new LoginPage();
        this.accountCreatedPage = new AccountCreatedPage();
        this.deleteAccountPage = new DeleteAccountPage();
        this.contactUsPage = new ContactUsPage();
        this.testCasePage = new TestCasePage();
        this.productPage = new ProductPage();
        this.productDetailsPage = new ProductDetailsPage();
        this.viewCartPage = new ViewCartPage();

    }

    public ViewCartPage getViewCartPage() {
        return viewCartPage;
    }

    public ProductPage getProductPage() {
        return productPage;
    }

    public ProductDetailsPage getProductDetailsPage() {
        return productDetailsPage;
    }

    public TestCasePage getTestCasePage() {
        return testCasePage;
    }

    public ContactUsPage getContactUsPage() {
        return contactUsPage;
    }

    public AccountCreatedPage getAccountCreatedPage() {
        return accountCreatedPage;
    }

    public DeleteAccountPage getDeleteAccountPage() {
        return deleteAccountPage;
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public SignupPage getSignupPage() {
        return signupPage;
    }

    public HomePage getHomePage() {
        return homePage;
    }
}
