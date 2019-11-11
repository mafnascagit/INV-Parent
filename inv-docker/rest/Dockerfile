FROM openjdk:11

COPY ./inv-rest.jar /inv-rest.jar
COPY ./create-local-services.sh /create-local-services.sh

RUN chmod 777 ./create-local-services.sh

ENTRYPOINT [ "/create-local-services.sh" ]