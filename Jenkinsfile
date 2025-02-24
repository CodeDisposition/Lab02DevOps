pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/CodeDisposition/Lab02DevOps'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('Success') {
            steps {
                echo 'Build Success!'
            }
        }
    }
}