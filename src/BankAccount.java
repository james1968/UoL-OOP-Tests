import java.util.ArrayList;

public class BankAccount {

    int balance;
    ArrayList<Integer> balances = new ArrayList<Integer>();

    BankAccount( int initialBalance )
    {
        balance = initialBalance;
        balances.add(initialBalance);
    }

    public int getBalance()
    {
        return balance;
    }

    public void updateBalance( int newBalance )
    {
        balance = newBalance;
        balances.add(balance);
        System.out.println(balances);
    }

    public int getMin()
    {
        int min = balances.get(0);
        for (int i : balances){

            min = min < i ? min : i;
        }
        System.out.println(min);
        return min;
    }

    public int getMax()
    {
        int max = balances.get(0);
        for (int i : balances){

            max = max > i ? max : i;
        }
        System.out.println(max);
        return max;
    }


}
