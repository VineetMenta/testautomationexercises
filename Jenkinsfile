pipeline {
  agent any
  stages {
    stage('Branch Checkout') {
      parallel {
        stage('Checkout Vineet') {
          steps {
            git(url: 'https://github.com/VineetMenta/testautomationexercises.git', branch: 'vineet')
          }
        }

        stage('Checkout CodeReview') {
          steps {
            git(url: 'https://github.com/VineetMenta/testautomationexercises.git', branch: 'vineet-code-review')
          }
        }

      }
    }

    stage('Change Dir') {
      parallel {
        stage('Change Dir') {
          steps {
            dir(path: 'vineetpdpexcercises')
          }
        }

        stage('Change Directory') {
          steps {
            dir(path: 'vineetpdpexcercises')
          }
        }

      }
    }

    stage('Run Tests') {
      parallel {
        stage('Run Tests') {
          steps {
            bat 'mvn clean test -DsuiteXmlFile=testng.xml'
          }
        }

        stage('Build') {
          steps {
            bat 'mvn clean install -DskipTests'
          }
        }

      }
    }

  }
}