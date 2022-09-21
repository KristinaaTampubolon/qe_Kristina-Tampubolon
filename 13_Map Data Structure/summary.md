# Map Data Structure

Map merupakan sturuktur yang ada di java yang dapat digunakan untuk menyimpan data di dalamnya. Data yang tersimpan di dalam map akan disimpan dalam Queue

## Method dalam Map

1. size(); int
2. isEmpty(); boolean
3. containsKey(Object): boolean
4. containsValue(Object) : boolean
5. get(Object):V
6. put(K,V) :V
7. remove(Object): V
8. putAll(Map)

## Implementasi Map

1. Map
   - HashMap
   - WeakHashMap
   - IdentifyHashMap
   - LinkedHashMao
   - EnumHashMap

#### HashMap

Merupakan implementasi map yang menggunakan algoritma struktur data hashtable

### WeakHashMap

Adalah pengimplementasian hashtable akan tetapi key dapat dihilangkan jika sudah tidak digunakan sehingga key yang tidak digunakan maka data akan hilang.

### IdentityHashMap

IdentityHashMap masih menerapkan hash table tetapi key memiliki referensi pada memori yang berbeda maka akan dianggap sebagai data yang berbeda.

### LinkedHashMap

LinkedHashMap menerapkan doubly linked list dan juga hash table sebagai struktur data di map nya.

### ImmutableMap

ImmutableMap tidak dapat diubah isinya baik ditambah atau mengubah data yang sudah ada.

## SortedMap

Link yang dapat diurutkan baik secara ascending maupun descending

1. Method pada sorted map

-. Method List

- addAll(int, Collection<? extends E>); boolean
- replaceAll(UnaryOperator<E>); void
- sort(Comparator<? super E>); void
- get(int): E
- set(int, E);
- add (int, E); void
- remove (int): E
- indexOf(Object): int
- lastIndexOf(Object) : int
- listIterator(): ListIterator

-. Navigable Map
Method-method untuk menavigasi yang lebih lengkap.
