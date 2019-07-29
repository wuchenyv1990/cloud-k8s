#!/bin/bash

THIS_DIR=$(dirname $(readlink -f "$0"))
mvn_repo=~/.m2/repository
prj_repo_base=${mvn_repo}/com/wuchenyv1990
prj_version=1.0-SNAPSHOT
image_version=1.0
project=("svc-a" "svc-b" "svc-c" "svc-d")

for prj in ${project[@]};do
    jar_file=${prj}-${prj_version}.jar
    release=${prj_repo_base}/${prj}/${prj_version}/${jar_file}
	cp ${release} ${THIS_DIR}/docker/${jar_file}
    docker build ${THIS_DIR}/docker/ --build-arg release_jar=${jar_file}\
		 -t ${prj}:${image_version} 
    rm ${THIS_DIR}/docker/${jar_file}
done
