pipeline {
    agent any
    stages {
        stage('Compile and Clean') {
            steps {

                sh "mvn clean compile"
            }
        }
        stage('Test') {
            steps {
                sh "mvn test"
            }
        }

        stage('deploy') {
            steps {
                sh "mvn package"
            }
        }
    }
}