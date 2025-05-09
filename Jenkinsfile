pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                // Intenta modificar los permisos del socket de Docker
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