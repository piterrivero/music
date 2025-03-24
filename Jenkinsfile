pipeline {
    agent any
      tools{
              maven 'maven-3.9.9'
          }
      options {
          buildDiscarder logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '5', numToKeepStr: '2')
      }
    stages {
        stage('Clone the repository') {
            steps {
               git branch: 'main', url: 'https://github.com/piterrivero/music.git'
            }
        }
        stage('Build the maven code') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Deploy to tomcat') {
                steps {
                deploy adapters: [tomcat9(credentialsId: 'tomcat', path: '', url: 'http://172.18.0.3:5050')], contextPath: 'music', war: '**/*.war'
                     }
        }

    }
}
