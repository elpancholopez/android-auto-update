android-auto-update
===================


Android app update checker,download and install apk API 8+


#### 1.How to use the library####

Provide two kinds of version check mode, you can add the following code in your project

- Dialog
   
    	`UpdateChecker.checkForDialog(this);`

- Notification

	`UpdateChecker.checkForNotification(this);`



#### 2. Add the permissions ####

- Permission to add to access the network

	`<uses-permission android:name="android.permission.INTERNET" />`

- Adding write SDCard permissions (optional, non-essential)

	`<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />`


#### 3.Use of open-source projects and reference ####



1. [android-styled-dialogs](https://github.com/inmite/android-styled-dialogs "https://github.com/inmite/android-styled-dialogs") 使用该项目，可以在api 8+上显示 holo 风格的对话框，其它选择
，当然你也可以使用其它的开源项目比如：[ActionBarSherlock](https://github.com/JakeWharton/ActionBarSherlock "https://github.com/JakeWharton/ActionBarSherlock") 和 [HoloEverywhere](https://github.com/Prototik/HoloEverywhere "https://github.com/Prototik/HoloEverywhere")


2. [UpdateChecker](https://github.com/rampo/UpdateChecker "https://github.com/rampo/UpdateChecker") 该项目检查的是google play上的应用，如果有更新打开google Play,不提供下载apk的功能

 
