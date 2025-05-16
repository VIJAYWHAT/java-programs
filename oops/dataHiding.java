package OPPS;
class bank {

    private long CurBalance = 0;

    long bank_id;
    String name;

    public long getBalance(long id) {
        
        if(this.bank_id == id){
            return CurBalance;
        }

        return -1;

    }

    void setBalance(long balance, long id) {

        if(this.bank_id == id) {
            CurBalance = CurBalance + balance;
        }
    }
}

class dataHiding {
    public static void main(String[] args) {
        bank emp = new bank();

        emp.bank_id = 12344;
        emp.name = "Vijay";

        emp.setBalance(125000, 12344);
        
        long empBalance = emp.getBalance(12344);

        System.out.println("Banker Name: " + emp.name);
        System.out.println("Bank Id: " + emp.bank_id);
        System.out.println("Bank Balance: " + empBalance);
    }
}