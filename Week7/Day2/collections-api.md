# Collection API
When you hear someone talk about the Collection API in java they are talking about the most common data structures you might see in Java code. We will be focusing on three of these structures: Lists, Sets, and Maps. NOTE: Maps are included in this conversation, but they function quite differently from Lists and Sets, just keep that in mind.

### Lists
Lists are probably the most common data structures you will see in Java: they are the most flexible, and even with that flexbility they are decently efficient when it comes to memory use and speed of operations. There are three main things to keep in mind when working with lists:
- List preserve the order of entry for any elements they hold
- Lists are indexable: you can use index positions to determine what element you want to look at/interact with in a list
    - indexing starts at 0
- Lists allow duplicate elements to exist in them

### Sets
Sets are a very useful tool when you need to filter your data: these data structures are not typically used for regular data storage, because it is not as easy to access the data within a Set. There are three things to keep in mind when it comes to Sets
- Sets do not typically maintain order of entry
- Sets only allow unique elements: no duplicates are stored
- Not indexable

### Maps
Maps are collections of key/value pairs that are typically grouped in the conversation with Collection data structures despite not sharing any interfaces or shared implementation classes.
- Maps work in key/value pairs
    - keys should be unique
    - null should not be used as a key
- Maps are NOT iterable by themsleves