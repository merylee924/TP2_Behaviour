package ilisi;

import jade.core.Agent;
import jade.core.behaviours.SequentialBehaviour;


public class BehaviourAgentSeq extends Agent {
	public void setup() {
		 // Création du SequentialBehaviour
        SequentialBehaviour SequentialBeh = new SequentialBehaviour();

        // Ajout des sous-comportements généralisés
        SequentialBeh.addSubBehaviour(new GeneralBehaviour(3, "Bonjour!"));
        SequentialBeh.addSubBehaviour(new GeneralBehaviour(5, "Salam!"));
        SequentialBeh.addSubBehaviour(new GeneralBehaviour(4, "Hi there!"));

        // Ajout du SequentialBehaviour à l'agent
        addBehaviour(SequentialBeh);
	}

}
