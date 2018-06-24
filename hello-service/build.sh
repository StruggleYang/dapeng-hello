#!/usr/bin/env bash

mv target/hello-service docker/
docker build -t dapengsoa/hello-service:2.0.2 docker/
rm -rf docker/hello-service