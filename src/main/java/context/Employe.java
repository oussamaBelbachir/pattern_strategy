package context;

import igr.CalculerIgr;

public class Employe {
    private String cin;
    private float salaireBrutMensuel;

    private CalculerIgr calculerIgrS;

    public Employe(String cin, float salaireBrutMensuel) {
        this.cin = cin;
        this.salaireBrutMensuel = salaireBrutMensuel;
    }

    public float calculerIgr(){
        return calculerIgrS.calculer(this.salaireBrutMensuel);
    }
    public float getSalaireNetMensuel(){
        float igr = this.calculerIgr();
        float salaireNetAnuel = salaireBrutMensuel*12-igr;
        return salaireNetAnuel/12;
    }

    // ===============================================================================

    public String getCin() {
        return cin;
    }

    public float getSalaireBrutMensuel() {
        return salaireBrutMensuel;
    }

    public CalculerIgr getCalculerIgrS() {
        return calculerIgrS;
    }


    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setSalaireBrutMensuel(float salaireBrutMensuel) {
        this.salaireBrutMensuel = salaireBrutMensuel;
    }

    public void setCalculerIgrS(CalculerIgr calculerIgrS) {
        this.calculerIgrS = calculerIgrS;
    }
}
