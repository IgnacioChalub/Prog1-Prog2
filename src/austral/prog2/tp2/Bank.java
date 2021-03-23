package austral.prog2.tp2;


// la agregacion de la clase banco con sus compionetes es fuerte porque no existe un banco sin sus cuentas

public class Bank {

    BankAccount[] cuentas;

    public Bank(BankAccount[] cuentas){
        this.cuentas = cuentas;
    }

    public BankAccount searchByCBU(String CBU){
        for(int i = 0; i < cuentas.length; i++){
            if(cuentas[i].getCBU() == CBU){
                return cuentas[i];
            }
        }
        return null;
    }

    public void transferMoney(int amount, String CBU1, String CBU2){
        BankAccount a = searchByCBU(CBU1);
        BankAccount b = searchByCBU(CBU2);
        if(a == null || b == null){
            System.out.println("No existe alguna de las cuentas");
            return;
        }
        if(amount > a.getBalance()){
            System.out.println("No tiene suficiente dinero.");
            return;
        }
        a.extraer(amount);
        b.deposit(amount);
    }

    public static void main(String[] args) {
        BankAccount c1 = new BankAccount("111", 100);
        BankAccount c2 = new BankAccount("222", 200);

        BankAccount[] cuentas = {c1, c2};

        Bank banco = new Bank(cuentas);

        banco.transferMoney(50, "111","222");
        banco.transferMoney(100, "222","111");

        System.out.println(c1.getBalance());
        System.out.println(c2.getBalance());
    }


}
