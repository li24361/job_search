# job_search
结合地图和爬虫爬取的信息展示工作场所位置

#### 执行sql文件夹下的sql语句
sql/job_info.sql用来存储职位信息

#### 用爬虫爬取信息
python/crawl.py
爬取拉钩职位信息，需要安装BeautifulSoup 和 MysqlDb类库
```
python crawl.py
```
#### 运行程序
```
mvn spring-boot:run
```
查看结果
