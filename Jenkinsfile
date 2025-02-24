pipeline {
    agent any
    tools {
        maven 'MAVEN_HOME' // Or the name you gave your Maven in Global Tool Configuration
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/CodeDisposition/Lab02DevOps' // Replace with your repo URL
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('Success') {
            steps {
                echo 'Build and package successful!'
            }
        }
    }
}