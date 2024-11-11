### Basic Structure
```java
StringBuilder sb = new StringBuilder();
StringBuilder sb = new StringBuilder("Initial Text");
```

### Key Methods

| Method                              | Description                                          | Example                                 | Result                              |
|-------------------------------------|------------------------------------------------------|-----------------------------------------|-------------------------------------|
| **`.append(String s)`**             | Appends a string or other data type                  | `sb.append("Hello");`                   | Adds `"Hello"`                      |
| **`.insert(int offset, String s)`** | Inserts text at the specified position               | `sb.insert(5, "World");`                | Inserts `"World"` at index `5`      |
| **`.replace(int start, int end, String s)`** | Replaces substring from `start` to `end` with `s` | `sb.replace(0, 5, "Hi");`               | Replaces characters at specified range |
| **`.delete(int start, int end)`**   | Deletes characters from `start` to `end`            | `sb.delete(0, 5);`                      | Removes characters in range         |
| **`.deleteCharAt(int index)`**      | Deletes character at specified index                | `sb.deleteCharAt(0);`                   | Removes character at index `0`      |
| **`.reverse()`**                    | Reverses the entire sequence                        | `sb.reverse();`                         | Reverses all characters             |
| **`.setCharAt(int index, char ch)`** | Sets character at a specific index                  | `sb.setCharAt(0, 'A');`                 | Changes character at index `0`      |
| **`.substring(int start, int end)`** | Extracts a substring from `start` to `end`         | `sb.substring(0, 5);`                   | Returns `"Hello"` (without modifying `sb`) |
| **`.toString()`**                   | Converts `StringBuilder` to `String`                | `String str = sb.toString();`           | Converts to `String`                |
| **`.length()`**                     | Returns the current length                          | `sb.length();`                          | Returns `length`                    |
| **`.capacity()`**                   | Returns current capacity                            | `sb.capacity();`                        | Returns capacity                    |
| **`.trimToSize()`**                 | Reduces capacity to current length                  | `sb.trimToSize();`                      | Minimizes capacity                  |

### Examples

```java
StringBuilder sb = new StringBuilder("Hello");

// Append
sb.append(" World!");             // "Hello World!"

// Insert
sb.insert(5, ",");                // "Hello, World!"

// Replace
sb.replace(0, 5, "Hi");           // "Hi, World!"

// Delete
sb.delete(3, 6);                  // "Hi World!"

// Reverse
sb.reverse();                     // "!dlroW iH"

// Set Character
sb.setCharAt(0, 'h');             // "h!dlroW iH"
```

### Performance Tip
`StringBuilder` is preferred for concatenating strings in a loop due to its mutability, reducing the creation of intermediate `String` objects.

### Capacity Management
- **Initial Capacity**: `StringBuilder` starts with a default capacity of 16 characters unless specified.
- **Capacity Growth**: Automatically expands, typically doubling.
- **Trim to Size**: Use `sb.trimToSize()` to minimize the capacity after building the string.

### Conversion
```java
String result = sb.toString(); // Converts to a standard `String`
```

### Combining Multiple Methods

```java
StringBuilder sb = new StringBuilder();
sb.append("Java ").insert(5, "is ").append("fun!");
System.out.println(sb.toString()); // "Java is fun!"
``` 

This provides flexibility to build and modify strings efficiently.