### 工作笔记

- 基础组件(basic)和model通信的方式~~~一维

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

- 组件（meta)和gridmodel的通信方式~~~二维

  ```
  componentDidMount() {
          if (this.model) {
              this.model.addListener(this);
          }
      }
  componentWillMount() {
          if (this.model) {
              this.model.removeListener(this);
          }
      }
  setListenerState = (params) => {
          console.log('gw',params)
      }
  setDataSource(data){
          console.log('gw',data)
      }
  ```

  

- 合并master上的某一次commit 到其他分支 

  ```Git
  git checkout releaseitg
  git cherry-pick 62ecb3
  //如果有多次的commit需要合并，按照先后顺序依次执行，在遇到冲突时，解决冲突 重新add commit pull push 即可
  ```

- 

- 

  