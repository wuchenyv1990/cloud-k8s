#!/bin/bash

THIS_DIR=$(dirname "$(readlink -f "$0")")
pods=("a" "b" "c" "d")
for pod in ${pods[@]};do
    kubectl create -f "${THIS_DIR}"/k8s/svc-"${pod}"-dep.yaml
    kubectl create -f "${THIS_DIR}"/k8s/svc-"${pod}"-svc.yaml
done