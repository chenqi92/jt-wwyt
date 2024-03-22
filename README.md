### 文档
http://{ip}:7890/doc.html

### 数据查询页面
http://{ip}:7890/page/datasearch.html
![](https://nas.allbs.cn:9006/cloudpic/2024/03/87b6b8711aa655e787415e0489b39b70.png)

### 其他
项目得定时任务已注释，需要打开需要配置xxl-job服务端，同时放开application中注释@EnableXxlJob
项目设置了三分钟最多查询一次 通过controller中@Idempotent(expireTime = 180, info = "3分钟内最多请求一次!")实现，注释即可放开限制
接口提交得参数需要进行AES加密，加密方式见开发说明.md中
项目默认有权限过滤，会默认根据插入数据得用户筛选，造用户得时候注意下
