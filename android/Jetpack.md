### Jetpack
- lifecycle   生命周期 
  继承LifeCycleObserver  通过注解使想要的方法在对应的生命周期里执行

- viewModel   管理传递数据
  处理sqlite 或者是发起网络请求获取的数据

- liveData    数据本体

- databing    数据和视图绑定
  省去了findViewById模板代码
  > data标签下
  > variable（设置变量）
  > import （导入类）

  bindingAdapter:自定义控件属性，可方法重载，多参数重载
  observableField
  recyclerView

- Room
  > Entity  对应的实体类
  > Dao     访问数据库的方法  CRUD
  > DataBase 指定数据库  获取Dao
    
  Migration:升级数据库
  在处理数据库升级异常  fallbackToDestructiveMigration()
  Schema 文件，包含了数据库的基本信息，能清楚的知道历次数据库变更情况

- Navigation（解决fragment的管理问题）
  - 可视化的页面导航图（fragment）
  - 方便添加页面切换动画
  - 参数传递
  - Navigation Graph 、NavHostFragment 、NavController
  - Navigation UI :方便统一管理App bar
  - DeepLink
    - PendingIntent:在接收到通知的时候，直接跳转到某个页面
    - URL:手机浏览器在浏览某个网页，可以实现一个在应用内打开的功能,如果装有app则打开相应页面，没有的话，导航到应用程序的下载页面

- WorkManager（为**不需要及时完成的任务**提供一个统一的解决方案，**保证任务一定会执行**，**兼容范围广**）    

- Paging：为方便完成分页加载设计的一个组件，为几种常见的分页机制提供了统一的解决方案
  - 网络
    - PageeListAdapter  recyclerview的适配器
    - PagedList
    - DataSource
      - PositionalDataSource:适用与可从任意位置获取数据
      - PageKeyedDataSource:适用以页的方式进行请求获取数据
      - ItemKeyedDataSource:适用于下一页数据需要依赖上一页的数据中最后一个对象中的某个字段作为key的情况
  - 数据库
  - 网络-->数据库
    - BoundaryCallback

       

