package com.project.lambda.handlers;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import java.util.HashMap;
import java.util.Map;

/**
 * Gestionnaire Lambda pour récupérer les informations d'un utilisateur.
 * Implémente l'interface RequestHandler pour traiter les requêtes entrantes.
 */
public class GetUserHandler implements RequestHandler<Map<String, Object>, Map<String, Object>> {

    /**
     * Méthode principale pour gérer la requête Lambda.
     *
     * @param input   Les données d'entrée de la requête, sous forme de Map.
     *                Doit contenir une clé "userId" pour identifier l'utilisateur.
     * @param context Le contexte d'exécution de la fonction Lambda.
     * @return Une Map contenant le message de succès et l'identifiant de l'utilisateur.
     */
    public Map<String, Object> handleRequest(Map<String, Object> input, Context context) {
        // Création de la réponse sous forme de Map
        Map<String, Object> response = new HashMap<>();

        response.put("message", "Utilisateur trouvé!");

        // Ajout de l'identifiant de l'utilisateur à la réponse
        response.put("userId", input.get("userId"));

        return response;
    }
}