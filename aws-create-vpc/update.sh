#!/bin/bash
aws cloudformation update-stack --stack-name default-vpc --template-body file:///home/xix/Projects/neocdtv/aws-examples/aws-create-vpc/template.yaml