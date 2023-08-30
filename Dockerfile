# Utiliser l'image de base Ubuntu 18.04
FROM ubuntu:18.04

# Mettre à jour le système et installer les packages nécessaires
RUN apt-get update && \
    apt-get install -y openjdk-8-jdk maven

# Définir JAVA_HOME en fonction de l'emplacement de JDK
ENV JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64

# Définir le répertoire de travail
WORKDIR /app

# Copier le contenu de votre projet dans le conteneur
COPY . /app

# Exécuter les commandes Maven ou d'autres commandes pour votre projet
CMD ["mvn", "clean", "package"]
