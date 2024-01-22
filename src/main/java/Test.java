import context.Employe;
import igr.AlgeriaIgrImpl;
import igr.MarocIgrImpl;

public class Test {
    public static void main(String[] args) {
        Employe emp = new Employe("EE444",9000);
        emp.setCalculerIgrS(new MarocIgrImpl());
        System.out.println(emp.calculerIgr());
        System.out.println(emp.getSalaireNetMensuel());
    }
}
