def call(credentialsId){

    withSonarQubeEnv(credentialsId: credentialsId) {
         sh 'mvn clean package org.sonarsource.scanner.maven:sonar-maven-plugin:sonar'
    }
}
