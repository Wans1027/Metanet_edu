package JAVA_Basic_07_Collection.bank;

public class Transaction {

    private String transactionDate;
    private String transactionTime;
    private String kind;
    private long amount;
    private long balance;

    public Transaction(String transactionDate, String transactionTime, String kind, long amount, long balance) {
        this.transactionDate = transactionDate;
        this.transactionTime = transactionTime;
        this.kind = kind;
        this.amount = amount;
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "[거래금액:" + amount + ", 잔액:" + balance + "원 /" + transactionDate + transactionTime + "]";
    }
}
