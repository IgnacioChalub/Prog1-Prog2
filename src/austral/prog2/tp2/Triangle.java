package austral.prog2.tp2;

//La agregacion de la clase triangulo es una relacion fuerte porque el triangulo no puede existir sin los lados

public class Triangle {

    Rectas lado1;
    Rectas lado2;
    Rectas lado3;

    public Triangle(Rectas lado1, Rectas lado2, Rectas lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public float area(){ //formula de google
        float s = perimeter()/2;
        float a = (float) Math.sqrt(s* (s-lado1.getLength()) * (s-lado2.getLength()) * (s-lado3.getLength()));
        return a;

    }

    public float perimeter(){
        float p = lado1.getLength() + lado2.getLength() + lado3.getLength();
        return p;
    }

    public boolean isScalane(){
        float l1 = lado1.getLength();
        float l2 = lado2.getLength();
        float l3 = lado3.getLength();

        if(lado1.getLength() != lado2.getLength() && lado1.getLength() != lado3.getLength() && lado2.getLength() != lado3.getLength()){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEquilateral(){
        if(lado1.getLength() == lado2.getLength() && lado1.getLength() == lado3.getLength() && lado2.getLength() != lado3.getLength()){
            return true;
        }else{
            return false;
        }
    }

    public boolean isIsoceles(){
        if(!isEquilateral() && !isScalane()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        Punto p1 = new Punto(0,0);
        Punto p2 = new Punto(2, 0);
        Punto p3 = new Punto(1,-2);

        Rectas r1 = new Rectas(p1, p2);
        Rectas r2 = new Rectas(p2,p3);
        Rectas r3 = new Rectas(p3,p1);

        Triangle t = new Triangle(r1,r2,r3);

        System.out.println(t.perimeter());
        System.out.println(t.area());
        System.out.println(t.isEquilateral());
        System.out.println(t.isScalane());
        System.out.println(t.isIsoceles());

    }

}
