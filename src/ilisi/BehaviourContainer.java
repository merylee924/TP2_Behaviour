package ilisi;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;

public class BehaviourContainer {

    public static void main(String[] args) {
        try {
            // Configuration et démarrage du conteneur principal
            Runtime runtime = Runtime.instance();
            ProfileImpl profile = new ProfileImpl();
            profile.setParameter(Profile.MAIN_HOST, "localhost");
            profile.setParameter(Profile.MAIN_PORT, "1099");      
            profile.setParameter(Profile.GUI, "true");            

            // Création du conteneur principal
            AgentContainer mainContainer = runtime.createMainContainer(profile);

            AgentController behaAgent = mainContainer.createNewAgent("BehaAgentSeq", "ilisi.BehaAgentSeq", null);
            behaAgent.start();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
