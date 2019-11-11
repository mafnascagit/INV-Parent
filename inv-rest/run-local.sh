#! /bin/bash

java \
  -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:7000 \
  -jar inv-rest/target/inv-rest.jar