package com.project.lambda.handlers;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import java.util.HashMap;
import java.util.Map;

/**
 * Gestionnaire Lambda pour créer un utilisateur.
 * Implémente l'interface RequestHandler pour traiter les requêtes entrantes.
 */
public class CreateUserHandler implements RequestHandler<Map<String, Object>, Map<String, Object>> {


    public Map<String, Object> handleRequest(Map<String, Object> input, Context context) {
        try {

            // Validation du schema JSON
            if (!input.containsKey("userId") || !input.containsKey("name") || !input.containsKey("email")) {
                return Map.of(
                        "statusCode", 400,
                        "body", "Erreur : le JSON doit contenir 'userId', 'name' et 'email'"
                );
            }

            // traitement normal..............................

            return Map.of(
                    "statusCode", 200,
                    "body", "Utilisateur créé avec succès !"
            );

        } catch (Exception e) {
            return Map.of(
                    "statusCode", 500,
                    "body", "Erreur serveur : " + e.getMessage()
            );
        }

    }
}