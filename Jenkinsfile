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
           stage("Consolidated Results") {
        steps{
            input("Do u want to capture results")
            junit '**/target/surefire-reports/TEST-*.xml'
            archive 'target/*.jar'
        }
    }

    stage("Email Results") {
        steps{
            mail body: "${env.JOB_NAME} -Build #${env.BUILD_NUMBER} -${currentBuild.currentResult} \n\n Checkoutput at ${env.BUILD_URL}", subject: 'Simple Subject', to: 'nikhil.revanakar@gmail.com'
        }
    }

    
    }

}