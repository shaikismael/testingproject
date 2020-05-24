 node{
stage('SCM Checkout'){
git 'https://github.com/shaikismael/testingproject'
}
stage('Compile=Package'){
def  mvnHome =tool name: 'maven-3f', type: 'maven'
sh "${mvnHome}/bin/mvn package"
}
}
