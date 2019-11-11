#! /bin/bash

## Author: Conan Mafnas

## Building / Cleaning the app ##

mvn clean
mvn clean install -DskipTests

cp inv-rest/target/inv-rest.jar inv-docker/rest/
cp src/main/resources/db/migration/V1__persons_table.sql inv-docker/db/

cd inv-docker

bash -c "docker-compose -f docker-compose.yml down --remove-orphans"
bash -c "docker-compose -f docker-compose.yml up --build -d inv-db"
bash -c "docker-compose -f docker-compose.yml up --build -d inv-rest"
cd -

