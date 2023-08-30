pipeline {
    agent any
<<<<<<< HEAD

=======
    
>>>>>>> 334c59484673c0a759e1d9e74f3ec72127ac6469
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

        stage('Deploy') {
            steps {
                bat 'mvn deploy'
            }
        }
    }
}
