# Explicit Allocation and Deallocation 
- **Explicit Allocation**: The programmer must explicitly allocate memory for an object and deallocate it when it is no longer needed.
- For example in C++ & C:
```cpp
int* p = new int;
delete p;
```
```c 
int* p = (int*)malloc(sizeof(int));
free(p);
```
- **Advantages**:
  - The programmer has full control over the memory management.
  - The programmer can allocate and deallocate memory at any time.
- **Disadvantages**:
   - Memory leaks.
   - Invalid memory access.

# Garbage Collection
- **Garbage Collection**: The process of automatically reclaiming memory that is no longer in use.( Java, C#, Python, Ruby, JavaScript, etc.)
- **Advantages**:
  - No memory leaks.
  - No invalid memory access.
- **Disadvantages**:
  - Waste of Memory.

# Ownership
- Variables are responsible for freeing the memory they own.
- **Rules**:
  - Each value is "owned" by a single variable and only one variable.
  - When the variable goes out of scope, the value is dropped.
- **Advantages**:
  - Safe
  - Efficient
- **Disadvantages** :
  - Requires an understanding of the ownership system.

