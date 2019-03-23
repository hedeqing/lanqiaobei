map系列的使用详情
Map的一般用法

1.声明一个Map :

Map map = new HashMap();

2 .向map中放值 ，注意： map是key-value的形式存放的，如：

map.put("sa","dd");

3 .从map中取值 :

String str = map.get("sa").toString,

结果是： str = "dd'

4 .遍历一个map,从中取得key和value :

Map m= new HashMap();

for(Object obj : map.keySet()){

Object value = map.get(obj );

}

常用操作说明

　　void clear()

　　从此映射中移除所有映射关系（可选操作）。

　　boolean containsKey(Object key)

　　如果此映射包含指定键的映射关系，则返回 true。

　　boolean containsValue(Object value)

　　如果此映射将一个或多个键映射到指定值，则返回 true。

　　Set<Map.Entry<K,V>> entrySet()

　　返回此映射中包含的映射关系的 Set 视图。

　　boolean equals(Object o)
    
　　比较指定的对象与此映射是否相等。

　　V get(Object key)

　　返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。

　　int hashCode()

　　返回此映射的哈希码值。

　　boolean isEmpty()

　　如果此映射未包含键-值映射关系，则返回 true。

　　Set<K> keySet()

　　返回此映射中包含的键的 Set 视图。

　　V put(K key, V value)

　　将指定的值与此映射中的指定键关联（可选操作）。

　　void putAll(Map<? extends K,? extends V> m)

　　从指定映射中将所有映射关系复制到此映射中（可选操作）。

　　V remove(Object key)

　　如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。

　　int size()

　　返回此映射中的键-值映射关系数。

　　Collection<V> values()

　　返回此映射中包含的值的 Collection 视图。