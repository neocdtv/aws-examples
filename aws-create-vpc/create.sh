#!/bin/bash
aws cloudformation create-stack --stack-name default-vpc --template-body file:///home/xix/Projects/neocdtv/aws-examples/aws-create-vpc/template.yaml