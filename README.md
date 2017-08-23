
###搭建一个mybatis,mysql,druid,slf4j的起始项目,支持不同环境

1. 能启动访问接口  ok
2. 配置druid  ok
3. 配置mysql   ok
4. 配置mybatis  ok
5. 配置slf4j  ok
6. 改造配置文件,支持不同环境  ok
7. 配置JdbcTemplate   ok
8. 支持热部署  ok
9. 支持API接口文档自动生成  ok
10. 支持单元测试  ok
11. 支持日志级别,日志输出 ok
12. druid监控 ok


### 日志输出内容元素具体如下：

* 时间日期：精确到毫秒
* 日志级别：ERROR, WARN, INFO, DEBUG or TRACE
* 进程ID
* 分隔符：--- 标识实际日志的开始
* 线程名：方括号括起来（可能会截断控制台输出）
* Logger名：通常使用源代码的类名
* 日志内容

### druid监控的地址
> http://127.0.0.1:9000/mybatisboot/druid/index.html
用户名:admin
密码:123456

> 支持SQL监控,Web应用监控,URI监控,Session监控