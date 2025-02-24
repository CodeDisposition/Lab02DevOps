pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: '<https://github.com/CodeDisposition/Lab02DevOps>' // Replace with your GitHub repo URL
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Success') {
            steps {
                echo 'Build Success!'
            }
        }
    }
}