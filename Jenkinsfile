node {
	stage ('SCM checkout'){
		git "https://github.com/HarshithaC30/ItransformSelenium"
		}
	stage ('Build'){
		echo " START Build stage..."
    	dir("comtest") {
	   bat "mvn clean install"
       }
       	dir("comtest/target") {
	   bat "java -jar com.test-1.0-SNAPSHOT.jar"
       }
		echo "END of build stage"
		}
}
