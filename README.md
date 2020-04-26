# 易校招后台管理系统--后端

脚手架创建时间:2020-01-22
## 项目采用Springboot构建
Springboot
## 项目采用技术栈 
spring、mybatis、 mybatis—plus、shiro、redis、 mysql、Druid 、Log4j、lombok
,接口自定义RSA 加密 解密 机制

## 实现基本功能
####实现了 mybatis—plus 代码生成器
 代码生成器 入口文件 CodeGenerator.java
 在设置自己的数据库连接地址
 具体设置见文件
####接口RSA加密校验
可以对任意接口的数据进行加密解密
####日志（自定义日志注解）
AOP 日志系统
使用注解式日志
日志系统包含入参，出参 ，操作用户，用户 IP ，接口请求时间，
操作模块，

####多级角色构建
多级角色构建
####省市区/县三级联动
#### Druid Monitor 数据库连接监控池
###欢迎补充



