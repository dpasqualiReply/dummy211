pipeline {
  agent any
  stages {
    stage('CD and do stuff') {
      steps {
        sh 'pwd'
        dir(path: '/opt/cdJenkins/') {
          sh 'pwd'
          sh 'cat /opt/cdJenkins/file.txt'
        }
        
      }
    }
  }
}