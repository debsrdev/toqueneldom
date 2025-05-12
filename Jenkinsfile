pipeline {
    agent any
    
    stages {
        stage('Check files') {
            steps {
                sh 'ls -l'
                sh 'cat Jenkinsfile'
            }
        }
        stage('Build') {
            steps {
                sh 'chmod 666 /var/run/docker.sock || true'
                sh 'docker build --no-cache -t toqueneldom .'
            }
        }
        stage('Run Container') {
            steps {
                sh 'docker rm -f toqueneldom || true'
                sh 'docker run -d -p 8081:80 --name toqueneldom toqueneldom'
            }
        }
    }
}
