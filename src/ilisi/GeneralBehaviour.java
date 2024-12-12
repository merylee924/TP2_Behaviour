package ilisi;

import jade.core.behaviours.Behaviour;

public class GeneralBehaviour extends Behaviour {
    private int cmpt = 0;        // Compteur interne
    private int maxCount;        // Valeur maximale du compteur
    private String message;      // Message à afficher

    // Constructeur pour initialiser les valeurs
    public GeneralBehaviour(int maxCount, String message) {
        this.maxCount = maxCount;
        this.message = message;
    }

    @Override
    public void action() {
        // Affichage du message et incrémentation du compteur
        System.out.println(message);
        cmpt++;
    }

    @Override
    public boolean done() {
        // Terminer lorsque le compteur atteint la valeur maximale
        return cmpt == maxCount;
    }
}
