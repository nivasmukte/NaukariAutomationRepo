pipeline {
    agent any
    
    // environment {
    //     // Define any necessary environment variables here
    //     MAVEN_HOME = tool name: 'Maven 3.8.8', type: 'Tool'  // Specify Maven version
    // }
    tools{
        maven 'Maven 3.8.8'
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the repository code from Git
                git url: 'https://github.com/nivasmukte/NaukariAutomationRepo.git', branch: 'master'
            }
        }

        stage('Compile') {
            steps {
                script {
                    // Compile the project using Maven
                    sh "${MAVEN_HOME}/bin/mvn clean compile"
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Run unit tests using Maven
                    sh "${MAVEN_HOME}/bin/mvn test"
                }
            }
        }

        stage('Package') {
            steps {
                script {
                    // Package the application into a JAR/WAR file
                    sh "${MAVEN_HOME}/bin/mvn package"
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // Deploy the packaged application (example with Maven deploy)
                    // Replace this with your actual deploy commands, e.g., deploying to a remote server, AWS, etc.
                    sh "${MAVEN_HOME}/bin/mvn deploy"
                }
            }
        }
    }

    post {
        success {
            echo 'Build completed successfully!'
        }
        failure {
            echo 'Build failed.'
        }
        always {
            cleanWs()  // Clean workspace after build
        }
    }
}
