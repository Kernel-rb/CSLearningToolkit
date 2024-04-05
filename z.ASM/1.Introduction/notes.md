# Computer Processing 

- **Computer Processing** is the process of taking an input and processing it to produce an output.
- Chips use instructions to manipulate binary data . know as machine code.
- It's represented as hexadecimal 
- We'll be locking at intel x86 chip instructions set
- Instrcution execute faster using registers
- Registers are small memory locations that are part of the CPU
- They are used to store data that is being processed
- The CPU can access the data in registers faster than data in memory
- The CPU can also perform operations on data in registers faster than data in memory
-  ADD ESP , 1C 


# Assemblers
- Microsft MASM32 and MASM64 : Microsoft Macro Assembler is an x86 assembler that uses the Intel syntax for MS-DOS and Microsoft Windows.
- MASM32 SDK project is a set of tools, headers and libraries to create 32-bit Windows applications.
- GoAsm : GoAsm is a free assembler for x86 processors. It is a fast, single pass assembler that generates code for the x86 architecture.

# Instruction Categories
- Load and store
- Computational 
- Logical
- Control flow 

# Advanced Instructions Groups 
- Advanced Encryption Standard (AES) : AES is a symmetric encryption algorithm that encrypts and decrypts data in blocks of 128 bits.
- 128-bit AES encryption is used in many applications, including secure communications and data storage.
- 256 bit and more vectors are also available


```bash
C:\masm32\bin\ml /c /coff testing.asm
C:\masm32\bin\link /subsystem:console testing.obj
```
