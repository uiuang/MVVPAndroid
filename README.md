# MVVPAndroid
使用kotlin语言，用databind谢了mvvm的demo

## 首先：什么是MVVM？
MVVM是Model-View-ViewModel的简写，是有别于MVC和MVP的另一种架构模式。

相比于MVP，MVVM没有多余的回调，利用Databinding框架就可以将ViewModel中的数据绑定到UI上，从而让开发者只需要更新ViewModel中的数据，就可以改变UI。
[https://upload-images.jianshu.io/upload_images/3722695-a112b0c94ddd1404?imageMogr2/auto-orient/strip%7CimageView2/2/w/400/format/webp]
再来讲一下分别的作用
Model层：负责提供数据源给ViewModel，包含实体类，网络请求和本地存储等功能
ViewModel：将Model层提供的数据根据View层的需要进行处理，通过DataBinding绑定到相应的UI上
View：Activity、Fragment、layout.xml、Adapter、自定义View等等，负责将三者联系起来。


