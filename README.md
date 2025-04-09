# SAD
SERVELESS APPLICATION DEPLOYMENT

# ☁️  DEMO : Serverless Java API avec Serverless Framework + Cognito + Validation JSON

## 📦 Objectif de la Démo

Créer une API REST 100% Serverless en Java 17, déployée avec **Serverless Framework**, qui :

- ✅ Permet d'ajouter, lire, supprimer un utilisateur (`POST`, `GET`, `DELETE`)
- ✅ S'intègre avec **Cognito** pour authentifier chaque appel API
- ✅ Valide le JSON d'entrée côté Lambda
- ✅ Utilise **DynamoDB** pour stocker les données

---

## 🧰 Stack utilisée

| Élément                | Technologie                         |
|------------------------|-------------------------------------|
| Code métier            | Java 17                             |
| Plateforme             | AWS Lambda                          |
| Déploiement Infra      | Déploiement via Serverless Framework          |
| Authentification       | Amazon Cognito + JWT (OAuth2)       |
| Stockage               | DynamoDB (NoSQL, serverless)        |
| API Gateway            | REST API avec authorizer Cognito    |


## ⚙️ Étapes de Déploiement

### 1. 🧱 Pré-requis

- Java 17 installé
- Maven (`mvn -v`)
- SAM CLI (`sam --version`)
- AWS CLI (`aws configure`)
- Node.js (pour tests locaux si besoin)


---

### 2. 🔒 Intégration Amazon Cognito (JWT)

#### Étapes :
1. Va sur [Cognito Console](https://console.aws.amazon.com/cognito/)
2. Crée un **User Pool**
3. Active une App Client (sans secret)
4. Note ton `UserPoolId` et `AppClientId`
5. Dans `template.yaml`, ajoute :

### 3. Déploiement
```bash
mvn clean package
sls deploy
```


## Test API :

1. Authentifie-toi via Cognito → récupère un token JWT
2. Fais un POST :
```http
POST /user
Authorization: Bearer <token>
Content-Type: application/json

{
  "userId": "abc",
  "name": "Alice",
  "email": "alice@example.com"
}
```

