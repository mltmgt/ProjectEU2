package Project2;

public abstract class Marks {
    abstract double getPercentage();

    double chemistry;
    double eng;
    double math;

    public Marks(double chemistry, double eng, double math) {
        this.chemistry = chemistry;
        this.eng = eng;
        this.math = math;
    }
}

class A extends Marks {


    public A(double chemistry, double eng, double math) {
        super(chemistry, eng, math);

    }

    @Override
    double getPercentage() {
        return (chemistry + eng + math) / 3;
    }
}

class B extends Marks {

    double biology;

    public B(double chemistry, double eng, double math, double biology) {
        super(chemistry, eng, math);
        this.biology = biology;
    }

    @Override
    double getPercentage() {
        return (chemistry + eng + math + biology) / 4;

    }
}

class testStudent {
    public static void main(String[] args) {
        Marks studentA = new A(22.2, 58.0, 69.0);
        System.out.println("This is the average score for student A: " + studentA.getPercentage());
        Marks studentB = new B(90.0, 76.0, 55.5, 79.0);
        System.out.println("This is the average score for student A: " + studentB.getPercentage());
    }
}
