pipeline {
    agent any

    environment {
    SONARSERVER = "sonarserver"
    SONARSCANNER = "sonarscanner"
    }

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
                bat 'mvn test -Xmx1024m'
            }
        }

        stage('SonarQube Analysis') {
          environment {
             scannerHome = tool "${SONARSCANNER}"
          }
                            steps {
                                withSonarQubeEnv("${SONARSERVER}") {
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
