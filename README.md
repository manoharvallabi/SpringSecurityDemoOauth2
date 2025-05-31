# SpringSecurityOAuth2

This project demonstrates how to integrate **OAuth2 login using Google and GitHub** in a Spring Boot application using Spring Security. It's a hands-on example for developers who want to allow users to authenticate via popular third-party identity providers instead of traditional username/password logins.

## 🔐 Features

- ✅ OAuth2 login using Google
- ✅ OAuth2 login using GitHub
- 🔁 Seamless redirection to the identity provider
- 🚫 No need to store passwords locally
- 🔒 Secure session management
- 🌐 Configurable client IDs and secrets

## 📚 What You'll Learn

- How to configure Spring Security with OAuth2 login
- How to register applications with Google and GitHub
- How OAuth2 authentication works under the hood
- How to extract user details from the OAuth2 token

## 🛠️ Tech Stack

- Java 17+
- Spring Boot 3.x
- Spring Security
- Spring Security OAuth2 Client
- Maven

## ⚙️ Setup Instructions

### 1. Register OAuth Applications

#### 👉 Google:
- Go to [Google Cloud Console](https://console.cloud.google.com/)
- Create a project and enable **Google+ API** (if required)
- Go to "OAuth consent screen", set it up
- Create OAuth2 credentials (Client ID + Secret)
- Add your redirect URI (e.g., `http://localhost:8080/login/oauth2/code/google`)

#### 👉 GitHub:
- Go to [GitHub Developer Settings](https://github.com/settings/developers)
- Register a new OAuth application
- Set the Authorization callback URL to: `http://localhost:8080/login/oauth2/code/github`

---

### 2. Configure `application.properties` or `application.yml`

```properties
spring.security.oauth2.client.registration.google.client-id=YOUR_GOOGLE_CLIENT_ID
spring.security.oauth2.client.registration.google.client-secret=YOUR_GOOGLE_CLIENT_SECRET

spring.security.oauth2.client.registration.github.client-id=YOUR_GITHUB_CLIENT_ID
spring.security.oauth2.client.registration.github.client-secret=YOUR_GITHUB_CLIENT_SECRET
```

---

### 3. Run the Application

```bash
./mvnw spring-boot:run
```

Visit: `http://localhost:8080` and click on the login provider of your choice.

---

## 📂 Project Structure

```
src
└── main
    ├── java
    │   └── com.example.springsecurityoauth2
    │       ├── controller       # Optional home or user controller
    │       └── SpringSecurityOauth2Application.java
    └── resources
        ├── application.properties
        └── templates            # Login or home pages (if using Thymeleaf)
```

## 🔐 Endpoints

- `/login` → Default login page with Google & GitHub options
- `/oauth2/authorization/google` → Triggers Google login
- `/oauth2/authorization/github` → Triggers GitHub login
- `/logout` → Logs out the current user

## 🙌 Credits

Inspired by the official Spring Security documentation and tutorials on secure authentication using third-party providers.

## 📄 License

This project is open-source and available for educational use.

---

Feel free to fork, clone, and extend it!
