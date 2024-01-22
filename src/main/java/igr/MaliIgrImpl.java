package igr;

public class MaliIgrImpl implements CalculerIgr {
    @Override
    public float calculer(float salaireBrutMensuel) {
        float salaireBrutAnuel = salaireBrutMensuel * 12;
        float taux = 56;
        return ((salaireBrutAnuel * taux) / 100);
    }
}
