### Basic Structure

```java
System.out.printf(format_string, arguments);
```

- **`format_string`**: The format specification string containing placeholders.
- **`arguments`**: The values to insert into the placeholders.

### Common Format Specifiers

| Specifier | Description                    | Example                      |
|-----------|--------------------------------|------------------------------|
| `%d`      | Integer                        | `System.out.printf("%d", 10);` → `10` |
| `%f`      | Floating-point number          | `System.out.printf("%.2f", 3.14159);` → `3.14` |
| `%c`      | Single character               | `System.out.printf("%c", 'A');` → `A` |
| `%s`      | String                         | `System.out.printf("%s", "Hello");` → `Hello` |
| `%b`      | Boolean                        | `System.out.printf("%b", true);` → `true` |
| `%n`      | Newline (platform independent) | `System.out.printf("Hello%nWorld");` |
| `%%`      | Literal percent sign           | `System.out.printf("%%");` → `%` |

### Width and Precision

You can control the width and precision of numbers:

| Syntax       | Example                          | Output          |
|--------------|----------------------------------|-----------------|
| `%5d`        | `System.out.printf("%5d", 42);`  | `   42` (right-aligned, width 5) |
| `%-5d`       | `System.out.printf("%-5d", 42);` | `42   ` (left-aligned, width 5) |
| `%10.2f`     | `System.out.printf("%10.2f", 3.14);` | `      3.14` (width 10, 2 decimal places) |
| `%8.3f`      | `System.out.printf("%8.3f", 3.14159);` | `   3.142` (width 8, rounded to 3 decimal places) |

### Flags

Flags modify alignment, padding, and sign display:

| Flag | Usage                  | Description                  | Example                                |
|------|-------------------------|------------------------------|----------------------------------------|
| `-`  | Left-align             | `%-10d`                      | Left-align within width               |
| `+`  | Show sign              | `%+d`                        | `+42` or `-42`                        |
| `0`  | Pad with leading zeros | `%04d`                       | `0042` (width 4)                      |
| `,`  | Group separator        | `%,d`                        | `1,000`                               |
| `(`  | Negative numbers in parentheses | `%(d`      | `(42)` instead of `-42`              |

### Advanced Examples

```java
System.out.printf("%-10s %d %n", "ID:", 123);            // Left-align the string "ID:"
System.out.printf("%+d %n", 42);                         // Show plus sign for positive number
System.out.printf("%06.2f %n", 3.14159);                 // Width 6, 2 decimal places, leading zeros
System.out.printf("%,.2f %n", 1234567.89);               // Group separator and 2 decimal places
System.out.printf("%(d %n", -42);                        // Show negative in parentheses
```

### Using Multiple Specifiers in One String

```java
String name = "Alice";
int age = 30;
double height = 5.678;
System.out.printf("Name: %-10s Age: %02d Height: %.2f %n", name, age, height);
// Output: "Name: Alice      Age: 30 Height: 5.68"
```

### Summary

Combine width, precision, and flags for a variety of text and number formatting possibilities!