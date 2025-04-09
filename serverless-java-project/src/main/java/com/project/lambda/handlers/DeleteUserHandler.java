package com.project.lambda.handlers;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import java.util.HashMap;
import java.util.Map;

/**
 * Gestionnaire Lambda pour supprimer un utilisateur.
 * Implémente l'interface RequestHandler pour traiter les requêtes entrantes.
 */
public class DeleteUserHandler implements RequestHandler<Map<String, Object>, Map<String, Object>> {


    public Map<String, Object> handleRequest(Map<String, Object> input, Context context) {
        Map<String, Object> response = new HashMap<>();

        response.put("message", "Utilisateur supprimé!");

        response.put("userId", input.get("userId"));

        return response;
    }
}