pipeline{
    agent any
    stages{
        stage("run packer"){
            steps{
                sh "packer build -var 'WORDPRESS_VERSION' image.json "
            }
        }
    }
}