def call(String name){            
    emailext (subject: "SUCCESSFUL: Job ${env.JOB_NAME}",
        body: """<html> 
                     <body>
                        <p> Job ${env.JOB_NAME}  with ${env.BUILD_NUMBER} has finished succesfully </p> 
                         <p>This is the job: ${env.JOB_URL}</p>
                     </body>
                 </html>
             """, 
        to: "toktosunovaaisana@gmail.com",
        mimeType: 'text/html')

}