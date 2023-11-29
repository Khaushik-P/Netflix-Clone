def call(){
      sh 'kubectl apply -f deployment.yml'
      sh 'kubectl apply -f service.yml'
}