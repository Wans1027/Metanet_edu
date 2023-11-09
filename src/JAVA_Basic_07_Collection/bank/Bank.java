package JAVA_Basic_07_Collection.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;
    private int totalAccount;

    public Bank() {
        this.accounts = new ArrayList<>();
        this.totalAccount = 0;
    }

    public void addAccount(String accountNo, String name) {
        totalAccount++;
        accounts.add(new Account(accountNo, name));
    }

    public Account getAccount(String accountNo){
        for (Account account : accounts) {
            if(account.getAccountNo().equals(accountNo)){
                return account;
            }
        }
        //throw new ClassNotFoundException();
        return null;
    }
    public List<Account> getAccounts(){
        return accounts;
    }

    public List<Account> findAccounts(String name) {
        List<Account> acList = new ArrayList<>();
        for (Account account : accounts) {
            if(account.getName().equals(name)) acList.add(account);
        }
        return acList;
    }

    public int getTotalAccount() {
        return totalAccount;
    }
}
