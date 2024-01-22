package igr;

public class MarocIgrImpl implements CalculerIgr {
    @Override
    public float calculer(float salaireBrutMensuel) {
        float salaireBrutAnuel = salaireBrutMensuel * 12;
        float taux = 42;
        return ((salaireBrutAnuel * taux) / 100);
    }
}
