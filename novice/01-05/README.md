## Design Pattern

Design pattern berfungsi untuk meminimalisir masalah/error yang terjadi dikemudian hari karena penggunan kode yang telah disesuiakan. Sehingga jika terjadi masalah/error dikemudian hari lebih bisa untuk diatasi atau diselesaikan. Hal ini juga membuat code lebih mudah dibaca dengan struktur, fungsi, dan kebiasaan-kebiasaan dalam menggunakan code dalam implementasi masalah.

### Creational Pattern

Pola desain yang lebih ditujukan kepada bentuk pembuatan kode, dimana setiap bentuk pembuatan kode memiliki desainnya tersendiri, macam-macam creational pattern adalah:

#### 1. Factory

Tipe creational pattern yang menyediakan pembuatan suatu interface di dalam object superclass, kemudian subclass dapat mengganti komposisi dari object(superclass) yang akan dibuat.

#### 2. Abstract

Tipe creational pattern yang menyediakan suatu class abstrak sebagai suatu class yang menyediakan attribut secara umum yang akan relasikan kedalam family-class dengan atribut yang konkret.

#### 3. Builder

Tipe creational pattern yang mengarahkan koders untuk membuat konstruksi kode step by step, kemudian kontruksi kode tersebut dapat diimplementasikan ke dalam berbagai tipe dan representasi object dengan hanya menggunakan 1 konstruksi kode yang sama.

#### 4. Prototype

Tipe creational pattern yang mengarahkan koders untuk membuat object tertentu dari object yang telah ada tanpa ketergantungan(dependency) terhadap object yang telah ada.

#### 5. Singleton

Tipe creational pattern yang memberikan pengalaman penggunaan dengan hanya 1 model instance, tetapi dapat diakses secara global.

### Structural Pattern

#### 1. Adapter

Tipe structural pattern yang mengijinkan suatu object interface yang tidak kompatibel untuk kolaborasi.

#### 2. Bridge

Bridge is a structural design pattern that lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.

#### 3. Composite 

is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.


#### 4. Decorator
is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.


#### 5. Facade

is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.

#### 6. Flyweight

is a structural design pattern that lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.

#### 7. Proxy

is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.



### Behavioral Pattern

#### 1. Chain of Responsibility 

is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

#### 2. Command 

is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. This transformation lets you parameterize methods with different requests, delay or queue a request’s execution, and support undoable operations.

#### 3. Iterator 

is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.).

#### 4. Mediator 

is a behavioral design pattern that lets you reduce chaotic dependencies between objects. The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.

#### 5. Memento 

is a behavioral design pattern that lets you save and restore the previous state of an object without revealing the details of its implementation.

#### 6. Observer 

is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.

#### 7. State 

is a behavioral design pattern that lets an object alter its behavior when its internal state changes. It appears as if the object changed its class.

#### 8. Strategy 

is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.

#### 9. Template Method 

is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.

#### 10. Visitor 

is a behavioral design pattern that lets you separate algorithms from the objects on which they operate.



