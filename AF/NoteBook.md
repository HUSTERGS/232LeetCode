# Python

## 常见结构

> str 不可变
>
> 可用len() replace(,)

> list（元素可任意类型）list=[1,2,'adc']

```
>>> classmates.append('Adam')
>>> classmates
['Michael', 'Bob', 'Tracy', 'Adam']
在最后追加一个元素
```

```
>>> classmates.insert(1, 'Jack')
>>> classmates
['Michael', 'Jack', 'Bob', 'Tracy', 'Adam']
在制定位置插入
```

```
>>> classmates.pop()
'Adam'
>>> classmates
['Michael', 'Jack', 'Bob', 'Tracy']
```

```
>>> classmates.pop(1)
'Jack'
>>> classmates
['Michael', 'Bob', 'Tracy']
```

> tuple(元素不可变）

> dic 字典 

> > {key:value} 元素定义
> >
> > dic.get()
> >
> > dic.pop()
> >
> > 