# 学习笔记
## 1 学习进度
学习git的第1天，进度：在本地搭建版本库，与github远程库链接，切进行同步。
git基本操作：
            git add $file 
            git commit -m "提交说明"
            git stats /*查看当前工作空间与版本库之间的差异*/
            git remote add origin git@github.com:CandyLiuXin/{repositoryname}.git
                /*与远程库进行关联*/
            git push -u origin master/*将本地库的所有内容push到远程库上即讲本地master分支上的所有内容push到远程库的master分支上*/
## 2 查看github上的优秀开源代码
DateX:阿里数据同步工具，用于在不同数据库之间进行数据的同步。
Maven:在从github上fork了DateX源码后像在eclipse上面运行，发现无法导入项目，查询相关问题发现该项目是由Maven构建的，导入方式:import-Maven-Existing Maven Project
Maven构建的项目特点，自动化程度高，在pox.xml中完成相关配置后，maven会将所需要的jar自动下载到$Home/.m2/repository/下

