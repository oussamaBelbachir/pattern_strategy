package igr;

public class AlgeriaIgrImpl implements CalculerIgr {
    @Override
    public float calculer(float salaireBrutMensuel) {
        float salaireBrutAnuel = salaireBrutMensuel * 12;
        float taux = 23;
        return ((salaireBrutAnuel * taux) / 100);
    }
}
