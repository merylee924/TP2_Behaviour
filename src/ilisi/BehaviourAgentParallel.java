package ilisi;

import jade.core.Agent;
import jade.core.behaviours.ParallelBehaviour;

public class BehaviourAgentParallel extends Agent {
    public void setup() {
    	
        // Création du ParallelBehaviour
        ParallelBehaviour parallelBeh = new ParallelBehaviour();

        // Ajout des sous-comportements généralisés
        parallelBeh.addSubBehaviour(new GeneralBehaviour(3, "Bonjour!"));
        parallelBeh.addSubBehaviour(new GeneralBehaviour(5, "Salam!"));
        parallelBeh.addSubBehaviour(new GeneralBehaviour(4, "Hi there!"));

        // Ajout du ParallelBehaviour à l'agent
        addBehaviour(parallelBeh);
    }
}
