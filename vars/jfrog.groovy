def server = Artifactory.server '44.203.146.99';

def uploadSpec = """{
                "files": [{
                    "pattern": "home/ubuntu/Java_app_3.0/target/kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar",
                    "target": "ui/repos/tree/General/example-repo-local"
                    }
                    ]
            }"""

server.upload(uploadSpec)
