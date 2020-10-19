pipeline {
    agent any
        stages {
		
		stage ('SCM checkout'){
		git "https://github.com/HarshithaC30/ItransformSelenium"
		}
            
          stage('Test ') {
            steps {
                bat "mvn clean test"
            }
        }
            
            
            
    
        stage('sonar code quality check'){
            steps{
                script{
                    withSonarQubeEnv('sonar server'){
                        bat "mvn sonar:sonar"
                        }
                    timeout(time:1 , unit: 'HOURS'){
                        def qg=waitForQualityGate()
                        if(qg.status!='OK'){
                            error "pipeline aborted due to quality gate failure: ${qg.status} "
                            
                        }
                     }
                        
                 }
               }
         }
        
        
        
        stage('Build ') {
            steps {
               bat "mvn clean package"
            }
