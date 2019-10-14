# 网易云信


[![](https://jitpack.io/v/zxyUncle/zxyNeteaseIM.svg)](https://jitpack.io/#zxyUncle/zxyNeteaseIM)

Gradle
-----
Step 1    
	

     allprojects {  
		repositories {    
			...    
			maven { url 'https://jitpack.io' }     
		}    
	}    

Step 2. Add the dependency    
#####全部依赖模块   
  
        implementation 'com.github.zxyUncle:zxyNeteaseIM:Tag'
#####局部可选依赖模块    

        com.github.zxyUncle.zxyNeteaseIM:uikit:Tag      //UI 界面
        com.github.zxyUncle.zxyNeteaseIM:avchatkit:Tag  //视频聊天界面
        com.github.zxyUncle.zxyNeteaseIM:imlibrary:Tag  //总入口聊天界面
        com.github.zxyUncle.zxyNeteaseIM:filepicker:Tag //文件选择
    



##使用：

 1. 先拉取到本地
 2. 然后把依赖加入自己的项目
 3. 想要修改什么就修改本地的项目，在提交到git上去就OK

            








