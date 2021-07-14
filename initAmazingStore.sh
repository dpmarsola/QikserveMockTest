#!/bin/bash

cd wiremock
./start.sh

cd ..
java -jar AmazingStore-0.0.1-SNAPSHOT.jar 
