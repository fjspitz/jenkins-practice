node {
    stage('SCM Checkout') {
        git 'https://github.com/fjspitz/jenkins-practice.git'
    }

    stage('Compile-Package') {
        sh 'mvn clean package -DskipTests'
    }
}

