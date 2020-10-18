node{
    agent any
    stages{
        stage('SCM checkout'){
            steps{
		    echo "Checkout stage"
               git 'https://github.com/HarshithaC30/DevopsJenkins'
            }
        }
        stage('Build'){
            steps{
		    echo "Build stage"
               dir("comtest") {
	   bat "mvn clean install"
            }
		    	dir("comtest/target") {
	   bat "java -jar com.test-1.0-SNAPSHOT.jar"
       }
            post{
                success{
                    echo 'Now Archiving...build stage'
                }
            }
        }
        stage('SonarQube analysis') {
            steps{
		    echo "SonarQube analysis stage"
                withSonarQubeEnv('sonar'){
                   bat 'mvn sonar:sonar'
                }
            }
	}
        
     }
	
	
    } 
