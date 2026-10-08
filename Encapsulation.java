class Bankaccount{
    private int balance;

    public void setBalance(int balance){
    this.balance = balance;
}
public void getBalance(){
    return balance;
}
public static void main(String[] args){
    Bankaccount B = new Bankaccount();

    B.setBalance(50000);
    System.out.println(B.balance);
}
}