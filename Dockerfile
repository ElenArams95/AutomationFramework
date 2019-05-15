# creates a layer from the Docker image
FROM ubuntu

# Running commands
RUN /bin/bash -c 'echo This tralala'


# Just creating variables
ENV myCustomEnvVariable = 'somethingCool'