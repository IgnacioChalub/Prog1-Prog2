package austral.prog2.tp1;

public class Fraction {

    float fraccion;

    public Fraction(float fraccion){
        this.fraccion = fraccion;
    }

    public float asFloat(){
        return fraccion;
    }

    public void add(Fraction f){
        fraccion += f.asFloat();
    }

    public void sub(Fraction f){
        fraccion -= f.asFloat();
    }

    public void add(int number){
        fraccion += number;
    }

    public void mul(Fraction f){
        fraccion = fraccion * f.asFloat();
    }

    public void div(Fraction f){
        fraccion = fraccion / f.asFloat();
    }

    public boolean equals(Fraction f){
        return fraccion == f.asFloat();
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction((float) 3/4);
        Fraction f2 = new Fraction((float) 2/4);


        System.out.println(f1.asFloat());
        System.out.println(f2.asFloat());

        f1.add(f2);
        f1.add(1);

        System.out.println(f1.asFloat());
        System.out.println(f2.asFloat());

        f1.div(f2);
        System.out.println(f1.asFloat());
        System.out.println(f1.equals(f2));

    }


}
