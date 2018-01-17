pipeline {
  agent any
  stages {
    stage('CD and do stuff') {
      steps {
        sh 'pwd'
        sh 'cd /var/lib/jenkins/workspace/sProduction-BatchETL_master-KI4KS2DPNAHYENXAUXKIMEUOLEJJLZEADNHUJK6DUGL3UYL2ZBEQ && sbt clean test'
      }
    }
  }
}