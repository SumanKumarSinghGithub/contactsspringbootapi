// jenkins pipeline script
// pipeline with stages compile, test, package and echo message in the stages
// use maven to compile, test and package the application
// use docker to build the image and push to docker hub
// define environment variables mavenHome and dockerHome for the tools in jenkins

pipeline {
    agent any
    stages {
        stage('Compile') {
            steps {
                sh "mvn clean compile"
            }
        }
        stage('Test') {
            steps {
                sh "mvn test"
            }
        }
        stage('Build') {
            steps {
                sh "mvn package"
            }
        }
    }
}