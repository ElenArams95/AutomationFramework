pipeline {
    agent {
    //Jenkins pick up the default dockerfile from my repository
        dockerfile true
    }
    stages {
        stage('build') {
            steps {
                echo 'HelloWorld!'
                echo '$myCustomEnvVariable'
            }
        }
    }
}