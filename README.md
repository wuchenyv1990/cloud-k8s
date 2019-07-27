# cloud-k8s

demo，部署在k8s上的多个应用，包括
<li>docker镜像制作</li>
<li>k8s部署yaml</li>
<li>样例工程</li>
<br>
其中4个样例服务a、b、c、d，调用链如下：<br>

![trace](trace.jpg) 

## trace

配置"loud.k8s.x-trace-id.enabled"开启返回header里添加X-cloud-k8s-traceId，示例如下<br>
< HTTP/1.1 200 <br>
< X-cloud-k8s-traceId: 731e53bbd20376bc<br>
< Content-Type: application/json;charset=UTF-8<br>
< Transfer-Encoding: chunked<br>
< Date: Sat, 27 Jul 2019 07:56:49 GMT<br>
