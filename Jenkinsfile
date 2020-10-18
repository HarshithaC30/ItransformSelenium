node {
	stage ('SCM checkout'){
		git "https://github.com/HarshithaC30/ItransformSelenium"
		}
	stage ('Build'){
    	dir("comtest") {
	   bat "mvn clean install"
       }
       	dir("comtest/target") {
	   bat "java -jar com.test-1.0-SNAPSHOT.jar"
       }
		}
}
