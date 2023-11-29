def call(){
    sh 'docker run -d -p 8081:80 khaushik14/netflix:latest'
}