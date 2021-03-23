package austral.prog2.tp3.Ejercicio8910;

public class Check {

    int value;
    boolean disponible;

    public Check(int amount){
        value += amount;
        disponible = true;
    }

    public int getValue(){
        return  value;
    }

    public void usar(){
        if(disponible == false){
            System.out.println("Error check ya fue usado");
        }else{
            disponible = false;
        }

    }

    public static void main(String[] args) {

        CheckingAccount c1 = new CheckingAccount("1111", 100);
        c1.deposit(100);
        System.out.println(c1.getBalance()); //200

        SavingAccount c2 = new SavingAccount("5678");
        CheckingAccount c3 = new CheckingAccount("9012");

        Check check1 = c1.issueCheck(100);
        c2.depositCheck(check1);
        System.out.println(c2.getBalance()); // 100

        c3.depositCheck(check1); //error check ya fue usado

        Check check2 = c1.issueCheck(101); // le genera 1 de deuda

        System.out.println(c1.getBalance()); // 0
        System.out.println(c1.getDeuda()); // 1

        SpecialAccount c4 = new SpecialAccount("1222", 100);

        Check check3 = c4.issueCheck(100);

        c2.depositCheck(check3);

        System.out.println(c2.getBalance());// 200

        c4.getPuntos();

        Check check4= c2.issueCheck(1);
        Check check5 = c2.issueCheck(1);
        Check check6 = c2.issueCheck(1);
        Check check7 = c2.issueCheck(1); //error no pudo
        Check check8 = c2.issueCheck(1); //error no pudo

        System.out.println(c2.getBalance()); // 197














    }

}
