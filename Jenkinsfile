 node{
stage('SCM Checkout'){
git 'https://github.com/shaikismael/testingproject'
}
stage('Compile=Package'){
def  mvnHome =tool name: 'maven-3f', type: 'maven'
sh "${mvnHome}/bin/mvn package"
}
  stage('Slack Notification'){
  slackSend baseUrl: 'https://hooks.slack.com/services/', 
   channel: '#javahomecloud', color: 'good', message: 'hi how are you', 
   tokenCredentialId: 'slack-demo', username: 'javahomecloud'
  }
}
