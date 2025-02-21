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
                    bat "\"C:\\Program Files\\apache-maven-3.8.8-bin\\apache-maven-3.8.8\\bin\\mvn\" clean compile"
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Run unit tests using Maven
                    bat "\"C:\\Program Files\\apache-maven-3.8.8-bin\\apache-maven-3.8.8\\bin\\mvn\" test"
                }
            }
        }

        stage('Package') {
            steps {
                script {
                    // Package the application into a JAR/WAR file
                    bat "\"C:\\Program Files\\apache-maven-3.8.8-bin\\apache-maven-3.8.8\\bin\\mvn\" package"
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // Deploy the packaged application (example with Maven deploy)
                    // Replace this with your actual deploy commands, e.g., deploying to a remote server, AWS, etc.
                    bat "\"C:\\Program Files\\apache-maven-3.8.8-bin\\apache-maven-3.8.8\\bin\\mvn\" deploy"
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
