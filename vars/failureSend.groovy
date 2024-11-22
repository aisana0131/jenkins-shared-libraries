def call(){ 
    emailext (subject: "SUCCESSFUL: Job ${env.JOB_NAME}",
                 body: "Job ${env.JOB_NAME} with ${env.BUILD_NUMBER} has finished with failure.  This is the job: ${env.JOB_URL}.",
                   to: "toktosunovaaisana@gmail.com")
                   }