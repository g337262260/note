### 工作笔记

- 基础组件(basic)和model通信的方式

  ```react
  componentDidMount = () => {
          if (this.props.model)
              this.props.model.addListener(this)
  };
  
  componentWillUnmount() {
         if (this.props.model)
             this.props.model.removeListener(this)
  }
  
  setValue = (value) => {
         this.setState({
              content: value
          });
         this.getContentLength(value);
  }
  ```

  ***基础组件的父容器必须为div，否则无法在页面显示**

  ***基础组件在进行赋值的时候不能直接使用props的数据，可能在渲染的时候出现问题**

- 

- 

- 

  