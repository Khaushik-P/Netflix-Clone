def call(){
    sh "docker build --build-arg TMDB_V3_API_KEY=${VITE_APP_TMDB_V3_API_KEY} -t netflix ."
    sh "docker tag netflix khaushik14/netflix:latest "
    sh "docker push khaushik14/netflix:latest "
}