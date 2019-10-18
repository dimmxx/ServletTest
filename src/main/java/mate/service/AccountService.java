package mate.service;

public class AccountService {

    private static AccountService accountService;

    private String message;

    private AccountService(){
        message = "accountService message";
    }

    public static AccountService getAccountService(){
        if (accountService == null){
            return new AccountService();
        }else return accountService;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
