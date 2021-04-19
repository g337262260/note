### React


	- React  
	类似于动态的生成html页面，动态生成DOM结构
	主要涉及到的就是组件的开发，组件的嵌套，父子组件的通信已经子子组件的通信
	1. 创建组件的两种方式：声明对象或者是ES6 直接声明class对象，并且集成Component
	2.props:组件的属性，单向的不可更改的数据，主要是又父组件传递到子组件中（在左标签内声明属性，然后传入父组件中已有的值），然后子组件就可以通过this.props来使用属性值
	3.state：组件中可变的状态值，决定组件的渲染绘制 。可以通过this.state来获取状态值，并且只能通过this.setState来进行属性值的改变
	4.生命周期：每个组件都有自己的生命周期，可用来进行一些数据或者其他事件的处理，例如 componentWillMount(),componentDidMount(),render()等
	5.render:主要进行组件生成的方法 返回一个DOM结构，返回的内容就是一个标签树，具体参考html标签。其中需要注意的是：class需要用className代替，for 同样也不能使用。
	6.属性类型  propTypes,可以设置属性的类型，例如 PropTypes.object.isRequired
	7.less 样式文件
	- Redux
	主要是用来管理state数据，主要用来解决一些全局性的变量，或者是较难的子组件的通信。
	1. action ：需要用户出发的一个行为，主要形式为{type:'add',payload…},其中type为不可获取的，因为要通过type来进行state的改变操作
	2. store:全局的一个state的容器，所有使用redux进行状态存储的数据都会放入其中  
	3. reducer:作为一个纯函数而存在，进行state中值得计算，不应该在其中有其他的运算逻辑，类似于sql语句，操作效果唯一。
	4. combineReducers:统一生成一个reducer 组
	5. middleware：中间件，介于action和reducer之间的一种，用来在dispatch事件的时候，根据需求修改dispatch方法
	6.connect：react-redux 的api,主要是连接组件props和state ,dispatch和props, 使用方法为：export default connect(mapStateToProps,       mapDispatchToProps)(BankTable);


