pipeline {
  agent any
  stages {
    stage('CD and do stuff') {
      steps {
        pwd()
        dir(path: '/opt/cdJenkins') {
          pwd()
          sh 'cat file.txt'
        }
        
      }
    }
  }
}