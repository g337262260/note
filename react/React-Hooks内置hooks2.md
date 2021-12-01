#### 1.缓存回调函数（useCallback）

​	**useCallback(fn.deps)**

```js

import React, { useState, useCallback } from 'react';

function Counter() {
  const [count, setCount] = useState(0);
  const handleIncrement = useCallback(
    () => setCount(count + 1),
    [count], // 只有当 count 发生变化时，才会重新创建回调函数
  );
  // ...
  return <button onClick={handleIncrement}>+</button>
}

```

> 如果第二个参数为[ ]，则回调函数只会创建一次

#### 2.缓存计算结果（useMemo）

​	**useMemo(fn, deps)**

```js

//...
// 使用 userMemo 缓存计算的结果
const usersToShow = useMemo(() => {
    if (!users) return null;
    return users.data.filter((user) => {
      return user.first_name.includes(searchKey));
    }
  }, [users, searchKey]);
//...
```

> 建立了一个绑定某个结果到依赖数据的关系。只有当依赖变了，这个结果才需要被重新得到

#### 3.多次渲染间共享数据（useRef）

​	**const myRefContainer = useRef(initialValue);**

- 类似于类组件的成员变量，不直接参与组件的渲染

- 保存某个 DOM 节点的引用    

  ```js
  const inputEl = useRef(null);
  <input ref={inputEl} type="text" />
  ```

#### 4.定义全局状态（useContext）

```
const value = useContext(MyContext);
const MyContext = React.createContext(initialValue);
```

>  React 的开发中，除了像 Theme、Language 等一目了然的需要全局设置的变量外，我们很少会使用 Context 来做太多数据的共享

------

个人学习记录，侵权可删

