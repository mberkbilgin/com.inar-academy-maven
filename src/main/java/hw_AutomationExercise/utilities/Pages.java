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
    private CheckoutPage checkoutPage;
    private PaymentPage paymentPage;
    private CategoryPage_1 categoryPage1;
    private PaymentDonePage paymentDonePage;

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
        this.checkoutPage = new CheckoutPage();
        this.paymentPage = new PaymentPage();
        this.categoryPage1 = new CategoryPage_1();
        this.paymentDonePage = new PaymentDonePage();
    }

    public PaymentDonePage getPaymentDonePage() {
        return paymentDonePage;
    }

    public CategoryPage_1 getCategoryPage1() {
        return categoryPage1;
    }

    public CheckoutPage getCheckoutPage() {
        return checkoutPage;
    }

    public PaymentPage getPaymentPage() {
        return paymentPage;
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
