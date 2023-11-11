package Laboratory;

public class Rational {
    private int num;
    private int den;
    private String fractie;
    public Rational(){
        this.num=0;
        this.den=1;
    }

    public Rational(int num, int den){
        this.num=num;
        this.den=den;
        this.fractie= (num/cmmdc(num, den)) + "/" + (den/cmmdc(num, den));

    }
    static int cmmdc(int a, int b){
        while (a != b) {
            if (a > b)
                a= a - b;
            else
                b= b - a;
        }

        return a;
    }
    public int get_Num(Rational a){
        return this.num;
    }
    public int get_Den(Rational a){
        return this.den;
    }
    public Rational add(Rational a, Rational b){
        int numarator;
        int numitor;
        numitor=(a.get_Den(a)*b.get_Den(b));
        numarator=(a.get_Num(a)*b.get_Den(b)+b.get_Num(b)*a.get_Den(a));
        Rational sum=new Rational(numarator, numitor);
        return sum;

    }
    public Rational sub(Rational a, Rational b){
        int numarator;
        int numitor;
        numitor = (a.get_Den(a) * b.get_Den(b));
        numarator = (a.get_Num(a) * b.get_Den(b) - b.get_Num(b) * a.get_Den(a));
        Rational sub = new Rational(numarator, numitor);
        return sub;
    }
    public Rational mult(Rational a, Rational b){
        int numarator;
        int numitor;
        numarator= (a.get_Num(a)*b.get_Num(b));
        numitor= (a.get_Den(a)*b.get_Den(b));
        Rational mult = new Rational(numarator, numitor);
        return mult;
    }
    public Rational div(Rational a, Rational b){
        int numarator;
        int numitor;
        numarator= (a.get_Num(a)*b.get_Den(b));
        numitor= (a.get_Den(a)*b.get_Num(b));
        Rational div= new Rational(numarator, numitor);
        return div;
    }
    public void inFormat(){
       System.out.println ((num/cmmdc(num, den)) + "/" + (den/cmmdc(num, den)));
    }
    public void realFormat(){
        double real=((1.0* num)/(1.0*den));
        System.out.println(real);
    }
    public static void main(String[] args) {
        Rational primul_nr= new Rational(4, 5);
        Rational al_doilea_nr = new Rational(7, 10);
        Rational al_treilea_nr= new Rational(3, 2);
        Rational suma= new Rational();
        Rational produs= new Rational();
        Rational impartire= new Rational();
        impartire=impartire.div(primul_nr, al_doilea_nr);
        produs=produs.mult(primul_nr, al_doilea_nr);
        suma=suma.add(primul_nr, al_doilea_nr);
        suma.inFormat();
        produs.inFormat();
        impartire.inFormat();
        al_treilea_nr.realFormat();


         
     }

}
