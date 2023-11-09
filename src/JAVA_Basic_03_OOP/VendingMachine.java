package JAVA_Basic_03_OOP;

public class VendingMachine {
    /*
    - 기본 자판기는 기기 일련번호와 100 만원, 20개의 음료수, 음료수의 가격은 2000원이다.
    - 일련번호를 제외한 나머지 부분은 조작 가능하다.
    - 사용자의 입력 금액에 음료 값 차액을 반환해준다.
    - 음료수가 다 떨어지거나 자판기에 남은 돈이 없다면 자판기가 종료된다.
     */
    private String deviceCode;
    private int beverageAmount;
    private int deviceMoney;
    private int beveragePrice;
    private static int uniqueCode;

    public VendingMachine(){
        this(20, 1000000, 2000);
    }
    public VendingMachine(int beverageAmount, int deviceMoney, int beveragePrice) {
        this.deviceCode = "machine" + String.valueOf(uniqueCode++);
        this.beverageAmount = beverageAmount;
        this.deviceMoney = deviceMoney;
        this.beveragePrice = beveragePrice;
    }
    public void runMachine(int inputMoney, int amount){
        int change = sendChangeToClient(inputMoney, amount);
        if(isDeviceMoneyEmpty(amount, change) || isBeverageEmpty(amount)) {
            System.out.println("자판기에 남은 돈이 없습니다. 종료합니다.");
            return;
        }
        System.out.println("음료수:"+amount+"개" + " 잔액:"+ change);
    }
    private int sendChangeToClient(int inputMoney, int amount){
        inputMoney -= beveragePrice * amount;
        return inputMoney;
    }
    private boolean isDeviceMoneyEmpty(int amount, int change){
        deviceMoney += beveragePrice * amount;
        int tmp = deviceMoney;
        deviceMoney -= change;
        if(deviceMoney < 0) {
            deviceMoney = tmp;
            return true;
        }
        return false;
    }
    private boolean isBeverageEmpty(int amount){
        beverageAmount -= amount;
        return beverageAmount < 0;
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public int getBeverageAmount() {
        return beverageAmount;
    }

    public int getBeveragePrice() {
        return beveragePrice;
    }

}

