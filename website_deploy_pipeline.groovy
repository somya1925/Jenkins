Jenkins Code:
pipeline {
    agent any
stages{
            stage(Preparing){
                  steps {
                        echo 'Siri: Hi, I am Siri, today I am going to deploy website for you.';
}
}
stage(Started){
                      steps {
                         echo 'Siri: Started with step 1. Completed 5%'
                         //sh 'git clone https://github.com/Pratham0911/Website.git'
                         //sh 'sudo usermod -a -G docker jenkins'
}              
}
stage(Clone_Done){
    steps {
        echo 'Siri: Making things get work by Docker. Completed 10%';
        sh 'docker pull pratham0911/mariawebsite:latest'
        sh 'docker images'
    }
}
stage(Deploying){
    steps {
        echo 'Siri: Everything going perfect, now deploying the website. Completed 80%';
        sh 'docker run -itd -p 80:80 pratham0911/mariawebsite'
    }
}
stage(Completed){
    steps {
        echo 'Siri: Hi, Check now its completed';
        sh 'docker ps'
    }
}
}
}
