pipeline{
    agent any
    tools {
        maven 'apache-maven-3.9.0'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/teja2074/devops-automation']])
                sh 'mvn clean install'
            }
        }
        stage('Build Docker Image'){
            steps{
                script{
                    sh 'docker build -t mthokaram/devops-integration .'
                }
            }
        }
        stage('Push Image to Hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')]) {
                    sh ' docker login -u mthokaram -p ${dockerhubpwd}'
                    }

                    sh ' docker push mthokaram/devops-integration'

                }
            }
        }
    }
}