pipeline {
    agent { 
        node {
            label 'docker-agent-alpine'
            }
      }
      tools{
              maven 'maven-3.9.9'
          }
      options {
          buildDiscarder logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '5', numToKeepStr: '2')
      }
    stages {
        stage('Clone the repository') {
            steps {
               git url: 'https://github.com/piterrivero/music.git'
            }
        }
        stage('Build the maven code') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Deploy to tomcat') {
                steps {
                deploy adapters: [tomcat9(credentialsId: 'tomcat', path: '', url: 'http://172.18.0.4:5050')], contextPath: null, war: '**/*.war'
                     }
        }

    }
}
