pipeline {
    agent any 
    stages {
        stage('Cleaning stage') { 
            steps {
                bat "mvn clean"
            }
        }
        stage('Testing stage') { 
            steps {
                bat "mvn test"
            }
        }
            stage('Packaging stage') { 
        steps {
                bat "mvn package"
            }
        }
    }
    stage("Consolidated Results") {
        steps{
            input("Do u want to capture results")
            junit '**/target/surefire-reports/TEST.*.xml'
            archive 'target/*.jar'
        }
    }
}