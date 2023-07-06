def server = Artifactory.server '3.88.49.112';

def uploadSpec = """{
                "files": [{
                    "pattern": "home/ubuntu/Java_app_3.0/target/kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar",
                    "target": "example-repo-local"
                    }
                    ]
            }"""

server.upload(uploadSpec)
