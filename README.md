# gm-app

为自己的油猴脚本提供外部api

## 待实现功能

- 记录访问过的连接

## 数据结构

url_rec表

|字段|名称|类型|备注|
|---|---|---|---|
|id|自增主键|long||
|tid|业务号|string||
|host|首页|string||
|rurl|相对链接|string||
|title|标题|string||

url_ext表

|字段|名称|类型|备注|
|---|---|---|---|
|id|自增主键|long||
|tid|业务号|string||
|host|首页|string||
|category|分类|string||

## 架构设计

数据先写入到redis

## api

### 保存数据

### 根据标题查询

## 常见问题

暂无