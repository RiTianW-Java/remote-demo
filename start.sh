docker stop remote-demo

docker rm -f remote-demo

docker rmi remote-demo

docker build --tag remote-demo `pwd`

docker logs -f remote-demo