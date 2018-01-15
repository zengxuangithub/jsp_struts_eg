# struts2基础实例


## mvc架构中  控制器的一部分


## 使用struts2

- 下载相关资源 .struts.org.apache 网站下载
- 选取jar包(常用jar如下) 放入WEB-INF/lib目录下
1. commons-fileupload-x-x-x.jar
2. commons-io-x.x.jar
3. commons-lang3-x.x.jar
4. freemarker-2.3.22.jar
5. javassist-3.11.0.GA.jar
6. ognl-3.0.21.jar
7. struts2-core-2.3.34.jar
8. xwork-core-2.3.34.jar
9. 

- 编写一个filter处理类继承自ActionSupport实现execute方法
- 配置struts.xml 存放于编译目录(src目录下)
```
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE struts PUBLIC
	"-//Apache Software Foundation//DTD Struts Configuration 2.3//EN"
	"http://struts.apache.org/dtds/struts-2.3.dtd">

<struts>
	
	
	<package name="default" namespace="/" extends="struts-default">
		
	
	
		<action name="timer" class="main.LoginAction">
			<result name="error">/error.jsp</result>
			<result name="success">/welcome.jsp</result>
			
		</action>
	</package>
</struts>



```

- web目录中配置filter
```
  <filter>
   <filter-name>struts2</filter-name>
   <filter-class>org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter</filter-class>
  </filter>
  <filter-mapping>
  	<filter-name>struts2</filter-name>
  	<url-pattern>/* </url-pattern>
 </filter-mapping>
```
