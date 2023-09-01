pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

         stage('SonarQube Analysis') {
                    steps {
                        withSonarQubeEnv('sonarqube') {
                            bat 'mvn sonar:sonar'
                        }
                    }
                }

        stage('Deploy') {
            steps {
                bat 'mvn clean deploy'
            }
        }
    }
}
